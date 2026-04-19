package ecommerce.classes;

public class CosCumparaturi {
    private double sumaTotala;
    private StrategieReducere strategieReducere;

    public CosCumparaturi(double sumaTotala) {
        if (sumaTotala < 0) {
            throw new IllegalArgumentException("Totalul coșului nu poate fi negativ");
        }
        this.sumaTotala = sumaTotala;
        this.strategieReducere = new StrategieFaraReducere();
    }

    public void seteazaStrategieReducere(StrategieReducere strategieReducere) {
        if (strategieReducere == null) {
            throw new IllegalArgumentException("Strategia nu poate fi null");
        }
        this.strategieReducere = strategieReducere;
    }

    public double calculeazaTotal() {
        return strategieReducere.aplicaReducere(sumaTotala);
    }
}