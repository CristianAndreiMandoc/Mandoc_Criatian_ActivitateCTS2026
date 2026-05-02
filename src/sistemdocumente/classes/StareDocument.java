package sistemdocumente.classes;

public interface StareDocument {
    void trimiteSpreAprobare(Document document);
    void aproba(Document document);
    void respinge(Document document);
}