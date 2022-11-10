package estudos;

// parseint serve pra transformar string em número inteiro

public class Parseint {  
    public static void main(String[] args) {  
        int decimalExample = Integer.parseInt("20");  
        int signedPositiveExample = Integer.parseInt("+20");  
        int signedNegativeExample = Integer.parseInt("-20");  

        System.out.println("Value = " + decimalExample);  
        System.out.println("Value = " + signedPositiveExample);  
        System.out.println("Value = " + signedNegativeExample);

        String s="200";    
        int i=Integer.parseInt(s);    
        System.out.println(s+100);//200100 because + is string concatenation operator    
        System.out.println(i+100);//300 because + is binary plus operator

        String palavra = "10.65";
        double num = Double.parseDouble(palavra); // transformei a string em double
        System.out.println(palavra + 100); // aqui vai só concatenar
        System.out.println(num + 100.35); // aqui soma os números
    }  
}  