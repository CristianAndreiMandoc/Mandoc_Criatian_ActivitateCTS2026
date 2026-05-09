package Decorator.classes;

public class FraneCeramice extends MasinaDecorator {
    public FraneCeramice(Masina masinaDecorata) {
        super(masinaDecorata);
    }

    @Override
    public String getDescriere() {
        return super.getDescriere() + ", frane ceramice perforate";
    }

    @Override
    public double getCost() {
        return super.getCost() + 3000.00;
    }
}