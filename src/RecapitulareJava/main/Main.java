package RecapitulareJava.main;

import RecapitulareJava.classes.Masina;
import RecapitulareJava.classes.Motocicleta;
import RecapitulareJava.classes.VehiculDeBaza;

public class Main {

    public static void main(String[] args){

        VehiculDeBaza masina1 = new Masina(2009, 50, "Audi", "A4", 220, false);
        VehiculDeBaza motocicleta1 = new Motocicleta(2013, 100, "Harley", "Nume1", "negru" );

        masina1.accelereaza(30);
        System.out.println(masina1.getVitezaCurenta());

    }
}