package Poczatek;

import java.util.Scanner;

public class PierwiastekKwadratowy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        double liczba = scanner.nextDouble();

        if(liczba <= 0){
            System.out.println("Podana liczba jest 0-rem lub jest ujemna. ");
            do {
                System.out.println("Wprowadz jeszcze raz liczbę dodatnią: ");
                liczba = scanner.nextDouble();
                System.out.println("Pierwiastek z " + liczba + " to " + Math.sqrt(liczba));
                break;
            }while (liczba > 1);
        }else {
            System.out.println("Pierwiastek z " + liczba + " to " + Math.sqrt(liczba));
        }
    }
}
