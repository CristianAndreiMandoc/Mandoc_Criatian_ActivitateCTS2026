package monitorizare.classes;

import java.util.ArrayList;
import java.util.List;

public class SenzorTemperatura implements Subject {
    private List<Observer> abonati = new ArrayList<>();
    private double temperaturaCurenta;

    @Override
    public void adaugaAbonat(Observer o) {
        if (o == null) {
            throw new IllegalArgumentException("Abonatul nu poate fi null!");
        }
        abonati.add(o);
    }

    @Override
    public void stergeAbonat(Observer o) {
        abonati.remove(o);
    }

    @Override
    public void notificaAbonati() {
        for (Observer o : abonati) {
            o.update(temperaturaCurenta);
        }
    }

    public void setTemperatura(double temperaturaNoua) {
        if (temperaturaNoua < -50 || temperaturaNoua > 150) {
            throw new IllegalArgumentException("Eroare hardware: Temperatura citita este ireala!");
        }
        this.temperaturaCurenta = temperaturaNoua;
        notificaAbonati();
    }

    public double getTemperaturaCurenta() {
        return temperaturaCurenta;
    }
}