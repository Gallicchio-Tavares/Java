package lista1;

public class TestaCasaJanela {
    public static void main(String[] args){
        Janela j1 = new Janela();
        j1.cor = "amarela";
        j1.material = "madeira";
        Casa casa = new Casa();
        casa.cor = "vermelha";
        casa.numero = 44;
        casa.janela = j1;
        System.out.printf("A casa %d é %s e tem uma janela %s de %s\n", casa.numero, casa.cor, casa.janela.cor, casa.janela.material);
        // casa.janela.material = "madeira";
    }
}
