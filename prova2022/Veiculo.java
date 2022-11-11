package prova2022;

public abstract class Veiculo {
    private String descricao;
    private int anoFabricacao;
    private double valorVeiculoNovo;

    public Veiculo(String d, int a, double v){ // b3
        this.descricao = d;
        this.anoFabricacao = a;
        this.valorVeiculoNovo = v;
    }
    
    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValorVeiculoNovo() {
        return valorVeiculoNovo;
    }

    public String toString(){ // b2
        return this.descricao + ", " + this.anoFabricacao + ", " + this.valorVeiculoNovo;
    }

    // Os veiculos terrestres calculam seu preço de venda
    // descontando 2% do valorVeiculoNovo por cada ano de uso. 
    public abstract double calcularPrecoDeVenda();
}
