package estudos;
import java.util.Scanner;

public class Operacoes {
    public static void main(String[] args){
        boolean func = true;  
        Scanner sc = new Scanner(System.in);
        while(func == true){
            System.out.print("Insira o primeiro número: "); 
            double num1 = sc.nextDouble();
            System.out.print("Insira o segundo número: ");
            double num2 = sc.nextDouble();
            System.out.print("Qual operação quer realizar? [+ - x :] "); // print sem o ln pra escrever do lado da pergunta
            char op = sc.next().charAt(0);
            

            if(op == '+'){
                System.out.printf("%f + %f = %f\n", num1, num2, (num1 + num2));
            } else if(op == '-'){
                System.out.printf("%f - %f = %f\n", num1, num2, (num1 - num2));
            } else if(op == 'x'){
                System.out.printf("%f x %f = %f\n", num1, num2, (num1 * num2));
            } else if(op == ':'){
                System.out.printf("%f : %f = %f\n", num1, num2, (num1 / num2));
            } else{
                System.out.println("Operação inválida\n");
                func = false;
            }
        }      
        
        sc.close();
    }
    
}
