package prototype.main;


import prototype.classes.IListaOferte;
import prototype.classes.ListaOferte;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listaOferte = new ArrayList<>();
        listaOferte.add("Oferta1");
        listaOferte.add("Oferta2");
        listaOferte.add("Oferta3");
        listaOferte.add("Oferta4");

        IListaOferte listaOferte1 = new ListaOferte("Den1",listaOferte);

        IListaOferte listaOferte2 = listaOferte1.copiaza();

        System.out.println(listaOferte1);
        System.out.println(listaOferte2);


    }
}
