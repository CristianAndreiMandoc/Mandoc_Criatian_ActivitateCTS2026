package simpleFactory.classes;

public class Fabrica {
    public IPachetTuristic intoarcePachet(TipPachet tip,String destinate, float pret, int nrNopti) throws Exception {
        switch(tip) {
            case PachetCazare: return new PachetCazare(destinate, pret, nrNopti);
            case PachetTransport: return new PachetTransport(destinate, pret, nrNopti);
            case PachetCazareTransport: return new PachetCazareTransport(destinate, pret, nrNopti);
            default: throw new Exception("Nu este un tip valid de pachet");
        }

    }

}
