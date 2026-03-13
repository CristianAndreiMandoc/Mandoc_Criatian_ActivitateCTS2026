package builder.classes;

public class PachetTransport {
    private boolean areWifi;
    private boolean acceptaAnimale;
    private boolean areLocFumat;
    private  boolean areAC;
    private boolean areTV;

    public PachetTransport(boolean areWifi, boolean acceptaAnimale, boolean areLocFumat, boolean areAC, boolean areTV) {
        this.areWifi = areWifi;
        this.acceptaAnimale = acceptaAnimale;
        this.areLocFumat = areLocFumat;
        this.areAC = areAC;
        this.areTV = areTV;
    }

    public void setAreWifi(boolean areWifi) {
        this.areWifi = areWifi;
    }

    public void setAcceptaAnimale(boolean acceptaAnimale) {
        this.acceptaAnimale = acceptaAnimale;
    }

    public void setAreLocFumat(boolean areLocFumat) {
        this.areLocFumat = areLocFumat;
    }

    public void setAreAC(boolean areAC) {
        this.areAC = areAC;
    }

    public void setAreTV(boolean areTV) {
        this.areTV = areTV;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PachetTransport{");
        sb.append("areWifi=").append(areWifi);
        sb.append(", acceptaAnimale=").append(acceptaAnimale);
        sb.append(", areLocFumat=").append(areLocFumat);
        sb.append(", areAC=").append(areAC);
        sb.append(", areTV=").append(areTV);
        sb.append('}');
        return sb.toString();
    }
}
