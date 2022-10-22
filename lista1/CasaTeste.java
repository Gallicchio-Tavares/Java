package lista1;

public class CasaTeste {
    public static void main(String[] args) {
        Casa casa1 = new Casa();
        casa1.cor = "vermelha";
        casa1.numero = 42;
        Casa casa2 = new Casa();
        casa2.cor = "amarela";
        casa2.numero = 12;
        System.out.printf("A casa de número %d tem cor %s \n", casa1.numero, casa1.cor);
        System.out.printf("A casa de número %d tem cor %s \n", casa2.numero, casa2.cor);
      }
}
