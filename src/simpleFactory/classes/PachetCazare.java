package simpleFactory.classes;

public class PachetCazare extends IPachetTuristic {


    public PachetCazare(String destinate, float pret, int nrNopti) {
        super(destinate, pret, nrNopti);
    }

    @Override
    public void descriere() {
        System.out.println("Acesta este un pachet cazare"+super.destinate);
    }
}
