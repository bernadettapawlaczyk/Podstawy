package Kolekcje;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class cdKolejkaStosKolekcje {
    public static void main(String[] args) {
        Queue<String> kolejka = new ArrayDeque<>();
        kolejka.add("Pierwszy");
        kolejka.add("Drugi");
        kolejka.add("Trzeci");

        for(String e : kolejka){
            System.out.println(e);
        }

        System.out.println(kolejka.size());
        System.out.println(kolejka.peek()); //podgląda
        System.out.println(kolejka.remove()); //usuwa
        System.out.println(kolejka.poll());
        System.out.println(kolejka.remove());

        System.out.println(kolejka.size());
        System.out.println("\n\n Stos");
        Stack<String> stos = new Stack<>();
        stos.push("Jeden");
        stos.push("Dwa");
        stos.push("Trzy");

        for(String e : stos){
            System.out.println(e);
        }

        System.out.println(stos.size());
        System.out.println(stos.pop());
        System.out.println(stos.size());
        stos.push("ostatni");
        System.out.println(stos.pop());
        stos.peek();
        System.out.println(stos.pop());
        System.out.println(stos.pop());
    }
}
