package PFdePOO.prova2018.q2;

import java.util.Objects;

/*
 *  Crie uma classe denominada Filme. Essa classe possui três atributos de instância: id(int), titulo (String) e ano
 *  (int). Desenvolva sua classe de maneira que você consiga ordenar (em ordem alfabética por nome) os filmes 
 *  utilizando o método de ordenação de Collections. Da mesma maneira, implemente de maneira que você consiga 
 *  utilizar o método de Collections para calcular a quantidade de itens de cada filme. Considere que os filmes são 
 *  iguais se possuem o mesmo nome
 */

public class Filme implements Comparable<Filme>{
    private int id;
    private String titulo;
    private int ano;

    public Filme(int i, String t, int a){
        this.id = i;
        this.titulo = t;
        this.ano = a;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Filme o){ // pra ordenar
        return this.titulo.compareTo(o.getTitulo());
    }

    @Override
    public boolean equals(Object obj) { // sao iguais se tem o msm titulo
        if(obj instanceof Filme){
            Filme f = (Filme)obj;
            return this.titulo.equals(f.getTitulo());
        } else{
            return false;
        }
    }

    // TO-DO usar o método de Collections que permite calcular a quantidade de itens de cada filme
}
