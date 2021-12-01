package Poczatek;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadanie1_8Wyjatki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Podaj długość pierwszego boku: ");
            float bokA = scanner.nextFloat();
            System.out.println("Podaj długość drugiego boku: ");
            float bokB = scanner.nextFloat();
            System.out.println("Pole prostokąta wynosi: " + (bokA * bokB));
        }catch (InputMismatchException e){
            System.out.println("Błędnie podane wymiary");
        }
    }
}
