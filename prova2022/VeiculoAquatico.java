package prova2022;

public abstract class VeiculoAquatico extends Veiculo{

    private int potenciaMotor; 

    public int getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(int potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public VeiculoAquatico(String d, int a, double v) {
        super(d, a, v);
    }

    public abstract double calcularPrecoDeVenda();
}
