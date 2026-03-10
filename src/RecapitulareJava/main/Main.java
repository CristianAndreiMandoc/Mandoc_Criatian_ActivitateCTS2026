package RecapitulareJava.main;

import RecapitulareJava.classes.IVehicul;
import RecapitulareJava.classes.Masina;
import RecapitulareJava.classes.Motocicleta;
import RecapitulareJava.classes.VehiculDeBaza;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args){

        VehiculDeBaza masina1 = new Masina(2009, 50, "Audi", "A4", 220, false);
        VehiculDeBaza motocicleta1 = new Motocicleta(2013, 100, "Harley", "Nume1", "negru" );

        masina1.accelereaza(30);
        System.out.println(masina1.getVitezaCurenta());

        ((IVehicul) masina1).afisare();

        VehiculDeBaza masina2 =new Masina(2018, 70, "Dacia", "Logan", 180, true);
        VehiculDeBaza motocicleta2 = new Motocicleta(2009, 70, "Honda", "Nume2", "rosu");

        //Array - vectori
        System.out.println("-------------------------------Array-------------------------------");
        VehiculDeBaza [] vehiculeArray = new VehiculDeBaza[3];
        vehiculeArray[0]= masina1;
        vehiculeArray[1]= motocicleta1;
        vehiculeArray[2] =motocicleta2;

        for (VehiculDeBaza b: vehiculeArray) {
            b.accelereaza(30);
            System.out.println(b.getVitezaCurenta());
        }

        System.out.println(vehiculeArray[0].getAnFabricare());

        //List - liste
        System.out.println("-------------------------------List-----------------------------------");
        List<VehiculDeBaza> lista1 = new ArrayList<>();
        lista1.add(masina1);
        lista1.add(motocicleta1);
        lista1.add(masina2);
        lista1.add(motocicleta2);

        for(VehiculDeBaza b: lista1) {
            b.franeaza(20);
            System.out.println(b.getVitezaCurenta());
        }

        lista1.remove(motocicleta2);

        System.out.println(lista1.get(2).getMarca());

        //Map - contine 2 liste
        System.out.println("------------------------------Map--------------------------------");
        Map<String,VehiculDeBaza> mapVehicul = new HashMap<>();

        mapVehicul.put("Vehicul1", masina1);
        mapVehicul.put("Vehicul2", masina2);
        mapVehicul.put("Vehicul3",motocicleta1);

        for (Map.Entry<String, VehiculDeBaza> m : mapVehicul.entrySet())
        {
            m.getValue().accelereaza(30);
            System.out.println(m.getValue().getVitezaCurenta());
        }

        if(!mapVehicul.containsKey("Vehicul4")) {
            mapVehicul.put("Vehicul4",motocicleta2);
        }

        System.out.println(mapVehicul.get("Vehicul4"));

        for(String m : mapVehicul.keySet()) {
            System.out.println(mapVehicul.get(m));
        }

    }
}