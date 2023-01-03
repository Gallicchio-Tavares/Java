package lista9;

public class AlunoRegular extends Aluno{

    private String tipo;

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public AlunoRegular(String id) {
        super(id);
    }
    
}
