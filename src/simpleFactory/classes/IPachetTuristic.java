package simpleFactory.classes;

public abstract class IPachetTuristic {

    protected String destinate;
    protected float pret;
    protected int nrNopti;

    public IPachetTuristic(String destinate, float pret, int nrNopti) {
        this.destinate = destinate;
        this.pret = pret;
        this.nrNopti = nrNopti;
    }

    public abstract void descriere ();



}
