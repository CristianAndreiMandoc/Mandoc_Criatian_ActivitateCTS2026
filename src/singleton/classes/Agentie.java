package singleton.classes;

public class Agentie {

    private String nume;
    private int nrAngajati;

    //Instanta statica de tipul clasei
    // EAGER Initialization private static Agentie instanta = new Agentie();

    //Lazy initialization
    private static Agentie instanta = null;

    //Constructorul este privat
    private Agentie(String nume, int nrAngajati) {
        this.nume = nume;
        this.nrAngajati = nrAngajati;
    }

    //Metoda getInstance
    public static synchronized Agentie getInstance(String nume, int nrAngajati ){
        if(instanta == null)
        {
            instanta = new Agentie(nume, nrAngajati);
        }
        return instanta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Agentie{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrAngajati=").append(nrAngajati);
        sb.append('}');
        return sb.toString();
    }
}

