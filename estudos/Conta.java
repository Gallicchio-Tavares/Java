public class Conta implements Comparable<Conta>{
    private double saldo;
    private String nome;

    public Conta(double s, String n){
        saldo = s;
        nome = n;
    }

    public int compareTo(Conta c){
        //return nome.compareTo(c.nome); // comparando o nome da conta atual com o nome salvo
        return Double.compare(saldo, c.saldo);
    }

    @Override
    public String toString() {
        return nome + " - " + saldo;
    }

    @Override
    public boolean equals(Object obj) { // equals tem sempre Object
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    public String getNome() {
        return nome;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
