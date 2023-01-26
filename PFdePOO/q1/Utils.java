package PFdePOO.q1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Utils {
    public Map retornaMapa (List listaNinjas) {
        Map m = new HashMap();
        for (int i = 0; i < listaNinjas.size(); i++) {
            Ninja n = (Ninja)listaNinjas.get(0);
            m.put(n.getCpf(), n);
        }
        return m;
    }
}
