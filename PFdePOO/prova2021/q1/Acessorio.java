package PFdePOO.prova2021.q1;

/*
 *  Essa classe terá diversas subclasses, não permita
    a criação de objetos da classe Acessorio. Essa classe possui apenas dois atributos (marca e
    preço). Utilize os tipos apropriados. Crie os gettars e setters. Crie um método chamado
    “calcularImposto“ que retorne um double. Crie esse método de maneira que todas as subclasses de
    Acessorio sejam obrigadas a implementar esse método. Crie apenas um construtor em Acessorio.
    Esse construtor deve receber a marca e o preço.
 */

 /*
  * Crie duas subclasses de Acessorio. Som e VidroEletrico. O imposto de Som é
    dado por (preço * 0.3) e o de VidroEletrico é dado por (preço * 0.2).
  */

public abstract class Acessorio {
    private String marca;
    private double preco;

    public Acessorio(String m, double p){
        this.marca = m;
        this.preco = p;
    }

    public String getMarca() {
        return marca;
    }
    public double getPreco() {
        return preco;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public abstract double calcularImposto(double p);
}
