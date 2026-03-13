package singletonRegistry.main;

import singletonRegistry.classes.Agentie1;

public class Main {
    public static void main(String[] args) {

        Agentie1 ag1 = Agentie1.getInstance("AG1", 3, "Bucuresti");
        System.out.println(ag1);

        Agentie1 ag2 = Agentie1.getInstance("AG2", 4, "Bucuresti");
        System.out.println(ag2);

        Agentie1 ag3 = Agentie1.getInstance("AG3", 3, "Cluj");
        System.out.println(ag3);
    }
}
