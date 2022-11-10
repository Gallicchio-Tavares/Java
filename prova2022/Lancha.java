package prova2022;

public class Lancha extends VeiculoAquatico{
    private int qtdePassageiros;

    public int getQtdePassageiros() {
        return qtdePassageiros;
    }

    public void setQtdePassageiros(int qtdePassageiros) {
        this.qtdePassageiros = qtdePassageiros;
    }

    public Lancha(String d, int a, double v) {
        super(d, a, v);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double calcularPrecoDeVenda(){ // e
        double valorDesconto = this.getValorVeiculoNovo() - ((0.05 * this.getValorVeiculoNovo()) * (2022 - getAnoFabricacao()));
        return valorDesconto;
    }
}
