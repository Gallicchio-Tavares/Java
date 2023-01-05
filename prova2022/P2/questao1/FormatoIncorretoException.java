package P2.questao1;

public class FormatoIncorretoException extends Exception{
    public FormatoIncorretoException(String mensagem) {
        super("O formato da String " + mensagem + " está incorreto.");
    }
}
