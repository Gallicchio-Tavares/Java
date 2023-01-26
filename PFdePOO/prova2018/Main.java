package PFdePOO.prova2018;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("001");
        Produto p2 = new Produto("001");
        Produto p3 = new Produto("003");
        Produto p4 = new Produto("004");

        System.out.println(p1.equals(p3)); // retorna false
        System.out.println(p1.equals(p2)); // retorna true
        System.out.println(p1); // funcionando OK

        List a = new ArrayList();
        a.add(p1);
        a.add(p3);
        System.out.println(Utils.existe(a, p4)); // false
        System.out.println(Utils.existe(a, p3)); // true
        System.out.println(Utils.existe(a, p2)); // retorna true pq, como p2 tem o msm id que p1, ele é considerado como se fosse o p1

    }
}
