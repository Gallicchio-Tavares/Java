package PFdePOO.q1;

public class Genin extends Ninja {
    public Genin(String cpf) {
        super(cpf);
    }
    public Genin(String cpf, String nome, int idade) { 
        super(cpf, nome, idade);
    }
    public void treinar () {
        System.out.println("Genin " + getNome() + " iniciando treinamento avançado");
    }

}
