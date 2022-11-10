//import java.util.Scanner;

public class Aula02{
    public static void main(String[] args){
        // precisaria fazer um array de canetas se eu quisesse imprimir o nome de todas elas...
        Caneta bic = new Caneta();
        bic.cor = "azul";
        bic.modelo = "Bic";
        bic.ponta = 0.5;
        bic.tampar();

        bic.status();
        bic.rabiscar();
        
        Caneta c2 = new Caneta();
        c2.cor = "preta";
        c2.modelo = "Staedtler";
        //c2.ponta = 0.7;
        c2.tampada = false;

        c2.status();
        c2.rabiscar();
    }
}
