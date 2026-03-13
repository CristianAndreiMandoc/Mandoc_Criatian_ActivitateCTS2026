package simpleFactory.main;

import simpleFactory.classes.Fabrica;
import simpleFactory.classes.IPachetTuristic;
import simpleFactory.classes.TipPachet;

public class Main {
    public static void main(String[] args) throws Exception {
        Fabrica f1 = new Fabrica();
        IPachetTuristic pachet1 = f1.intoarcePachet(TipPachet.PachetCazare, "Destinatie1", 55.50f, 5);
        IPachetTuristic pachet2 = f1.intoarcePachet(TipPachet.PachetTransport, "Destinatie2", 62.50f, 6);
        IPachetTuristic pachet3 = f1.intoarcePachet(TipPachet.PachetCazareTransport, "Destinatie3", 75.50f, 7);

        pachet1.descriere();
        pachet2.descriere();
        pachet3.descriere();
    }
}
