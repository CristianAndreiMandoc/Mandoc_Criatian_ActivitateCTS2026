package sistemdocumente.classes;

public class StareInAprobare implements StareDocument {
    @Override
    public void trimiteSpreAprobare(Document document) {
        throw new IllegalStateException("Documentul este deja in curs de aprobare!");
    }

    @Override
    public void aproba(Document document) {
        System.out.println("Documentul a fost APROBAT. Acum este publicat.");
        document.setStare(new StarePublicat());
    }

    @Override
    public void respinge(Document document) {
        System.out.println("Documentul a fost RESPINS. Se intoarce in stadiul de ciorna.");
        document.setStare(new StareCiorna());
    }
}