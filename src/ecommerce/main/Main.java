package ecommerce.main;

import ecommerce.classes.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== Începere Execuție și Testare Program ===\n");

        // Rulăm "testele" noastre manuale
        ruleazaTestCazFericit();
        ruleazaTestReducereProcentuala();
        ruleazaTestValidareProcentGresit();
        ruleazaTestValidareCosNegativ();

        System.out.println("\n=== Finalizare Execuție ===");
    }

    // --- METODE DE TESTARE MANUALĂ ---

    private static void ruleazaTestCazFericit() {
        System.out.print("Test 1 (Fără reducere): ");
        CosCumparaturi cos = new CosCumparaturi(100.0);

        if (cos.calculeazaTotal() == 100.0) {
            System.out.println("SUCCES");
        } else {
            System.out.println("EȘEC");
        }
    }

    private static void ruleazaTestReducereProcentuala() {
        System.out.print("Test 2 (Reducere 15%): ");
        CosCumparaturi cos = new CosCumparaturi(200.0);
        cos.seteazaStrategieReducere(new StrategieReducereProcentuala(15.0));

        if (cos.calculeazaTotal() == 170.0) {
            System.out.println("SUCCES");
        } else {
            System.out.println("EȘEC");
        }
    }

    private static void ruleazaTestValidareProcentGresit() {
        System.out.print("Test 3 (Eroare la procent > 100): ");
        try {

            StrategieReducereProcentuala reducereGresita = new StrategieReducereProcentuala(150.0);


            System.out.println("EȘEC (Nu a oprit eroarea)");
        } catch (IllegalArgumentException e) {

            System.out.println("SUCCES - A prins eroarea: " + e.getMessage());
        }
    }

    private static void ruleazaTestValidareCosNegativ() {
        System.out.print("Test 4 (Eroare la coș negativ): ");
        try {

            CosCumparaturi cos = new CosCumparaturi(-50.0);

            System.out.println("EȘEC (Nu a oprit eroarea)");
        } catch (IllegalArgumentException e) {
            System.out.println("SUCCES - A prins eroarea: " + e.getMessage());
        }
    }
}