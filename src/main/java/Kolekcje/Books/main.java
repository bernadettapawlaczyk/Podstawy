package Kolekcje.Books;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class main {
    public static void main(String[] args) {
        LinkedList<String> book = new LinkedList<>();
        book.add("SibirPunk");
        book.add("Stalker");
        book.add("Stalowe szczury");
        book.add("Moskal");

        for (String e : book) {
            System.out.println(e);
        }

        System.out.println("___________________");
        System.out.println("LinkedList");
        System.out.println("size " + book.size());
        System.out.println("first " + book.getFirst());

        ArrayList<String> otherBook = new ArrayList<>();
        otherBook.add("Demony Leningradu");
        otherBook.add("Demony wojny");
        otherBook.add("Demony czasu pokoju");
        otherBook.add("Abakumow");
        otherBook.add("Beria");


        System.out.println("--------------");
        System.out.println("HashSet");
        for (String e : otherBook) {
            System.out.println(e);
        }

        System.out.println("------");
        Collections.sort(otherBook);

        for(String e : otherBook){
            System.out.println(e);
        }

        System.out.println("=========");
        System.out.println(Collections.min(otherBook));
        System.out.println("=========");
        System.out.println(Collections.max(otherBook));
    }
}
