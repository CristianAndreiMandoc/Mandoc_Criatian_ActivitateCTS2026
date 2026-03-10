package RecapitulareJava.classes;

public class Motocicleta extends VehiculDeBaza{
    private String numeSofer;
    private   String culoare;

    public Motocicleta(int anFabricare, int vitezaCurenta, String marca, String numeSofer, String culoare) {
        super(anFabricare, vitezaCurenta, marca);
        this.numeSofer = numeSofer;
        this.culoare = culoare;
        this.numeSofer = numeSofer;
        this.culoare = culoare;
    }

    public Motocicleta(String marca, int anFabricare, String numeSofer, String culoare) {
        super(marca, anFabricare);
        this.numeSofer = numeSofer;
        this.culoare = culoare;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Motocicleta{");
        sb.append("numeSofer='").append(numeSofer).append('\'');
        sb.append(", culoare='").append(culoare).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void accelereaza(int valoare) {
    }
}
