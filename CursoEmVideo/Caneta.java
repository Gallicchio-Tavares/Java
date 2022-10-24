package CursoEmVideo;

public class Caneta {
    String modelo;
    String cor;
    double ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println("Uma caneta " + this.cor + " de modelo " + this.modelo + " e ponta " + this.ponta + "\nEla está tampada? " + this.tampada);
    }

    void rabiscar(){
        // função da caneta; vc pode criar vários pra fazer algo q vc queria e dps chamar na Main
        if(this.tampada == false){
            System.out.println("A caneta " + this.modelo + " está rabiscando...");
        }
        else{
            System.out.println("A caneta não pode escrever no momento.");
        }
    }

    void tampar(){
        if(this.tampada == false){
            this.tampada = true;
            System.out.println("Caneta tampada!");
        }
        else{
            System.out.println("A caneta já está tampada.");
        }
    }

    void destampar(){
        if(this.tampada == true){
            this.tampada = false;
            System.out.println("Caneta destampada!");
        }
        else{
            System.out.println("A caneta já está destampada.");
        }
    }


}
