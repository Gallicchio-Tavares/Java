package estudos;
import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args){

        //Creating a List of type String using ArrayList  
        List<String> frutas =new ArrayList<String>();  
        
        //Creating a List of type Integer using ArrayList  
        List<Integer> lista =new ArrayList<Integer>();  
        
        //Creating a List of type Mochila using ArrayList  
        List<Mochila> mochilas =new ArrayList<Mochila>();  

        frutas.add("Morango");
        frutas.add("Banana");
        frutas.add("Jaca");
        System.out.println(frutas);

        
      
    }
}
