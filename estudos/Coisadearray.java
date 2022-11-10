package estudos;
import java.util.ArrayList;

public class Coisadearray {
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        String s = "GeeksforGeeks";
        char[] gfg = s.toCharArray(); // converte uma string em um conjunto de arrays
        for (int i = 0; i < gfg.length; i++) {
            System.out.println(gfg[i]);
        }

        // Custom input string
        String str = "geekss@for@geekss";
        String[] arrOfStr = str.split("@", 2); // indicar um lugar pra separar a string
  
        for (String a : arrOfStr) // for each
            System.out.println(a);

        String frase = "AHHHH ME TIRA DAQUI";
        System.out.println(frase.toLowerCase()); // deixar em letra minúscula

        frase = "socorro eu não aguento mais";
        System.out.println(frase.toUpperCase()); // deixar em letra maiúscula

        frase = "papapa     ";
        System.out.println(frase + "oi");
        System.out.println(frase.trim() + "oi"); // tira os espaços aleatórios

        String myStr1 = "Hello";
        String myStr2 = "Hello";
        String myStr3 = "Another String";
        System.out.println(myStr1.equals(myStr2)); // Returns true because they are equal
        System.out.println(myStr1.equals(myStr3)); // false
    
        int numero = 11234;
        String numStr = Integer.toString(numero); // conversão pra string
        System.out.println(numStr + 12); // concatenar
        System.out.println(numero + 12); // vai somar normalmente
    }
}
