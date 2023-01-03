package lista9;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Utils {
    public static boolean existe(List<Aluno>x, Aluno y){
        return x.contains(y);
    }

    public static void ordena (List<Aluno> x){
        Collections.sort(x);
    }

    // 154-3#Simba Silva#3.7#R
    // 553-2#Juju Juba#10.0#E
    // formato id, nome, notae  tipo  do Aluno

    /*
     * utilizando o ITERATOR nessa questão.
     * Considere que o conjunto recebido como argumento (conjuntoAlunos) contém Strings no 
     * seguinte formato: id#nome#nota#tipo.  Por  exemplo,  considere  os  elementos  desse  conjunto  como  
     * (154-3#Simba Silva#3.7#R, 553-2#Juju Juba#10.0#E, etc.).Esses valores representam id, nome, notae  tipo  do 
     * Aluno(AlunoRegularou AlunoEspecial).Dessa  maneira,  implemente  o  método retornaDadosde  forma  que  seja  retornado  um 
     * mapa da  seguinte  forma:os  elementos  de conjuntoAlunos devem ser percorridos, o id de cada elemento(ex: 154-3) é a chave
     * do Mapae os valores do mapa são objetos do tipo AlunoRegularou AlunoEspecial. Resumindo, você irá criarum  objeto 
     * AlunoRegular (se o último  caractere  da  string  for  R) ou AlunoEspecialrepresentandocada  elemento  em 
     * conjuntoAlunos(se  o último  caractere  da  string  for  E)  e  adicionar  ao  mapa. Caso o último caractere não seja R 
     * nem E, lance a exceção RuntimeException. Preencha também os nomes e notas dos objetos Pessoa.
     */

    public Map<String, Aluno> retornaDados(Set conjuntoAlunos){ //usar iterator
        return null;

    }
}
