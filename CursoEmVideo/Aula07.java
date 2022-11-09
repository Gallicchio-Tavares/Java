public class Aula07 {
    public static void main(String[] args) {

        // Criei a classe luta que vai usar todas as caracteristicas da minha classe lutador no código

        Lutador l[] = new Lutador[6]; // defini um array de lutadores
        l[0] = new Lutador("Jorge", "brasileiro", 31, 175, 87.5, 10, 5, 0);  
        l[1] = new Lutador("Matthew", "americano", 29, 181.7, 90.5, 8, 3, 1);
        l[2] = new Lutador("Martin", "francês", 35, 176, 70.5, 9, 3, 0);
        l[3] = new Lutador("Ewan", "irlandês", 28, 195, 110.5, 12, 2, 5);
        l[4] = new Lutador("Carl", "australiano", 30, 185, 100.5, 10, 4, 2);
        l[5] = new Lutador("Mario", "chileno", 37, 168, 80.5, 6, 2, 2);
    
        l[1].ganharLuta();
        for (int i = 0 ; i < l.length ; i++) {
            l[i].status();
        }

        Luta UFC01 = new Luta();
        Luta UFC02 = new Luta();
        Luta UFC03 = new Luta();
        UFC01.marcarLuta(l[0], l[1]); // não vai poder porque são de categorias diferentes
        UFC02.marcarLuta(l[4], l[3]); // aprovada: ambos são da categoria Pesado
        UFC03.marcarLuta(l[2], l[5]); // aprovada: ambos são da categoria Médio

    }
  }