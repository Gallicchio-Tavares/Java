package projetopessoas;

public class Aula09{
    public static void main(String[] args){
        //Pessoa p1 = new Pessoa(); -> n vai poder fazer isso. pessoa é uma classe abstrata
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        //p1.setNome("Luz");
        p2.setNome("Amity");
        p3.setNome("Hunter");
        p4.setNome("Gus");
    }
}
