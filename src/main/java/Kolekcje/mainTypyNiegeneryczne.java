package Kolekcje;

import java.util.ArrayList;

public class mainTypyNiegeneryczne {
    public static void main(String[] args) {
        Ksiazki ksiazki1 = new Ksiazki("Historyczne");
        Ksiazki ksiazki2 = new Ksiazki("Powieści historyczne");
        Ksiazki ksiazki3 = new Ksiazki("Sensacyjne");
        Ksiazki ksiazki4 = new Ksiazki("Fantastyka");

        ArrayList lista = new ArrayList();
        lista.add(ksiazki1);
        lista.add(ksiazki2);
        lista.add(ksiazki3);
        lista.add(ksiazki4);
        System.out.println("-----------");
        for (Object k : lista){
            System.out.println(((Ksiazki)k).kategorie);
        }
        System.out.println("-----------");

        System.out.println(((Ksiazki)lista.get(0)).kategorie);
        System.out.println("-----------");
        System.out.println(lista.size());
        System.out.println("-----------");
        System.out.println("na mojej liście znajduje się obiekt 1" + lista.contains(ksiazki1));
        System.out.println("-----------");
        lista.remove(ksiazki4);
        System.out.println(lista.size());

    }
}
