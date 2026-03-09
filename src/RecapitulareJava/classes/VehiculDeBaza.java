package RecapitulareJava.classes;

public abstract class VehiculDeBaza {
    protected String marca;
    protected int AnFabricare;
    protected int vitezaCurenta;

    public VehiculDeBaza(int anFabricare, int vitezaCurenta, String marca) {
        this.AnFabricare = anFabricare;
        this.vitezaCurenta = vitezaCurenta;
        this.marca = marca;
    }

    public VehiculDeBaza(String marca, int anFabricare) {
        this.marca = marca;
        this.AnFabricare = anFabricare;
        this.vitezaCurenta = 0;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnFabricare() {
        return AnFabricare;
    }

    public int getVitezaCurenta() {
        return vitezaCurenta;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAnFabricare(int anFabricare) {
        AnFabricare = anFabricare;
    }

    public void setVitezaCurenta(int vitezaCurenta) {
        this.vitezaCurenta = vitezaCurenta;
    }

    public abstract void accelereaza(int valoare);

    public void franeaza(int valoare) {
        if (vitezaCurenta < 0) {
            vitezaCurenta = 0;
        }
        else {
            vitezaCurenta = vitezaCurenta - valoare;
        }
    }


}
