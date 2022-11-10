package Aula07;

import java.util.Random;

public class Luta {
  // atributos
  private Lutador desafiado;
  private Lutador desafiante;
  private int rounds;
  private boolean aprovado;

  // métodos públicos
  public void marcarLuta(Lutador l1, Lutador l2) {
    // ver se são da mesma categoria pra poder lutar,
    // ver se não é a mesma pessoa duas vezes.
    if (l1.getCategoria() == l2.getCategoria() && l1 != l2) {
      this.aprovado = true;
      this.desafiante = l1;
      this.desafiado = l2;
      System.out.println("luta aprovada!\n");
      this.lutar();
    } else {
      this.aprovado = false;
      this.desafiante = null;
      this.desafiado = null;
      System.out.println("luta não aprovada\n");
    }
  }

  private void lutar() { // só posso usar aqui nesse programa
    if (this.aprovado) {
      System.out.println("### DESAFIANTE ###");
      this.desafiante.status();
      System.out.println("### DESAFIADO ###");
      this.desafiado.status();
      Random aleatorio = new Random();
      int vencedor = aleatorio.nextInt(3); // 0 1 2
      switch (vencedor) {
        case 0:
          this.desafiante.empatarLuta();
          this.desafiado.empatarLuta();
          System.out.println("Empate!\n");
          break;
        case 1:
          this.desafiante.ganharLuta();
          this.desafiado.perderLuta();
          System.out.println(this.desafiante.getNome() + " venceu a luta!\n");
          break;
        case 2:
          this.desafiante.perderLuta();
          this.desafiado.ganharLuta();
          System.out.println(this.desafiado.getNome() + " venceu a luta!\n");
          break;
      }

    } else {
      System.out.println("A luta não pode acontecer\n");
    }
  }

  public Lutador getDeasafiado() {
    return desafiado;
  }

  public void setDesafiado(Lutador desafiado) {
    this.desafiado = desafiado;
  }

  public Lutador getDesafiante() {
    return desafiante;
  }

  public void setDesafiante(Lutador desafiante) {
    this.desafiante = desafiante;
  }

  public int getRounds() {
    return rounds;
  }

  public void setRounds(int rounds) {
    this.rounds = rounds;
  }

  public boolean isAprovado() {
    return aprovado;
  }

  public void setAprovado(boolean aprovado) {
    this.aprovado = aprovado;
  }
}