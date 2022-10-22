package estudos;
import java.util.Scanner;

public class HelloWorld { // a classe sempre tem q começar com letra maiúscula
    static int idade;
    public static void main (String[] args){
        
        idade = 19;
        //System.out.println("Eu tenho \033[33m" + idade + "\033[m anos.");

        // tipos inteiros:
        // byte aSingleByte = 100; //  -128 até 127
        // short numPequeno = 2000; // -32768 até 32767
        // int inteiro = 1234567; // -2147483648 até 2147483647 -> PREFERÍVEL
        // long numGrande = 3456787621234567843L; // tem q botar esse L no final

        // tipos decimais:
        double aDouble = 4.21111165434534567890; // mtas casas decimais -> PREFERÍVEL
        float aFloat = 3.1459F; // tem q botar esse F no final;
        System.out.println(aFloat); // o F n vai aparecer na tela.

        // booleanos:
        // boolean isDark = true; // print: %b
        // boolean isDay = false;

        // caracteres:
        char copyright = '\u00A9'; // unicode escape sign ; print: %c   
        System.out.println(copyright);

        String nome = "Bianca";

        String formatado = String.format("Meu nome é %s e eu tenho %d anos. Meu número favorito eh %f",nome, idade, aDouble);
        System.out.println(formatado);

        Scanner sc = new Scanner(System.in);
        System.out.print("Insira um número para saber sua raíz quadrada: "); // print sem o ln pra escrever do lado da pergunta
        int num = sc.nextInt();
        double sqrt = Math.sqrt(num);
        System.out.printf(" A raíz quadrada de %d é %f", num, sqrt);
        sc.close();
    }
}
