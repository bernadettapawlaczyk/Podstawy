package Poczatek;

import java.util.Scanner;

public class WczytywanieLiczb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę z zakresu 1 do 100");
        int liczba = scanner.nextInt();

        if(liczba < 0 || liczba > 101){
            System.out.println("Podana liczba wykracza poza zakres");
            do {
                System.out.println("Podaj liczbę jeszcze raz");
                liczba = scanner.nextInt();
            }while (liczba >= 0 && liczba <= 100 );
        }else {
            System.out.println("Podana liczba " + liczba + " mieści się w zakresie");
        }
    }
}
