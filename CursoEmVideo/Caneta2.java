package CursoEmVideo;

public class Caneta2 {
    public String modelo;
    private double ponta;
    private String cor;
    private boolean tampada;

    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getCor() {
        return cor;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getModelo() {
        return modelo;
    }

    public double getPonta() {
        return ponta;
    }
    public void setPonta(double ponta) {
        this.ponta = ponta;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
    public boolean isTampada() {
        return tampada;
    } // apertar ctrl + i pra criar os gets e sets
    

    // método construtor é o método que tem o mesmo nome da sua classe
    // public Caneta2(){ // então, assim que eu criar uma caneta, ela estará tampada e será azul
    //     this.tampar();
    //     this.cor = "azul";
    // } // jeito mais simples de se criar um construtor

    public Caneta2(String m, String c, double p){ // vou passar os parametros modelo, cor e ponta já na criação -> facilita
        this.setModelo(m);;
        this.setCor(c);
        this.setPonta(p);
        this.tampar();
    }       

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }

    public void status(){
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
}
