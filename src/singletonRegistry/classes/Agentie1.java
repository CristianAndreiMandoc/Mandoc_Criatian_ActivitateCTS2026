package singletonRegistry.classes;

import java.util.HashMap;
import java.util.Map;

public class Agentie1 {

    private String denumire;
    private int nrAng;

    private static Map<String,Agentie1> mapAgentie1 = new HashMap<>();


    public Agentie1(String denumire, int nrAng) {
        this.denumire = denumire;
        this.nrAng = nrAng;
    }




//    public static synchronized  Agentie1 getInstance(String denumire, int nrAng,String oras) {
//
//        if(mapAgentie1.containsKey(oras)) {
//            return mapAgentie1.get(oras);
//        }
//        else {
//            mapAgentie1.put(oras, new Agentie1(denumire, nrAng));
//            return mapAgentie1.get(oras);
//        }
//    }
// Varianta clean code
    public static synchronized  Agentie1 getInstance(String denumire, int nrAng,String oras) {
        if(!mapAgentie1.containsKey(oras)) {
            mapAgentie1.put(oras, new Agentie1(denumire, nrAng));
        }
        return mapAgentie1.get(oras);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Agentie1{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", nrAng=").append(nrAng);
        sb.append('}');
        return sb.toString();
    }
}
