package PFdePOO.prova2018.q2;

/*
 * Considere a existência de um método denominado LocAntiga.getFilmes():String []. Esse método retorna um array de 
 * Strings no seguinte formato: ID#titulo#ano. Por exemplo, considere os elementos desse array como 
 * (123#Morro dos ventos uivantes#1939, 443#Morro dos ventos uivantes#1939, 443#A ilha#2005, etc...).
 * Esses valores representam id, titulo e ano dos filmes.
 */

public class LocAntiga {
    public static String[] getFilmes(){
        String[] filmes = {"123#Morro dos ventos uivantes#1939", "443#A ilha#2005", "666#Clube da Luta#1999", "443#Morro dos ventos uivantes#1939"};
        return filmes;
    }
}
