import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AulaExtra {
    public static void main(String[]args){
        ArrayList<Object> lala = new ArrayList<Object>(); // criar um arraylist de qualquer coisa
        List<String> x = new ArrayList<String>();
        x.add("abc");
        Iterator<String> it = x.iterator(); // ajuda a reduzir a quantidade de código
        while(it.hasNext()){
            String y = it.next();
        }
        System.out.println("batata frita");
        System.out.println("Aline".compareTo("Bruna")); // o compareTo tem algo a ver com a distancia
    }
}
