package PFdePOO.prova2018.q2;

import java.util.HashSet;
import java.util.Set;

/*
 * Crie um método chamado Utils3.processa(String [] filmes):Set que irá receber como argumento o retorno de 
 * LocAntiga.getFilmes(). Em seguida, o método Utils3.processa irá processar e retornar um conjunto com objetos 
 * do tipo Filme, em que cada objeto Filme representa um elemento do array retornado por LocAntiga.getFilmes(). 
 * PS: observe que podem existir filmes com nome e ano iguais, porém, o id é diferente. Atribua o id, titulo e ano 
 * dos filmes
 */

public class Utils3 {
    public static Set<Filme> processa(String [] filmes){
        Set<Filme> x = new HashSet<>();
        for(String f : filmes){
            String[] info = f.split("#");
            int id = Integer.parseInt(info[0]);
            String nome = info[1];
            int ano = Integer.parseInt(info[2]);
            x.add(new Filme(id, nome, ano));
        }
        return x;
    }
}
