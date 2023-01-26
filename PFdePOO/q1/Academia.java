package PFdePOO.q1;

import java.util.ArrayList;
import java.util.List;

public class Academia {
    private String nome;
    private List listaNinjas;
    public Academia (String nome) {
        this.nome = nome;
        listaNinjas = new ArrayList();
    }
    public void matriculaNinja (Ninja n) {
        listaNinjas.add(n);
    }
    public boolean imprimeDadosNinjaSeExistir(Ninja n) {
        int indexNinja = listaNinjas.indexOf(n);
        if (indexNinja == -1) {
            System.out.println("Não existe ninja com esse cpf.");
            return false;
        } else {
            //para fazer assim, precisa sobrescrever o toString em Ninja
            System.out.println(listaNinjas.get(indexNinja));
            return true;
        }

    }
    public String toString() {
        return nome + " - " + listaNinjas.size();
    }
    public List getListaNinjas() {
        return listaNinjas;
    }
}
