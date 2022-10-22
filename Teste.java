import java.time.LocalDate;

// programa para cadastrar usuarios que alugam livros

public class Teste {
    public static void main(String[] args){
        User usuario = new User();
        usuario.nome = "Ada Lovelace";
        usuario.niver = LocalDate.parse("1815-12-10");

        Livro livro1 = new Livro();
        livro1.autor = "Umberto Eco";
        livro1.titulo = "O Nome da Rosa";

        usuario.alugar(livro1);

        System.out.println(usuario.nome + " nasceu em " + usuario.niver.toString() + " e tem " + usuario.idade() + " anos.\n");

        System.out.printf("%s alugou o livro %s.", usuario.nome, usuario.livros.toString());
    }
}
