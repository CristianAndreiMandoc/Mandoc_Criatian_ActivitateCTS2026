package ecommerce.classes;

public class StrategieReducereProcentuala implements StrategieReducere {
    private final double procent;

    public StrategieReducereProcentuala(double procent) {
        if (procent < 0 || procent > 100) {
            throw new IllegalArgumentException("Procentul trebuie să fie între 0 și 100");
        }
        this.procent = procent;
    }

    @Override
    public double aplicaReducere(double suma) {
        if (suma < 0) {
            throw new IllegalArgumentException("Suma nu poate fi negativă");
        }
        return suma - (suma * procent / 100);
    }
}