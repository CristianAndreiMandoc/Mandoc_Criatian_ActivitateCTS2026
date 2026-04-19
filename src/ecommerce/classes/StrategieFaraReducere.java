package ecommerce.classes;

public class StrategieFaraReducere implements StrategieReducere {
    @Override
    public double aplicaReducere(double suma) {
        return suma; // Nicio reducere, returnăm suma întreagă
    }
}