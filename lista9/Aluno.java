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
        return this.nome + " " + this.nota;
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
        return this.nome.compareTo(a.getNome());
    }

    public boolean equals(Object x){ // ver se são iguais
        if(x instanceof Aluno){
            Aluno al = (Aluno)x; // transformando o x num aluno pra gnt poder ler o id
            return this.id.equals(al.getId());
        } else{
            return false;
        }
    }
}
