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
    }

    //@Override
    public double calcularPrecoDeVenda(){ // e
        double valorDesconto = this.getValorVeiculoNovo() - this.getValorVeiculoNovo() * (Concessionaria.ANO_CORRENTE - this.getAnoFabricacao()) * 0.05;
        return valorDesconto;
    }
}
