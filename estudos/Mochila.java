package estudos;

public class Mochila {
    private String cor;
    private int anoFabricacao;

    public int getAnoFabricacao() { // gets e sets
        return anoFabricacao;
    }
    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public void status(){
        System.out.println("Cor da mochila: " + this.cor);
        System.out.println("Ano em que foi fabricada: " + this.anoFabricacao);
    }

}
