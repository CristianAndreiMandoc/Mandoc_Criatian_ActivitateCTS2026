package monitorizare.main;

import monitorizare.classes.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Sistem Monitorizare IoT (Observer Pattern) ===\n");

        testDeclansareVentilatie();
        testDeclansareAlarmaIncendiu();
        testValidareSenzorHardware();
        testAbonatInvalid();
    }

    private static void testDeclansareVentilatie() {
        System.out.print("Test 1 (Integration - Pornire Ventilatie la > 25 grade): ");
        SenzorTemperatura senzor = new SenzorTemperatura();
        SistemVentilatie ventilatie = new SistemVentilatie();

        senzor.adaugaAbonat(ventilatie);
        senzor.setTemperatura(28.5);

        if (ventilatie.isPornit()) {
            System.out.println("SUCCES -> Ventilatia a reactionat corect la notificare.");
        } else {
            System.out.println("ESEC -> Ventilatia nu a pornit!");
        }
    }

    private static void testDeclansareAlarmaIncendiu() {
        System.out.print("Test 2 (Integration - Declanșare Alarmă la > 60 grade): ");
        SenzorTemperatura senzor = new SenzorTemperatura();
        AlarmaIncendiu alarma = new AlarmaIncendiu();

        senzor.adaugaAbonat(alarma);
        senzor.setTemperatura(65.0);

        if (alarma.isDeclansata()) {
            System.out.println("SUCCES -> Alarma de incendiu a detectat pericolul.");
        } else {
            System.out.println("ESEC -> Alarma nu a reactionat!");
        }
    }

    private static void testValidareSenzorHardware() {
        System.out.print("Test 3 (Negative Test - Temperatură imposibilă): ");
        SenzorTemperatura senzor = new SenzorTemperatura();

        try {
            senzor.setTemperatura(200.0);
            System.out.println("ESEC -> A permis inregistrarea unei temperaturi ireale!");
        } catch (IllegalArgumentException e) {
            System.out.println("SUCCES -> Validare corecta: " + e.getMessage());
        }
    }

    private static void testAbonatInvalid() {
        System.out.print("Test 4 (Robustness - Adăugare abonat NULL): ");
        SenzorTemperatura senzor = new SenzorTemperatura();

        try {
            senzor.adaugaAbonat(null);
            System.out.println("ESEC -> A permis un abonat Null care va face sistemul sa crape!");
        } catch (IllegalArgumentException e) {
            System.out.println("SUCCES -> Eroare blocata: " + e.getMessage());
        }
    }
}