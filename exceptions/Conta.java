package exceptions;

public class Conta {
    private double saldo;

    public Conta(double s){
        saldo = s;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void sacar(double val) throws SDException{
        if(val > saldo){
            throw new SDException("Saldo = " + this.saldo);
        }
        else{
            this.saldo -= val;
        }      
    }
}
