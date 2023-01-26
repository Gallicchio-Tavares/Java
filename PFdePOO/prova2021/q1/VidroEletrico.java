package PFdePOO.prova2021.q1;

public class VidroEletrico extends Acessorio{

    public VidroEletrico(String m, double p) {
        super(m, p);
    }
    
    public double calcularImposto(double p){
        return p * 0.2;
    }
}
