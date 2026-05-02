package sistemdocumente.classes;

public class Document {
    private StareDocument stareCurenta;
    private final String titlu;

    public Document(String titlu) {
        this.titlu = titlu;
        // Orice document creat este automat o Ciornă
        this.stareCurenta = new StareCiorna();
    }

    public void setStare(StareDocument stare) {
        this.stareCurenta = stare;
    }

    public String getTitlu() {
        return titlu;
    }

    public void trimiteSpreAprobare() {
        stareCurenta.trimiteSpreAprobare(this);
    }

    public void aproba() {
        stareCurenta.aproba(this);
    }

    public void respinge() {
        stareCurenta.respinge(this);
    }
}