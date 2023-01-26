package PFdePOO.prova2018;

/*
 *  Escreva uma classe Produto com 3 atributos: id (String), cor (String) e preco (double). Crie os getters e setters
 *  apenas se precisar. Crie em Produto APENAS UM construtor, que recebe o id como argumento.
 *  Considere que dois objetos Produto são iguais se possuem o mesmo id. Não é permitida qualquer iteração para realizar
 *  esse item, ou seja, não use for, iterator, etc.
 */

 /*
  * Faça com que, se uma referencia a um objeto do tipo Produto seja exibida no console (ex: System.out.println(p)),
    seja exibido o id, cor e preco do produto.
  */

  /*
   * Crie 2 subclasses da classe Produto: Televisao e Tapete. Faça Televisao implementar Ligavel
   */

public class Produto {
    private String id;
    private String cor;
    private double preco;

    public Produto(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean equals(Object ob){
        if(ob instanceof Produto){
            Produto p = (Produto)ob;
            return this.id.equals(p.getId());
        } else{
            return false;
        }
    }

    public String toString(){
        return "Id:" + this.id + " Cor:" + this.cor + " Preço:" + this.preco;
    }
}
