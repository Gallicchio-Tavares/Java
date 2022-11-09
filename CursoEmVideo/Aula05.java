package CursoEmVideo;

public class Aula05{
    public static void main(String[] args){
        ContaBanco c1 = new ContaBanco(); // criando uma conta nova
        c1.setNumConta(1111);
        c1.setDono("Dostoiévski");
        c1.abrirConta("cc"); // abrir uma conta corrente. vai depositar 50 mangos na conta
        c1.estadoAtual();

        ContaBanco c2 = new ContaBanco();
        c2.setNumConta(1112);
        c2.setDono("Akhmatova");
        c2.abrirConta("cp");
        c2.estadoAtual();

        c1.depositar(100);
        c2.depositar(500);
        c1.sacar(150);
        c1.fecharConta();
        c2.sacar(100);
    }
}