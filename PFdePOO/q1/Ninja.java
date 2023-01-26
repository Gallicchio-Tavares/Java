package PFdePOO.q1;
public class Ninja implements Treinamento, Comparable <Ninja>{
    private String cpf;
    private String nome;
    private int idade;
    public Ninja (String cpf) {
        this.cpf = cpf;
    }
    public Ninja (String cpf, String nome, int idade) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void treinar() {
        System.out.println("Ninja treinando...");
    }
    public String toString() {
        return nome + " " + cpf + " " + idade;
    }
    public boolean equals(Object obj) {
        if (obj instanceof Ninja) {
            Ninja n = (Ninja)obj;
            return cpf.equals(n.cpf);
        }
        return false;
    }
    public int compareTo(Ninja n) { // qnd eu for fazer o sort, vou fazer com a idade
        return Double.compare(idade, n.idade);
    }
}