package prova2022;
import java.util.ArrayList;

public class Concessionaria {
    public static final int ANO_CORRENTE = 2022; // constante estática
    private double valorTotalEmVeiculos = 0;

    public double calcular(ArrayList<Veiculo> veiculo){
        for(int i = 0; i < veiculo.size(); i++){
            this.valorTotalEmVeiculos += veiculo.get(i).calcularPrecoDeVenda();
        }
        return valorTotalEmVeiculos;
    }

    public double getValorTotalEmVeiculos() {
        return valorTotalEmVeiculos;
    }
}
