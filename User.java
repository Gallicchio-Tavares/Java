import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class User {
    public String nome;
    public LocalDate niver;
    public ArrayList<Livro> livros = new ArrayList<Livro>(); // criando um array de livros

    public void alugar(Livro livro) {
        this.livros.add(livro); // adicionar o livro que recebemos à lista de livros.
    }

    public int idade() {
        Period idade = Period.between(this.niver, LocalDate.now()); // this vai saber qual a usuario estamos nos referindo
        return idade.getYears(); // para sabermos a idade
    }
}
