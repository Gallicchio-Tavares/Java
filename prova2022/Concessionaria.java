package prova2022;
import java.util.ArrayList;

public class Concessionaria {
    private static final int ANO_CORRENTE = 2019; // constante estática
    private double valorTotalEmVeiculos = 0;

    public double calcular(ArrayList<Veiculo> veiculo){
        for(int i = 0; i < veiculo.size(); i++){
            valorTotalEmVeiculos += veiculo.get(i).calcularPrecoDeVenda();
        }
        return valorTotalEmVeiculos;
    }
}
