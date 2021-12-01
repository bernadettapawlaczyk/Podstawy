package Poczatek;

import java.util.InputMismatchException;
import java.util.Scanner;

public class poleProstokata_i_lapanieWyjatku {
    public static void main(String[] args) {

        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Długość boku a: ");
            double liczba1 = scanner.nextDouble();
            System.out.println("Długość boku b: ");
            double liczba2 = scanner.nextDouble();

            System.out.println("Pole prostokąta wynosi: " + (liczba1 * liczba2));
        }
        catch (InputMismatchException e){
            System.out.println("Wprowadzono błędne dane");
        }
    }
}
