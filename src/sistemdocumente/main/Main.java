package sistemdocumente.main;

import sistemdocumente.classes.*; // Importam tot din celalalt pachet

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Sistem Gestiune Documente (Validare Stari) ===\n");

        testFluxAprobareCorect();
        testFluxRespingereCorect();
        testEroareAprobareDirecta();
        testEroareModificareDupaPublicare();
    }

    private static void testFluxAprobareCorect() {
        System.out.print("Test 1 (Happy Path - Aprobare): ");
        try {
            Document doc = new Document("Raport_Financiar_Q1");
            doc.trimiteSpreAprobare();
            doc.aproba();
            System.out.println("SUCCES -> Documentul a fost publicat corect.\n");
        } catch (Exception e) {
            System.out.println("ESEC -> " + e.getMessage() + "\n");
        }
    }

    private static void testFluxRespingereCorect() {
        System.out.print("Test 2 (Alternate Path - Respingere): ");
        try {
            Document doc = new Document("Regulament_Intern_V2");
            doc.trimiteSpreAprobare();
            doc.respinge();
            System.out.println("SUCCES -> Documentul a fost respins corect.\n");
        } catch (Exception e) {
            System.out.println("ESEC -> " + e.getMessage() + "\n");
        }
    }

    private static void testEroareAprobareDirecta() {
        System.out.print("Test 3 (Negative Test - Aprobare Ciorna): ");
        try {
            Document doc = new Document("Cerere_Concediu");
            doc.aproba();
            System.out.println("ESEC -> A permis aprobarea unei ciorne!\n");
        } catch (IllegalStateException e) {
            System.out.println("SUCCES -> Actiune blocata: " + e.getMessage() + "\n");
        }
    }

    private static void testEroareModificareDupaPublicare() {
        System.out.print("Test 4 (Negative Test - Respingere Dupa Publicare): ");
        try {
            Document doc = new Document("Politica_Securitate");
            doc.trimiteSpreAprobare();
            doc.aproba();
            doc.respinge();
            System.out.println("ESEC -> A permis respingerea unui document publicat!\n");
        } catch (IllegalStateException e) {
            System.out.println("SUCCES -> Actiune blocata: " + e.getMessage() + "\n");
        }
    }
}