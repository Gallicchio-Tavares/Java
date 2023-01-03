package exceptions;

public class TesteConta {
    public static void main(String[] args){
        double val = 1000;
        Conta c = new Conta(500); // menor do que quero sacar: vai mostrar a exceção
        try{
            c.sacar(val);
            CaixaEletronico.liberarValor(val);
            System.out.println("O seu saldo atual é R$" + c.getSaldo());
        } catch(SDException e){
            System.out.println("Propaganda de empréstimo");
            System.out.println("mensagem da exception " + e.getMessage());
            e.printStackTrace(); // vai aparecer a pilha de erro
        }
    }
}
