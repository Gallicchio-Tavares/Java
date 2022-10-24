package estudos;
//import java.util.Scanner;

public class Arrays {

    
    public static void main(String[] args){
        
        int[] num = new int[5];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        num[3] = 4;
        num[4] = 5;
        for(int i = 0; i < num.length; i++){
            System.out.println(num[i]);
        }

        String[] nomes = {"Luz", "Gus", "Hunter"};
        // imprimindo usando o for each:
        for(String i: nomes){
            System.out.println(i); //resolve o problema do .lenght 
        }

        // criar arrays com objetos:
        Comida[] geladeira = new Comida[3]; // cabem 3 alimentos na geladeira

        Comida alimento1 = new Comida("Pizza");
        Comida alimento2 = new Comida("Sorvete");
        Comida alimento3 = new Comida("Arroz");

        geladeira[0] = alimento1;
        geladeira[1] = alimento2;
        geladeira[2] = alimento3;

        System.out.println(geladeira[0].nome);
    }
}
