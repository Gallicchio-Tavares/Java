package lista9;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/*
 * O programa deverá receber do console 100  strings  no  seguinte  formato:  id#nome#nota#tipo  
 * (i.e.,  mesmo  formato  explicado  no  item  E).  Utilizando os métodos já criados, exiba no console os
 *  nomes e notas dos alunos com os nomes ordenados em ordem alfabética.
 */

/*
        x.add("154-3#Rodrick Heffley#3.7#R"); // id#nome#nota#tipo
        x.add("553-2#Carmen Sandiego#10.0#E");
        x.add("095-1#Sally Face#7.8#R");
        x.add("112-5#John Wick#9.5#E");
        x.add("666-0#Lucifer Morningstar#9.0#E");
 */

public class ProgramaPrincipal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<String, Aluno> escola = new HashMap<String, Aluno>();
        Set<String> conjuntoAlunos = new HashSet<String>();
        
        try{
            System.out.println("Insira as informações no formato id#nome#nota#tipo:");
            for(int i = 0; i < 5; i++){ // primeiro treinar com 5
                conjuntoAlunos.add(sc.nextLine());
            }
            escola = Utils.retornaDados(conjuntoAlunos);
        } catch(exceptionUtils e){
            System.out.println(e.getMessage()); // msg da exception
            e.printStackTrace(); // vai aparecer a pilha de erro
        }
        
        //Utils.ordena(escola.values());
        //TO-DO: descobrir como ordenar essa bosta de hashmap se a questão pede lista CARALHO
        System.out.println(" ");

        Collection c = escola.values();
        Iterator it = c.iterator();
        while(it.hasNext()){
            Aluno o = (Aluno)it.next();
            System.out.println(o);
        }
        
        sc.close();
    }
}
