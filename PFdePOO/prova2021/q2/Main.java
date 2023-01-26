package PFdePOO.prova2021.q2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira uma frase:");
		String input = sc.nextLine();
		
		try {
			Utils.verifica(input);
		} catch (TextoCurtoException e) {
			System.out.println(e);
			return;
		}
		
		// Palavrões: "babaca", "lixo", "inferno"
		
		String filtrado = Utils.moderar(input);
		System.out.println(filtrado);
        
	}
	
}