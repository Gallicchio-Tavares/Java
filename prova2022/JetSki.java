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
        //TODO Auto-generated constructor stub
    }
    
    @Override
    public double calcularPrecoDeVenda(){ // g
        double valorDesconto = this.getValorVeiculoNovo() - ((0.03 * this.getValorVeiculoNovo()) * (2022 - getAnoFabricacao()));
        return valorDesconto;
    }
}
