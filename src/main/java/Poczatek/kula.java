package Poczatek;

import java.util.Scanner;

public class kula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj promień: ");
        double promień = scanner.nextDouble();
        double objetosc = (4.0 * Math.PI * promień * promień * promień)/3;
        System.out.println("Objętość kuli wynosi: " + objetosc);
    }
}
