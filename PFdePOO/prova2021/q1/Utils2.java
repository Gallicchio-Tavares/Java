package PFdePOO.prova2021.q1;

import java.util.*;

/*
    Crie uma classe chamada Utils2 que possua apenas um método estático sem retorno:
    imprimirCustos. Esse método receberá a lista de carros. Imprima o total do preço de todos os
    acessórios de todos os carros e o total de imposto de todos os acessórios de todos
    os carros.

    Crie um método, também em Utils2 denominado transformaListaEmMapa(List carros): Map que
    recebe uma lista de carros e retorna um mapa, em que as “chaves” são as placas dos carros e os
    “valores” são os objetos do tipo carro. Não modifique a assinatura do método. Utilize o itetator nessa
    questão
 */

public class Utils2 {
    
    public static void imprimirCustos(List<Carro> carros){
        Iterator<Carro> it = carros.iterator(); //fazer um iterator com os carros para analisar um por um
        while(it.hasNext()){
            Carro c = it.next();
            // preciso pegar o preco dos acessorios
            double preco = 0;
            double imposto = 0;
            List<Acessorio> aces = c.getAces();

            Iterator<Acessorio> it2 = aces.iterator();
            while(it2.hasNext()){
                Acessorio a = it2.next();
                preco += a.getPreco();
                imposto += a.calcularImposto(a.getPreco());
            }
            System.out.println("O preço dos acessórios de " + c.getPlaca() + " é " + preco);
            System.out.println("O valor do imposto de " + c.getPlaca() + " é " + imposto);

        }
    }

    public static Map<String, Carro> transformaListaEmMapa(List<Carro> carros){
        Iterator<Carro> it = carros.iterator();
        Map<String, Carro> conjuntoCarros = new HashMap<>();
        while(it.hasNext()){
            Carro c = it.next();
            String chave = c.getPlaca();
            conjuntoCarros.put(chave, c);
        }
        return conjuntoCarros;
    }
}
