package Adapter.classes;

public class AdaptorCabluDiagnoza implements IMufaDiagnoza {
    // Adaptorul trebuie să conțină "în el" mufa veche
    private MufaVecheRotunda mufaVeche;

    public AdaptorCabluDiagnoza(MufaVecheRotunda mufaVeche) {
        this.mufaVeche = mufaVeche;
    }

    @Override
    public void conecteaza(String modelMasina) {
        System.out.println("[Adaptor] Transform semnalul din mufa noua OBD2 in mufa veche...");
        // Apelează funcția din sistemul vechi
        mufaVeche.conecteazaPinVechi(modelMasina);
    }
}