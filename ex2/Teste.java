package lista9.ex2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 * percorra as chaves do mapa de forma que se a chave iniciar por A, os valores são somados.
 */

public class Teste {
    public static void main(String[] args) {
        Map<String, Integer> x = new HashMap<>();
        //   chave, valor
        x.put("A1", 5); // 
        x.put("A2", 6); //
        x.put("A3", 7); //
        x.put("BD21", 3);
        x.put("B2", 7);
        x.put("AC74", 2); //
        x.put("A5", 8);   //
        x.put("B3", 3);
        // A SOMA TEM Q DAR 28
        System.out.println("Soma: " + contaA(x));
    }
    
    // usar o startsWith() e o Iterator();
    // usar o key() pra procurar e o values() pra somá-los

    public static double contaA(Map<String, Integer> mapa) {
        Iterator<String> itr = mapa.keySet().iterator();
        double value = 0;
        while (itr.hasNext())
        {
            String key = itr.next();
            
            if(key.startsWith("A")){
                value += (double) mapa.get(key);
            }
        }
        return value;
    }
}
