package prova2022;

public abstract class VeiculoTerrestre extends Veiculo{

    private String placa;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public VeiculoTerrestre(String d, int a, double v) {
        super(d, a, v);
    }

    public double calcularPrecoDeVenda(){
        double valorDesconto = this.getValorVeiculoNovo() -  (this.getValorVeiculoNovo() * (Concessionaria.ANO_CORRENTE - this.getAnoFabricacao()) * 0.02);
        return valorDesconto;
    }

}
