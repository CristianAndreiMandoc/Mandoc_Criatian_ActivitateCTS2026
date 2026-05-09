package Decorator;

// Importam automat toate clasele din sub-pachetul classes
import Decorator.classes.*;

public class Main {
    public static void main(String[] args) {
        // 1. Masina standard
        Masina masinaMea = new CrossoverDeBaza();
        System.out.println(masinaMea.getDescriere() + " | Pret: " + masinaMea.getCost() + " EUR");

        // 2. Adaugam suspensie sport
        masinaMea = new PachetSuspensieSport(masinaMea);
        System.out.println(masinaMea.getDescriere() + " | Pret: " + masinaMea.getCost() + " EUR");

        // 3. Adaugam frane ceramice
        masinaMea = new FraneCeramice(masinaMea);
        System.out.println(masinaMea.getDescriere() + " | Pret: " + masinaMea.getCost() + " EUR");
    }
}