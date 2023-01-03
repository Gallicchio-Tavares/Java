package exceptions;
public class TestandoUmaReferenciaNula {
    public static void main(String[] args){
        Conta c = null;
        System.out.println(c.getSaldo());
    }
    // retorna o erro NullPointerException
}
