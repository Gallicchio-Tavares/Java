package estudos;

import java.util.Scanner;

public class ExMochila {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        Mochila m1 = new Mochila();
        Mochila m2 = new Mochila();
        Mochila m3 = new Mochila();
        Mochila m4 = new Mochila(); 

        int ano; String cor;
        System.out.println("Insira ano de fabricação e cor da mochila:");
        ano = input.nextInt();
        cor = input.next();
        m1.setAnoFabricacao(ano);
        m1.setCor(cor);
        System.out.println("Insira ano de fabricação e cor da mochila:");
        ano = input.nextInt();
        cor = input.next();
        m2.setAnoFabricacao(ano);
        m2.setCor(cor);
        System.out.println("Insira ano de fabricação e cor da mochila:");
        ano = input.nextInt();
        cor = input.next();
        m3.setAnoFabricacao(ano);
        m3.setCor(cor);
        System.out.println("Insira ano de fabricação e cor da mochila:");
        ano = input.nextInt();
        cor = input.next();
        m4.setAnoFabricacao(ano);
        m4.setCor(cor);

        Mochila[] bagageiro = {m1, m2, m3, m4};
        int soma = 0, media;

        for(int i = 0; i < 4; i++)
        {
            soma += bagageiro[i].getAnoFabricacao();
        }

        media = soma/4;
        System.out.println("A média dos anos de fabricação é " + media);
        
        // a partir daqui não funciona mais...

        Mochila[] conjunto = new Mochila[4];
        for(int i = 0; i < 4; i++){
            int data = input.nextInt();
            conjunto[i].setAnoFabricacao(data); // não funciona!
        }
        for(int i = 0; i < 4; i++)
        {
            soma += conjunto[i].getAnoFabricacao();
        }

        media = soma/4;
        System.out.println("A média dos anos de fabricação é " + media);

        input.close();
    }
}
