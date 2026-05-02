package monitorizare.classes;

public interface Subject {
    void adaugaAbonat(Observer o);
    void stergeAbonat(Observer o);
    void notificaAbonati();
}