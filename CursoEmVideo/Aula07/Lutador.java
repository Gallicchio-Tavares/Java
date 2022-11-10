package Aula07;


public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
  
    public Lutador(String no, String na, int id, double al, double pe, int vi, int de, int em) {
      this.nome = no;
      this.nacionalidade = na;
      this.idade = id;
      this.altura = al;
      this.setPeso(pe);
      this.vitorias = vi;
      this.derrotas = de;
      this.empates = em;
    }
  
    public void setNome(String nome) {
      this.nome = nome;
    }
  
    public String getNome() {
      return nome;
    }
  
    public void setNacionalidade(String nacionalidade) {
      this.nacionalidade = nacionalidade;
    }
  
    public String getNacionalidade() {
      return nacionalidade;
    }
  
    public void setIdade(int idade) {
      this.idade = idade;
    }
  
    public int getIdade() {
      return idade;
    }
  
    public void setAltura(double altura) {
      this.altura = altura;
    }
  
    public double getAltura() {
      return altura;
    }
  
    public void setPeso(double peso) {
      this.peso = peso;
      this.setCategoria();
    }
  
    public double getPeso() {
      return peso;
    }
  
    private void setCategoria() {
      if (this.peso < 52.2) {
        this.categoria = "Inválido";
      } else if (this.peso <= 70.3) {
        this.categoria = "Leve";
      } else if (this.peso <= 83.9) {
        this.categoria = "Médio";
      } else if (this.peso <= 120.2) {
        this.categoria = "Pesado";
      } else {
        this.categoria = "Inválido";
      }
    }
  
    public String getCategoria() {
      return categoria;
    }
  
    public void setVitorias(int vitorias) {
      this.vitorias = vitorias;
    }
  
    public int getVitorias() {
      return vitorias;
    }
  
    public void setDerrotas(int derrotas) {
      this.derrotas = derrotas;
    }
  
    public int getDerrotas() {
      return derrotas;
    }
  
    public void setEmpates(int empates) {
      this.empates = empates;
    }
  
    public int getEmpates() {
      return empates;
    }
  
    public void apresentar() {
      System.out.println("Ecce homo qui est faba");
    }
  
    public void status() {
      System.out.println("Nome: " + this.getNome());
      System.out.println("Nacionalidade: " + this.getNacionalidade());
      System.out.println("Idade: " + this.getIdade());
      System.out.println("Peso: " + this.getPeso());
      System.out.println("Altura: " + this.getAltura());
      System.out.println("Categoria: " + this.getCategoria());
      System.out.println("VITÓRIAS: " + this.getVitorias());
      System.out.println("DERROTAS: " + this.getDerrotas());
      System.out.println("EMPATES: " + this.getEmpates());
    }
  
    public void ganharLuta() {
      this.setVitorias(this.getVitorias() + 1);
    }
  
    public void perderLuta() {
      this.setDerrotas(this.getDerrotas() + 1);
      
    }
  
    public void empatarLuta() {
      this.setEmpates(this.getEmpates() + 1);
    }
  }