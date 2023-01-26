package PFdePOO.prova2018;

import java.util.ArrayList;
import java.util.List;

/*
 *  Implemente um método em
 *  uma classe chamada Utils com a seguinte assinatura: public static boolean existe (List x, Produto y); considere 
 *  que a lista possui objetos de diversos tipos, inclusive do tipo Produto. Escreva esse método de forma que seja 
 *  verificada a existência do objeto Produto representado por y na lista representada por x, retorne verdadeiro se 
 *  existir e falso se não existir. 
 */

public class Utils {
    public static boolean existe(List x, Produto y){
        return x.contains(y);
    }

    // NÃO É PRA CRIAR O GETLISTA, CRIANDO SÓ PRA TESTAR NA MAIN SE FUNCIONA

    public static List getLista(){
        List ex = new ArrayList<>();
        Produto p1 = new Produto("001");
        Produto p2 = new Produto("002");
        Produto p3 = new Produto("003");
        p1.setCor("amarelo");
        p2.setCor("azul");
        p3.setPreco(10);
        String s = "Bom dia";
        ex.add(p1);
        ex.add(p2);
        ex.add(p3);
        ex.add(s);
        return ex;
    }
}
