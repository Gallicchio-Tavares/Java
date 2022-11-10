package prova2022;
//import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        //ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>(); // vamos criar um conjunto de veiculos.
        
        CarroDePasseio c1 = new CarroDePasseio("Skoda", 2019, 40000);
        Moto m1 = new Moto("Harley Davidson", 2015, 100000);
        Lancha l1 = new Lancha("MorningStar", 2020, 5000000);
        JetSki j1 = new JetSki("AAAAAA", 2022, 300000);

        System.out.println(c1);
        System.out.println(m1.toString());
        System.out.println(l1.toString());
        System.out.println(j1.toString());
        System.out.println("-------------------------");
        System.out.println(c1.calcularPrecoDeVenda());
        System.out.println(m1.calcularPrecoDeVenda());
        System.out.println(l1.calcularPrecoDeVenda());
        System.out.println(j1.calcularPrecoDeVenda()); // saiu esse ano então o valor continua o mesmo
        System.out.println("-------------------------");
    }
}
