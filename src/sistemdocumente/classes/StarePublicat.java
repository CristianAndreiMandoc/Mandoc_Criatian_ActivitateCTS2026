package sistemdocumente.classes;

public class StarePublicat implements StareDocument {
    @Override
    public void trimiteSpreAprobare(Document document) {
        throw new IllegalStateException("Documentul este deja publicat!");
    }

    @Override
    public void aproba(Document document) {
        throw new IllegalStateException("Documentul a fost deja aprobat si publicat!");
    }

    @Override
    public void respinge(Document document) {
        throw new IllegalStateException("Prea tarziu, documentul este public si nu mai poate fi respins!");
    }
}