package simpleFactory.classes;

public class PachetCazareTransport extends IPachetTuristic{


    public PachetCazareTransport(String destinate, float pret, int nrNopti) {
        super(destinate, pret, nrNopti);
    }

    @Override
    public void descriere() {
        System.out.println("Acesta este un pachet de cazare si transport"+super.destinate);
    }
}
