package Poczatek;

import java.util.Scanner;

public class PobieranieZnaku {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj znak : t lub T, albo n lub N");
        String znak = scanner.next();

        if(znak.equals("n") || znak.equals("N") || znak.equals("t") || znak.equals("T")){
            System.out.println("podany znak " + znak + " jest prawidłowy");
        }
        else {
            do {
                System.out.println("podałęś błędny znak. Spróbuj jeszcze raz");
                znak = scanner.next();
               break;
            }while (znak.equals(znak));
            System.out.println("podany znak " + znak + " jest prawidłowy");
        }
    }
}
