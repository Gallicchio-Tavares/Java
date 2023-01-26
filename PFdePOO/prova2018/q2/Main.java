package PFdePOO.prova2018.q2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.Iterator;

/*
 *  1 - imprima a quantidade total de filmes existente na locadora. Ex: existe um total de 1000 filmes na locadora. 
 *  2 - Imprima a quantidade existente de cada título. Ex: Morro dos ventos uivantes: 2; A ilha: 1; etc.
 *  3 - ordene os filmes e exiba a lista de filmes ordenados.
 */

public class Main {
    public static void main(String[] args) {
        String[] f = LocAntiga.getFilmes();
        Set<Filme> filmes = Utils3.processa(f);

        System.out.println("Existe um total de " + filmes.size() + " filmes na locadora");

        Iterator<Filme> it = filmes.iterator();
        while(it.hasNext()){
            Filme exemplo = (Filme) it.next();
            System.out.println( exemplo.getTitulo() + ": " + Collections.frequency(filmes, exemplo));
        }
        // TO-DO imprimir a quantidade existente de cada título

        List<Filme> lista = new ArrayList<>(filmes);
        Collections.sort(lista);
        System.out.println("Filmes ordenados: ");
        for(Filme filme : lista){
            System.out.println(filme.getTitulo());
        }
    }
}
