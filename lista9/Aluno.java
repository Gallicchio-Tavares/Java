package lista9;

public class Aluno implements Comparable<Aluno>{
    private String id;
    private String nome;
    private double nota;

    public Aluno(String id){
        this.id = id;
    }

    @Override
    public String toString() {
        return this.nome + " " + this.nota + " " + this.id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }
    public String getNome() {
        return nome;
    }
    public double getNota() {
        return nota;
    }
    public String getId() {
        return id;
    }

    public int compareTo(Aluno a){
        return nome.compareTo(a.nome);
    }
}
