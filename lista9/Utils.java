package lista9;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class Utils{
    public static boolean existe(List<Aluno>x, Aluno y){
        return x.contains(y);
    }

    public static void ordena (List<Aluno> x){
        Collections.sort(x);
    }

    // 154-3#Simba Silva#3.7#R
    // 553-2#Juju Juba#10.0#E
    // formato id, nome, notae  tipo  do Aluno

    public static Map<String, Aluno> retornaDados(Set<String> conjuntoAlunos){ //usar iterator
        // o id vai ser a chave do mapa
        // fazer um split
        Iterator<String> it = conjuntoAlunos.iterator();
        Map<String, Aluno> sla = new HashMap<>();
        while(it.hasNext()){
            String s = it.next(); // s vai ser um dos elementos da lista pra eu poder mexer
            String [] A = s.split("#"); // vou dividir a string a partir da hashtag
            Aluno al;
            if(s.endsWith("E")){ // aluno especial a ser criado
                al = new AlunoEspecial(A[0]);
            } 
            else if(s.endsWith("R")){ // ou aluno regular vai ser criado
                al = new AlunoRegular(A[0]);
            } 
            else{ // se houver erro no input
                throw new exceptionUtils("Aluno sem tipo");
            }
            al.setNome(A[1]);
            double n = Double.parseDouble(A[2]);
            al.setNota(n);
            sla.put(A[0], al);
        }
        return sla; 
    }
}
