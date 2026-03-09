package RecapitulareJava.classes;

public class Masina extends VehiculDeBaza implements IVehicul{

    private String model;
    private int vitezaMaxima;
    private boolean pornita;

    public Masina(int anFabricare, int vitezaCurenta, String marca, String model, int vitezaMaxima, boolean pornita) {
        super(anFabricare, vitezaCurenta, marca);
        this.model = model;
        this.vitezaMaxima = vitezaMaxima;
        this.pornita = pornita;
    }

    public Masina(String marca, int anFabricare) {
        super(marca, anFabricare);
    }

    @Override
    public void afisare() {
        StringBuilder sb = new StringBuilder();
        sb.append("Masina: ").append(model)

    }

    @Override
    public int vitezaMaxima() {

        return vitezaMaxima;
    }

    @Override
    public void accelereaza(int valoare) {
        this.vitezaCurenta = vitezaCurenta + valoare;


    }
}
