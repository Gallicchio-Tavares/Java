package HashMap;
public class Aluno {
    private String matricula;
    private double notaFinal;

    public Aluno(String m, double nf){
        this.matricula = m;
        this.notaFinal = nf;
    }

    public String getMatricula() {
        return matricula;
    }
    public double getNotaFinal() {
        return notaFinal;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }
}
