package PFdePOO.prova2021.q1;

import java.util.List;

// UTILIZE GENERICS SEMPRE QUE POSSÍVEL NESSA QUESTÃO

/*
 *  Modifique a classe Carro adicionando uma lista de acessórios. A lista DEVE ser privada.
    Essa lista conterá os acessórios que o carro vai ter. Não amarre o sistema. Crie mais métodos se
    necessário (não precisa reescrever a classe carro toda, só a declaração da classe e o que for inserir
    a mais, além do que já aparece na figura)
 */

public class Carro {
    private String placa;
    private String cor;
    private int ano;
    private String renavan;
    private List<Acessorio> aces;

    @Override
    public String toString() {
        return "Placa: " + this.placa + " Cor: " + this.cor + " Ano: " + this.ano+ " Renavan: " + this.renavan;
    }

    public int getAno() { return ano; }
    
    public String getCor() {
        return cor;
    }
    public String getPlaca() {
        return placa;
    }
    public String getRenavan() {
        return renavan;
    }
    public List<Acessorio> getAces() {
        return aces;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public void setRenavan(String renavan) {
        this.renavan = renavan;
    }
    public void setAces(List<Acessorio> aces) {
        this.aces = aces;
    }
}
