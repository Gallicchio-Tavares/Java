package projetopessoas;

public class Aluno extends Pessoa{ // o aluno tb tem os atributos e métodos de uma pessoa
    private int matricula;
    private String curso;

    public void cancelarMatricula(){
        System.out.println("Matrícula será cancelada");
    }

    public String getCurso(){
        return curso;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }

    public int getMatricula(){
        return matricula;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
}