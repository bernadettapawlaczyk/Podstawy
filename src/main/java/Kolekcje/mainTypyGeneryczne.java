package Kolekcje;

import java.util.ArrayList;

public class mainTypyGeneryczne {
    public static void main(String[] args) {
        Ksiazki ksiazki1 = new Ksiazki("Historyczne");
        Ksiazki ksiazki2 = new Ksiazki("Powieści historyczne");
        Ksiazki ksiazki3 = new Ksiazki("Sensacyjne");
        Ksiazki ksiazki4 = new Ksiazki("Fantastyka");

        ArrayList<Ksiazki> lista = new ArrayList<Ksiazki>();
        lista.add(ksiazki1);
        lista.add(ksiazki2);
        lista.add(ksiazki3);
        lista.add(ksiazki4);

        for(Object k : lista){
            System.out.println(((Ksiazki)k).kategorie);
        }
        System.out.println("size " + lista.size());
        System.out.println();
        System.out.println(((Ksiazki)lista.get(1)).kategorie);
        System.out.println(((Ksiazki)lista.remove(3)).kategorie + " została usunięta");
        System.out.println(lista.size());
        System.out.println(lista.get(0).kategorie);
    }
}
