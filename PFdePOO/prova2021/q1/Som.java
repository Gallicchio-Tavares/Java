package PFdePOO.prova2021.q1;

public class Som extends Acessorio{

    public Som(String m, double p) {
        super(m, p);
    }
    
    public double calcularImposto(double p){
        return p * 0.3;
    }
}
