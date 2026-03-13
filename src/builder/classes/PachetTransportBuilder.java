package builder.classes;

public class PachetTransportBuilder implements IBuilder {

    private PachetTransport pachet;

    public PachetTransportBuilder() {
        this.pachet = new PachetTransport(false,false,false,false,false);

    }

    @Override
    public PachetTransport build() {
        return pachet;
    }

    public PachetTransportBuilder setAreWifi(boolean areWifi) {
        this.pachet.setAreWifi(areWifi);
        return this;
    }

    public PachetTransportBuilder setAcceptaAnimale(boolean acceptaAnimale) {
        this.pachet.setAcceptaAnimale(acceptaAnimale);
        return this;
    }

    public PachetTransportBuilder setAreLocFumat(boolean areLocFumat) {
        this.pachet.setAreLocFumat(areLocFumat);
        return this;
    }

    public PachetTransportBuilder setAreAC(boolean areAC) {
        this.pachet.setAreAC(areAC);
        return this;
    }

    public PachetTransportBuilder setAreTV(boolean areTV) {
        this.pachet.setAreTV(areTV);
        return this;
    }
}
