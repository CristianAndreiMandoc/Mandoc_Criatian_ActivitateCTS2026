package Adapter.main;

// Importăm interfața și clasele din pachetul classes
import Adapter.classes.IMufaDiagnoza;
import Adapter.classes.MufaOBD2Standard;
import Adapter.classes.MufaVecheRotunda;
import Adapter.classes.AdaptorCabluDiagnoza;

public class Main {

    // Mecanicul (clientul) folosește doar interfața pe care o cunoaște (IMufaDiagnoza)
    public static void efectueazaDiagnoza(IMufaDiagnoza mufa, String masina) {
        mufa.conecteaza(masina);
        System.out.println("-> Extragere erori finalizata!\n");
    }

    public static void main(String[] args) {

        System.out.println("--- CAZ 1: Masina noua (Nu este nevoie de adaptor) ---");
        IMufaDiagnoza cabluStandard = new MufaOBD2Standard();
        efectueazaDiagnoza(cabluStandard, "VW Golf 7");

        System.out.println("--- CAZ 2: Masina veche (Folosim un Adaptor) ---");
        // Avem mașina cu mufa veche
        MufaVecheRotunda sistemMasinaVeche = new MufaVecheRotunda();

        // Băgăm mufa veche în Adaptor ca să devină compatibilă cu interfața IMufaDiagnoza
        IMufaDiagnoza cabluCuAdaptor = new AdaptorCabluDiagnoza(sistemMasinaVeche);

        // Mecanicul folosește tableta exact la fel, fără să schimbe vreo setare!
        efectueazaDiagnoza(cabluCuAdaptor, "BMW E36 (1995)");
    }
}