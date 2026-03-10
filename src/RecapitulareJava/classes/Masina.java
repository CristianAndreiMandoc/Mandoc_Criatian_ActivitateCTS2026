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



    @Override
    public void afisare() {
        final StringBuilder sb = new StringBuilder("Masina{");
        sb.append("model='").append(model).append('\'');
        sb.append(", vitezaMaxima=").append(vitezaMaxima);
        sb.append(", pornita=").append(pornita);
        sb.append('}');
       System.out.println(sb);

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
