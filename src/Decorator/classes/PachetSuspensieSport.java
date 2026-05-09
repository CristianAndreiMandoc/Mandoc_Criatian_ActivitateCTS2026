package Decorator.classes;

public class PachetSuspensieSport extends MasinaDecorator {
    public PachetSuspensieSport(Masina masinaDecorata) {
        super(masinaDecorata);
    }

    @Override
    public String getDescriere() {
        return super.getDescriere() + ", suspensie rigida coborata";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1500.00;
    }
}