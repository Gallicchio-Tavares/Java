package PFdePOO.prova2021.q2;

public class TextoCurtoException extends Exception {

	public TextoCurtoException(String mensagem) {
		super("Texto inserido com " + mensagem + " caracteres");
	}
	
}
