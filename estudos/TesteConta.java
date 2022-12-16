public class TesteConta {
    public static void main(String[] args){
        double val = 1000;
        Conta c = new Conta();
        try{
            c.sacar(val);
            CaixaEletronico.liberarValor(val);
            System.out.println(c.getSaldo());
        } catch(SDException e){
            System.out.println("Propaganda de empréstimo");
            System.out.println("mensagem da exception " + e.getMessage());
            e.printStackTrace(); // vai aparecer a pilha de erro
        }
    }
}
