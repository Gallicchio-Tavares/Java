import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;


public class Main {
    public static void main(String[] args){
        HashSet<String> x = new HashSet<>(); // em um conjunto não há garantia da ordem do elemento
        // contém todos os que exitem no list: contains(), etc
        x.add("casa");
        x.add("bola");
        x.add("cama");
        x.add("mesa");
        x.add("casa"); // não está sendo adicionado
        System.out.println(x.add("asa")); // vai printar true no console e incluir asa no conjunto
        System.out.println(x); // imprimir todos os elementos do hashset entre colchetes
        System.out.println("A média do tamanho das Strings é " + media(x));

    }
    // crie um metodo na main que retorna a média do tamanho das strings em um conjunto;
    public static double media(Collection x){ // colocar collection ao invés de HashSet vai funcionar tb
        // iterator te permite iterar uma coleção 
        double soma = 0;
        Iterator it = x.iterator();
        while(it.hasNext()){
            String s = (String)it.next();
            soma += s.length(); // soma = o tamanho da string em questao
        }
        return soma/x.size();
    }

    // criar um método que retorne a média do comprimento das strings que comecem com a letra c
    // if(s.startsWith("c")){soma += s.length();}
}
