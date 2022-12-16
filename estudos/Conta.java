
public class Conta{
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double v){
        if(v > saldo){
            //String x = null;
            //x.split("#"); // vai lançar null pointer exception, vai estourar e n continuar o q tá embiaxo
            throw new SDException("saldo = " + saldo);
            // passar uma string pro construtor da exceção
        } else{
            saldo -= v;
        }
    }
}