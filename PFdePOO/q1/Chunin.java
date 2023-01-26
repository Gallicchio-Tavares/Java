package PFdePOO.q1;

public class Chunin extends Ninja {
    public Chunin(String cpf) {
        super(cpf);
    }
    public Chunin(String cpf, String nome, int idade) { 
        super(cpf, nome, idade);
    }
    public void treinar () {
        System.out.println("Chunin " + getNome() + " iniciando treinamento avançado");
    }
}