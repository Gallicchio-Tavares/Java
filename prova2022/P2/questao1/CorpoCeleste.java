package P2.questao1;

public class CorpoCeleste implements Comparable<CorpoCeleste>{
    private String id;
    private String nome;
    private double distancia;
    
    //getters
    public String getId() {
        return this.id;
    }
    public String getNome() {
        return this.nome;
    }
    public double getDistancia() {
        return this.distancia;
    }
    
    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    
    //construtor
    public CorpoCeleste(String id) {
        this.id = id;
    }
    
    //Existe 
    public boolean equals(Object x) {
        if(x instanceof CorpoCeleste) {
            CorpoCeleste c = (CorpoCeleste)x;
            return this.id.equals(c.getId()); 
        } else {
            return false;
        }
    }
    
    //Ordenar double
    public int compareTo(CorpoCeleste x) {
        return Double.compare(this.distancia, x.getDistancia());
    }
    
    //Ordenar por nome
    /*public int compareTo(CorpoCeleste x) {
        return this.nome.compareTo(x.getNome());
    }*/
    
    //toString
    public String toString() {
        return this.id + this.nome + this.distancia;
    }
}
