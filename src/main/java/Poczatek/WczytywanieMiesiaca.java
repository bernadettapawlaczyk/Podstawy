package Poczatek;

import java.util.Scanner;

public class WczytywanieMiesiaca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj numer miesiąca: ");
        int miesiac = scanner.nextInt();
        int ilosc =  2;

        if(miesiac >= 1 && miesiac <= 12){
            System.out.println("Podany przez Ciebie miesiąc to: " + miesiac);
        }else {
            System.out.println("Błąd!! Podaj jeszcze raz");
            for(int i = 1; i <= ilosc; i++){
                System.out.println("Ponownie żle podałeś numer miesiąca. Podaj jeszcze raz!");
                miesiac = scanner.nextInt();
                if(ilosc == 2){
                    System.out.println("Błąd!! Koniec programu");
                }
            }
        }

    }
}
