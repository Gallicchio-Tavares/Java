package PFdePOO.prova2021.q2;

import java.util.Iterator;
import java.util.Set;

public class Utils {

	public static void verifica(String texto) throws TextoCurtoException {
		if (texto.length() < 10) {
			throw new TextoCurtoException(String.valueOf(texto.length()));
		}
	}
	
	public static String moderar(String texto) {
		
		Set<String> palavroes = Utilidades.getPalavroes();
		
		Iterator<String> it = palavroes.iterator();
		
		String[] palavras = texto.split(" ");
		while (it.hasNext()) {
			String palavrao = it.next();
			for (int i = 0; i < palavras.length; i++) {
				String palavra = palavras[i];
				if (palavra.toLowerCase().equals(palavrao.toLowerCase())) {
					String filtrada = "#".repeat(palavra.length());
					palavras[i] = filtrada;
				}
			}
		}
		String saida = String.join(" ", palavras);
		return saida;
	}
	
}