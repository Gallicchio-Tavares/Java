package prova2022.questao3;
import java.util.Scanner;

/*
 Crie uma classe contendo o método main. Crie um array de inteiros de tamanho 20. Receba do
 console os 20 inteiros. Após receber os 20 inteiros, você deve chamar um método que vai retornar
 um novo array com os números invertidos. Esse método pode ser chamado retornaArrayInvertido e deve 
 receber como parámetro um array de inteiros. Exemplo de array inserido {1, 7, 6, 5...). Exemplo de
 array retornado -> ...5, 6, 7, 1). ( 
*/

public class Main {

    
    public static void main(String[] args){
        int[] num = new int[20];
        Scanner input = new Scanner(System.in);

        System.out.println("Insira 20 números:");
        for(int i = 0; i < num.length; i++){
            num[i] = input.nextInt();
        }

        num = retornaArrayInvertido(num);

        for(int j = 0; j < num.length; j++){
            System.out.println(num[j]);
        }

        input.close();
    }

    public static int[] retornaArrayInvertido(int[] arr){

        int j = 0;
        int[] aux = new int[20]; // aux começa do início

        for(int i = arr.length - 1; i >= 0; i--){ // arr começa do final
            aux[j] = arr[i]; // aí vou invertendo
            j++;
        }
        return aux;
    }
}
