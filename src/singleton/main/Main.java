package singleton.main;

import singleton.classes.Agentie;

public class Main {
    public static void main(String[] args) {
        Agentie agentie1 = Agentie.getInstance("AgeTur", 3);
        System.out.println(agentie1);
        Agentie agentie2 = Agentie.getInstance("karpaton", 10);
        System.out.println(agentie2);
      }
}
