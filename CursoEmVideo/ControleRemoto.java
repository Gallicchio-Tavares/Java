// os pilares do java são encapsulamento, herança e polimorfismo

//encapsular: ocultar partes independentes da implementação, permitindo construir partes invisíveis ao mundo exterior.
//interface vai ser a comunicação com o meio externo
// encapsular é basicamente deixar variaveis privadas
public class ControleRemoto implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;
  
    public ControleRemoto(){
      this.volume = 50;
      this.ligado = false;
      this.tocando = false;
    }
    
    public void setVolume(int v){
        this.volume = v;
      }
    
    public int getVolume(){
    return volume;
    }
    
    public void isLigado(boolean ligado){
    this.ligado = ligado;
    }
    
    public boolean getLigado(){
    return ligado;
    }
    
    public void isTocando(boolean tocando){
    this.tocando = tocando;
    }
    
      public boolean getTocando(){
        return tocando;
      }
    
      public void ligar(){
        this.setLigado(true);
      }
    
      public void desligar(){
        this.setLigado(false);
      }
    
      public void abrirMenu(){
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.println("Volume: " + this.getVolume());
        for(int i = 0; i <= this.getVolume(); i+=10){
          System.out.print("|");
        }
      }
    
      public void fecharMenu(){
        System.out.println("Fechando menu...");
      }
    
      public void menosVolume(){
        if(this.getLigado() && this.getVolume() > 0){ // se a tv estiver ligada...
           this.setVolume(this.getVolume() - 1);
        }
      }
    
      public void maisVolume(){
        if(this.getLigado() && this.getVolume() < 100){
           this.setVolume(this.getVolume() + 1);
        }
      }
    
      public void ligarMudo(){
        if(this.getLigado() && this.getVolume() > 0){ 
           this.setVolume(0);
        }
      }
    
      public void desligarMudo(){
        if(this.getLigado() && this.getVolume() == 0){ 
           this.setVolume(50);
      }
    
      public void play(){
        if(this.getLigado() && !(this.getTocando())){
          this.setTocando(true);
        }
      }
    
      public void pause(){
         if(this.getLigado() && this.getTocando()){
          this.setTocando(false);
        }
      }
  }
}