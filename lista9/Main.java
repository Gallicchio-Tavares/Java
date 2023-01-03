package lista9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Aluno a1 = new Aluno("12345");
        Aluno a2 = new Aluno("12345");
        Aluno a3 = new Aluno("11111");
        Aluno a4 = new Aluno("55555");
        a1.setNome("Daniela");
        a1.setNota(9);
        a2.setNome("Lara");
        a2.setNota(7.3);
        a3.setNome("Alice");
        a3.setNota(6.5);
        a4.setNome("Helena");
        a4.setNota(7);

        ArrayList<Aluno> escola = new ArrayList<Aluno>();
        escola.add(a1);
        escola.add(a2);
        escola.add(a3);
        escola.remove(2); // removi a3 (índice 2)
        escola.add(a4);

        System.out.println(escola.get(0).getNome());
        System.out.println(Utils.existe(escola, a3)); // vai sair false
        System.out.println(escola);
        System.out.println("----------------------------------------------------");
        Utils.ordena(escola);
        System.out.println(escola);
    }
    public static List getAlunos(){
        ArrayList<String> x = new ArrayList<String>();
        x.add("154-3#Simba Silva#3.7#R"); // id#nome#nota#tipo
        x.add("553-2#Juju Juba#10.0#E");

        return x; 
    }
}
