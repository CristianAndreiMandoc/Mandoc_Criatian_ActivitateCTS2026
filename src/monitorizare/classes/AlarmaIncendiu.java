package monitorizare.classes;

public class AlarmaIncendiu implements Observer {
    private boolean alarmaDeclansata = false;

    @Override
    public void update(double temperatura) {
        if (temperatura > 60.0) {
            alarmaDeclansata = true;
        } else {
            alarmaDeclansata = false;
        }
    }

    public boolean isDeclansata() {
        return alarmaDeclansata;
    }
}