package prova2022;

public class JetSki extends VeiculoTerrestre{

    private String modelo;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public JetSki(String d, int a, double v) {
        super(d, a, v);
    }
    
    //@Override
    public double calcularPrecoDeVenda(){ // g
        double valorDesconto = this.getValorVeiculoNovo() - this.getValorVeiculoNovo() * (Concessionaria.ANO_CORRENTE - this.getAnoFabricacao()) * 0.03;
        return valorDesconto;
    }
}
