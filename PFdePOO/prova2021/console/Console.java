package PFdePOO.prova2021.console;

import java.util.ArrayList;
import java.util.List;

public class Console {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        String x = "virgem";
        a.add(x);
        a.add(x);
        a.add(x);
        x = "aquario";
        a.add("leao");
        a.add("escorpiao");
        a.add("libra");
        int numero = 13;
        metodoA(numero);
        System.out.println(numero); // 13
        metodoC(a);
        metodoB(a);
        metodoD(a);
        System.out.println(a); // [virgem, virgem, virgem, leao, escorpiao, libra, gemeos, gemeos]
        int i = 0;
        metodoE(i);
        System.out.println(i); // 0
        /*
         *  int y = i++;
            int j = 0;
            int z = ++j;
            System.out.println(y + " " + z);
         */
        
    }

    public static int metodoA (int numero) {
        numero = 11;
        System.out.println(numero); // 11
        return numero;
    }

    public static void metodoB (List<String> c) {
        c.add("gemeos");
    }

    public static void metodoC (List<String> a) {
        a = new ArrayList<>();
        a.add("virgem");
    }

    public static void metodoD (List<String> c) {
        metodoB(c);
        metodoC(c);
    }
    
    public static void metodoE (int numero) {
        ++numero; //
        numero++;
    }
}