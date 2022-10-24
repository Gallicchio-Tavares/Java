package CursoEmVideo;

public class Aula03 {
    // + (público), a classe atual e todas as outras classes podem acessar.
    // - (privado), somente a classe atual pode acessar.
    // # (protegido), a classe atual e todas as suas sub-classes podem acessar
    public static void main(String[] args){
        Caneta c1 = new Caneta();
        c1.modelo = "BIC Cristal";
        c1.cor = "azul";
        c1.status();
    }
}
