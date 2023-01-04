package HashMap;

import java.util.HashMap;

public class PessoasMain {
    public static void main(String[] args){
        //primeiro: criar 3 pessoas
        Pessoa p1 = new Pessoa("Daniela", 20, "1234", "Copacabana");
        Pessoa p2 = new Pessoa("Lara", 20, "9999", "Botafogo");
        Pessoa p3 = new Pessoa("Helena", 20, "2319", "Santa Teresa");
        //segundo: transformar o cpf em chave
        HashMap<String, Pessoa> x = new HashMap<String, Pessoa>();
        x.put(p1.getCpf(), p1);
        x.put(p2.getCpf(), p2);
        x.put(p3.getCpf(), p3);
        //terceiro: criar um buscador de pessoas com base na chave e mostrar os dados da pessoa
        //quarto e último: sobrescrever o toString pra mostrar o que eu quero
        System.out.println(buscar(x, "1234"));
    }
    public static Object buscar(HashMap map, String cpfBuscado){
        return map.get(cpfBuscado);
    }
}
