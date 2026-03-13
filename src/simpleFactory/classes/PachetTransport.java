package simpleFactory.classes;

public class PachetTransport extends IPachetTuristic{

    public PachetTransport(String destinate, float pret, int nrNopti) {
        super(destinate, pret, nrNopti);
    }

    @Override
    public void descriere() {
        System.out.println("Acesta este un pachet de transport"+super.destinate);
    }
}
