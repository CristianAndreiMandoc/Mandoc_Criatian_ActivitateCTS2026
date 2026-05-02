package monitorizare.classes;

public class SistemVentilatie implements Observer {
    private boolean estePornit = false;

    @Override
    public void update(double temperatura) {
        if (temperatura > 25.0) {
            estePornit = true;
        } else {
            estePornit = false;
        }
    }

    public boolean isPornit() {
        return estePornit;
    }
}