package Poczatek;

import java.util.Scanner;

public class IloscCyfrLiczby {
    /*
    dla wczytanej z klawiatury liczby naturalnej wypisuje ilość cyfr tej liczby
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String liczba = scanner.next();
        System.out.println("Ilość cyfr w podanej liczbie to: " + liczba.length());
    }
}
