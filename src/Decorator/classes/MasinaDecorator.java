package Decorator.classes;

public abstract class MasinaDecorator implements Masina {
    protected Masina masinaDecorata;

    public MasinaDecorator(Masina masinaDecorata) {
        this.masinaDecorata = masinaDecorata;
    }

    @Override
    public String getDescriere() {
        return masinaDecorata.getDescriere();
    }

    @Override
    public double getCost() {
        return masinaDecorata.getCost();
    }
}