import java.util.ArrayList;
import java.util.Collections;
//import java.util.Iterator;

public class Aula2312{
    public static void main(String[] args){
        ArrayList x = new ArrayList();

        // x.add(1); // vai gerar uma exceção (ClassCastException), não consegue ordenar coisas de tipos diferentes
        // x.add("casa");
        // x.add("mesa"); // vai dar exceção nessa linha lá no while
        // x.add("bola");

        x.add(new Conta(100, "Juan"));
        x.add(new Conta(50, "Arnaldo"));

        // para eu ordenar objetos, eles precisam ser comparáveis entre eles
        // digamos que eu queira ordenar por nome (tipo String)

        System.out.println(x); // imprime desorganizado
        Collections.sort(x); // pra organizar em ordem alfabetica LISTAS
        System.out.println(x); // imprime organizado
        
    }
}