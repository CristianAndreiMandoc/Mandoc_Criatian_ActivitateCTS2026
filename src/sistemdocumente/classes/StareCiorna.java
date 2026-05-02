package sistemdocumente.classes;

public class StareCiorna implements StareDocument {
    @Override
    public void trimiteSpreAprobare(Document document) {
        System.out.println("Documentul a fost trimis spre aprobare de catre manager.");
        document.setStare(new StareInAprobare());
    }

    @Override
    public void aproba(Document document) {
        throw new IllegalStateException("Nu poti aproba o ciorna inainte de a fi trimisa spre verificare!");
    }

    @Override
    public void respinge(Document document) {
        throw new IllegalStateException("O ciorna nu poate fi respinsa, inca se lucreaza la ea.");
    }
}