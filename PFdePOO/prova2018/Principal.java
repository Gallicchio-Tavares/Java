package PFdePOO.prova2018;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Iterator;

/*
 *  Crie uma classe principal que receba do console o id de um produto. Em seguida, verifique, com base no código 
 *  desenvolvido no item B, se o produto existe na lista retornada por Utils.getLista(). Caso sim, exiba no console
 *  uma mensagem informando o id, cor e preço do produto
 */

 /*
  *  crie um método denominado transformaListEmMap (List k): Map<String, Produto> que receba uma lista k de objetos 
  *  (de diversos tipos, incluindo produtos) e retorna um mapa de produtos, contendo apenas os objetos do tipo Produto 
  *  na lista representada por k. Considere a chave do mapa como o id dos produtos. Utilize o Iterator nessa questão
  */

  /*
   * Dado o mapa retornado no item D2, crie um método (na classe principal) transformaMap (Map<String, Produto> m): 
   * Produto [] que receba um mapa e retorne um array contendo os OBJETOS Produto presentes no mapa.
   */

public class Principal {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o id de um produto:");
        String meuId = sc.nextLine();

        Produto p = new Produto(meuId);
        List x = Utils.getLista();

        if(x.contains(p)){
            Produto z = (Produto) x.get(x.indexOf(p));
            System.out.println(z);
        } else{
           System.out.println("Não existe produto com esse id."); 
        }

        Map<String, Produto> y = transformaListEmMap(x);
        y.forEach((key, value) -> System.out.println(key + " - " + value)); // imprimir um mapa

        Produto[] exemplo = transformaMap(y);
        for(int i = 0; i < exemplo.length; i++){
            System.out.println(exemplo[i]);
        }

        sc.close();
    }

    public static Map<String, Produto> transformaListEmMap(List k){
        Map<String, Produto> mapa = new HashMap<>();
        Iterator it = k.iterator();
        while(it.hasNext()){
            Object ob = it.next();
            if(ob instanceof Produto){
                Produto p = (Produto)ob;
                mapa.put(p.getId(), p);
            }
        }
        return mapa; // retorna um mapa só de produtos
    }

    public static Produto[] transformaMap(Map<String, Produto> m){
        // preciso pegar os values
        Produto[] p = m.values().toArray(new Produto[0]);
        return p;
    }
}
