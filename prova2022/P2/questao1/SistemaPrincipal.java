package P2.questao1;

import java.util.Collection;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class SistemaPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o id: ");
        String lendoId = sc.nextLine();
        Set<String> x = LerArquivo.retornaStrings("");
        CorpoCeleste c1 = new CorpoCeleste(lendoId);
        try { // precisamos tratar a Exception checked
            Map<String, CorpoCeleste> dados = Utils.retornaDados(x);
            Collection<CorpoCeleste> corpos = dados.values();
            if(Utils.existe(corpos, c1)) {
                CorpoCeleste c2 = dados.get(lendoId);
                System.out.println(c2);
            } else {
                System.out.println("A estrela com ID " + c1.getId() + " não existe");
            }
        } catch(FormatoIncorretoException e){
            System.out.println("Há um problema no seu arquivo texto. " + e.getMessage());
        }
        sc.close();
    }
}
