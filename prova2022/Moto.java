package prova2022;

public class Moto extends VeiculoTerrestre{

    private int cilindradas; 

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public double calcularPrecoDeVenda() {
        // TODO Auto-generated method stub
        return super.calcularPrecoDeVenda();
    }

    public Moto(String d, int a, double v) {
        super(d, a, v);
        //TODO Auto-generated constructor stub
    }
    
}
