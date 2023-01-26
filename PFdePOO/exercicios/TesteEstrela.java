package PFdePOO.exercicios;

public class TesteEstrela {
    public static void main(String[] args){
        Estrela v1 = new Estrela();

        v1.setNome("Sol");

        Estrela v2 = new Estrela();

        Estrela v3 = new Estrela();

        v2.setNome("Antares");

        teste1(v1, v2); // funciona

        System.out.println(v1.getNome()); // Rigel OK

        System.out.println(v2.getNome()); // Sirius (????)

        int x = 81;

        v1.p1 = 11;

        v1.p1 = v2.p1; // v1.p1 recebe 1

        System.out.println(x); // 81, n mexeu em nada OK

        teste2(v1.p1, x, v1); //mandou 1, 81 e o v1 ; 

        System.out.println(v1.getNome()); // Canopus OK

        System.out.println(x); // 81, não teve como mudar a var OK

        System.out.println(v1.p1); // 1, não teve como mudar a var OK

        System.out.println(v1.p2); // 33 OK

        teste3(v2); // nao vai mudar nada pq o retorno n cai em uma variavel

        System.out.println(v2.getNome()); // continua Sirius

        System.out.println(v2.p1); // 1

        v3 = teste3(v2); // modificou

        v3.setNome("Altair"); // modificou dnv

        System.out.println(v2.getNome()); // Sirius dnv
  }

  public static void teste1(Estrela v1, Estrela v2) {
    v2.setNome("Sirius");
    v2 = v1; 
    v2.setNome("Rigel");
    v1 = v2;
  }

  public static void teste2(int x, int a, Estrela arv) {
    a = 12;               //    1     81          v1
    x = 18;
    arv.setNome("Canopus"); // modifica OK
    arv = new Estrela(); // abaixo não modifica
    arv.p1 = 46;
    arv.p2 = 33; // mudou pq p2 é static
  }

  public static Estrela teste3(Estrela v2) {
    v2 = new Estrela();
    v2.setNome("Vega");
    return v2;
  }
}

