package HashMap;

public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
    private String endereco;
    
    public Pessoa(String n, int i, String c, String end){
        this.nome = n;
        this.idade = i;
        this.cpf = c;
        this.endereco = end;
    } // constructor

    @Override
    public String toString() {
        return "Pessoa: " + this.nome + ", idade: " + this.idade + ", CPF: " + this.cpf + ", endereço: " + this.endereco;
    }

    public String getCpf() {
        return cpf;
    }
}
