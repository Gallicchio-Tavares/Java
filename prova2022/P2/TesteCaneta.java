package P2;

public class TesteCaneta {
    public static void main(String[] args) {
        Caneta c = new Caneta();
        c.setCor("rosa");
        Caneta c2 = new Caneta();
        c2.setCor("verde");
        c2.setQuantidade(3);
        Caneta c3 = new Caneta();
        c3.setCor("dourado");
        metodoCan1(c2); // cor mudou para vermelho e quantidade = 9
        metodoCan2(c3); // cor = dourado (NÃO mudou) e quantidade = 2
        metodoCan3(c); // não mudou nada: cor = rosa, quantidade = 0
        c.x = 20; // recebe 20
        c2.x = 15; // recebe 15
        c3.x = 10; // recebe 10 FINAL == TUDO Q É X FICA 10, PQ É ESTÁTICO
        System.out.println(c.x + c2.x + c3.x); // 30 -> 10 + 10 + 10
        int i = c3.getQuantidade();
        System.out.println(i); // 2
        System.out.println(c.getQuantidade()); // 0
        System.out.println(c2.getQuantidade()); // 9
        System.out.println(c3.getQuantidade()); // 2
        System.out.println(c.getCor()); // rosa
        System.out.println(c2.getCor()); // vermelho
        System.out.println(c3.getCor()); // dourado
        int y = 11; 
        c = metodoCan4(c, y);
        System.out.println(c.getCor()); // cor mudou para PRATA
        System.out.println(c.getQuantidade()); // 0 -> NÃO MUDOU
        System.out.println(c.x); // 10 -> NÃO MUDOU
        System.out.println(y); // 11 -> NÃO MUDOU
    }

    private static Caneta metodoCan4(Caneta c, int u) { // Passamos c; passamos y = 11
        c = new Caneta();
        c.setCor("prata"); 
        u = u + 15; // não faz nada, pq não vai retornar esse valor
        return c; // RETORNA, então vai modificar a cor de c na main SIM
    }

    private static void metodoCan3(Caneta c) { // não muda nada na main
        c = new Caneta();
        c.setCor("preto");
        c.setQuantidade(1);
    }

    private static void metodoCan2(Caneta c) {
        c.setQuantidade(2); // muda na main OK
        c = new Caneta();
        c.setCor("azul"); // não vai mudar lá na main
    }

    private static void metodoCan1(Caneta c) { // muda na main OK
        c.setCor("vermelho");
        c.setQuantidade(9);
        c = null;
    }
    
}
