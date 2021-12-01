package Poczatek;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Petla_zadanie_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę dodatnią: ");
        int liczba = scanner.nextInt();

            if (liczba < 0) {
                System.out.println("Podałeś liczbę ujemną " + liczba + ". Podaj liczbę jeszcze raz");
                do {
                    System.out.println("Podałeś liczbę dodatnią");
                    liczba = scanner.nextInt();
                }while (liczba >= 0);

            } else {
                System.out.println("Podałeś liczbę dodatnią " + liczba);
            }

    }
}
