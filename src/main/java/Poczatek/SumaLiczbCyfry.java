package Poczatek;

import java.util.Scanner;

public class SumaLiczbCyfry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą");
        int liczba = scanner.nextInt();
        int suma = 0;

        for (int i = 1; i <= liczba; i++){
            suma = suma + i;
        }
        System.out.println("Suma liczby " + liczba + " to " + suma);
    }
}
