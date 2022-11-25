package HashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class HashMapMain {
    public static void main(String[] args){
        // A HashMap stores items in "key/value" pairs, and you can access them by an index of another type (e.g. a String).
        HashMap<String, String> x = new HashMap<String, String>();
        // <chave,valor>
        x.put("Mario", "1327");
        x.put("Amanda", "444");
        x.put("Luana", "444");
        System.out.println(x.get("Luana")); // vai mostrar 444

        HashMap<String, Aluno> escola = new HashMap<String, Aluno>();
        List alunos = getAlunos();
        Iterator it = alunos.iterator(); // iterator com os alunos da lista
        while(it.hasNext()){
            String s = (String)it.next(); // s vai ser um dos elementos da lista pra eu poder mexer
            String [] A = s.split("#"); // vou dividir a string a partir da hashtag
            escola.put(A[0], new Aluno(A[0], Double.parseDouble(A[1]))); // agora preciso colocar a matricula e a NF na escola.
            System.out.println(A[0] + " " + A[1]); // partes divididas
        }
        System.out.println("A média das notas finais dos alunos é " + getMedia(escola));

        // chave = matrícula ; valor = objeto tipo Aluno
    }

    public static List getAlunos(){
        ArrayList<String> x = new ArrayList<String>();
        x.add("mat32#8"); // matricula#notaFinal
        x.add("mat27#9");

        return x;
    }

    // calcular a média dos alunos
    public static double getMedia(HashMap<String, Aluno> escola){
        double soma = 0;
        Collection c = escola.values(); // ao inves de Collection pode usar Set
        Iterator it = c.iterator();
        while(it.hasNext()){
            Aluno o = (Aluno)it.next();
            soma += o.getNotaFinal();
        }
        return soma/escola.values().size();
    }
}
