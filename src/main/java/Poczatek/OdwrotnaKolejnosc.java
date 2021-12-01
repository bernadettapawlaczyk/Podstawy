package Poczatek;

import java.util.Scanner;

public class OdwrotnaKolejnosc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int liczba = scanner.nextInt();

        do {
            System.out.print(liczba + " ");
            liczba--;
        }while (liczba >= 0);
    }
}
