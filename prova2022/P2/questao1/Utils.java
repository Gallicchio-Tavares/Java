package P2.questao1;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Utils {
    public static boolean existe(Collection<CorpoCeleste> x, CorpoCeleste y) {
        return x.contains(y);
    }
    
    public static void ordena(List<CorpoCeleste> x) {
        Collections.sort(x);
    }
    
    public static Map<String, CorpoCeleste> retornaDados(Set<String> conjuntoCorpos) throws FormatoIncorretoException{
        
        Iterator<String> it = conjuntoCorpos.iterator();
        Map<String, CorpoCeleste> retorno = new HashMap<>();
        while(it.hasNext()) {
            String x = it.next();
            String [] y = x.split("#");
            if(y.length != 4) {
                throw new FormatoIncorretoException(x);
            }
            String id = y[0];
            String nome = y[1];
            double distancia = Double.parseDouble(y[2]);
            String tipo = y[3];
            CorpoCeleste c; 
            if(tipo.equals("P")) {
                c = new Planeta(id);

            } else {
                c = new Estrela(id);
            }
            c.setDistancia(distancia);
            c.setNome(nome);
            retorno.put(id, c);
        }
        return retorno;
    }
}
