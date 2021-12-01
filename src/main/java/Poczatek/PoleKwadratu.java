package Poczatek;

import java.util.Scanner;

public class PoleKwadratu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj długość boku: ");
        int bok = scanner.nextInt();

        if(bok < 1){
            System.out.println("Długość boku nie może być 0 oraz ujemna, podaj długość boku jeszcze raz");
            do {
                System.out.println("Podaj długość boku jeszcze raz");
                bok = scanner.nextInt();
                System.out.println("Pole wkadratu wynosi : " + bok * bok);
                break;
            }while (bok > 1);
        }else {
            System.out.println("Pole wkadratu wynosi : " + bok * bok);
        }
    }
}
