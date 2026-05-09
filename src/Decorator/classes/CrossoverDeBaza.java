package Decorator.classes;

public class CrossoverDeBaza implements Masina {
    @Override
    public String getDescriere() {
        return "Crossover 5 usi standard";
    }

    @Override
    public double getCost() {
        return 20000.00;
    }
}