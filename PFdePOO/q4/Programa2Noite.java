package PFdePOO.q4;

public class Programa2Noite {
    public static void main(String[] args) {
        Panela p = new Panela();
        p.setCor("amarelo");
        Panela p2 = new Panela();
        p2.setCor("preto");
        p2.setQuantidade(101);
        metodoA(p);
        System.out.println(p.getCor()); // azul
        System.out.println(p.getQuantidade()); // 10
        metodoB(p2, p);
        System.out.println(p.getCor()); // preto
        System.out.println(p2.getCor()); // rosa
        int i = 190;
        qqq(i); 
        System.out.println(i); // 190
        int j = 150;
        qqq3(i, j);
        System.out.println(i); // 190
        System.out.println(j); // 150
    }
    public static void metodoA (Panela p2) {
        new Panela();
        p2.setCor("azul");
        p2.setQuantidade(10);
    }
    public static void metodoB (Panela p9, Panela p10) {
       Panela p11 = p9;         //     p2         p
       p11.setQuantidade(3);
       p11.setCor("rosa");
       p9 = p10; // p2 vira p
       p10 = p11; // p vira p11
       p9.setCor("preto"); // p recebe preto como cor
    }
    public static int qqq (int i) {
        i = i + 665;
        i = 15;
        return i;
    } 
    public static void qqq3 (int j, int i) {
        int k = j;
        j = i;
        i = k;
    }
}

    
