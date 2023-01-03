package lista9;

public class AlunoEspecial extends Aluno{

    private String tipo;

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public AlunoEspecial(String id) {
        super(id);
    }
    
}
