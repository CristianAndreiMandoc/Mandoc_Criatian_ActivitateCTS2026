package Adapter.classes;

public class MufaOBD2Standard implements IMufaDiagnoza {
    @Override
    public void conecteaza(String modelMasina) {
        System.out.println("[Conexiune Directa] S-a conectat mufa OBD2 la masina: " + modelMasina);
    }
}