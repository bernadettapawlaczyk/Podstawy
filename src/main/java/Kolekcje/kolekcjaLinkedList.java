package Kolekcje;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class kolekcjaLinkedList {
    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();
        lista.add("Ełk");
        lista.add("Elbląg");
        lista.add("Kraków");
        lista.add("Kraków");
        lista.add("Augustów");

        if(lista.contains("Kraków") == false){
            lista.add("Kraków");
        }

        for(String e : lista){
            System.out.println(e);
        }
        lista.clear();

        System.out.println("_______________________");
        HashMap<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "Poniedziałek");
        mapa.put(5, "Piątek");
        mapa.put(7, "Niedziela");
        System.out.println(mapa.get(5));
        System.out.println("_________________");

        for(String e : mapa.values()){
            System.out.println(e);
        }
        System.out.println("size " + mapa.size());


        LinkedHashSet<String> zbior = new LinkedHashSet<>();
        zbior.add("Ala");
        zbior.add("Gabriela");
        zbior.add("Wiesia");
        zbior.add("Wiesia");

        System.out.println();
        for (String e : zbior){
            System.out.println(e);
        }
        System.out.println("----------");

        System.out.println(zbior.size());

    }
}
