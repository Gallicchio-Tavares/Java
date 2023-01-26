package PFdePOO.q1;

public class Jonin extends Ninja{
    public Jonin(String cpf) {
        super(cpf);
    }
    public Jonin(String cpf, String nome, int idade) { 
        super(cpf, nome, idade);
    }
    public void treinar () {
        System.out.println("Jonin " + getNome() + " iniciando treinamento avançado");
    }

}