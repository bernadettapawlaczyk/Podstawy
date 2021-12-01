package Kolekcje;

import java.util.ArrayList;
import java.util.Collections;

public class cdKolekcje {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add( "Przechrzta");
        lista.add( "Gołkowski");
        lista.add("Komuda");
        lista.add("Morrell");

        System.out.println("1");
        for (String e : lista){
            System.out.println(e );
        }

        Collections.sort(lista);

        System.out.println("2");
        for (String e : lista){
            System.out.println(e);
        }

        System.out.println("3");
        System.out.println(Collections.min(lista));

        System.out.println("4");
        System.out.println(Collections.max(lista));

        System.out.println("5");
        Collections.reverse(lista);
        for(String e : lista){
            System.out.println(e);
        }

        System.out.println("6");
        Collections.shuffle(lista);
        for (String e : lista){
            System.out.println(e);
        }

        ArrayList<Animal> psy = new ArrayList<Animal>();
        Animal pies1 = new Animal("Goya");
        Animal pies2 = new Animal("Brutus");
        Animal pies3 = new Animal("Dragon");
        Animal pies4 = new Animal("Maxymilian");
        Animal pies5 = new Animal("Maxymilian");
        pies4.wiek = 10;

        psy.add(pies1);
        psy.add(pies2);
        psy.add(pies3);
        psy.add(pies4);
        psy.add(pies5);

        System.out.println("================");
        for(Animal pies : psy){
            System.out.println(pies.name + " " + pies.wiek + " lat.");
        }

        Collections.sort(psy);

        System.out.println("================");
        for(Animal pies : psy){
            System.out.println(pies.name + " " + pies.wiek + " lat.");
        }

        System.out.println("===============");
    }
}
