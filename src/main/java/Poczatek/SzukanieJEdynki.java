package Poczatek;

import java.util.Scanner;

public class SzukanieJEdynki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kilka liczb");
        int liczba1 = scanner.nextInt();
        int liczba2 = scanner.nextInt();
        int liczba3 = scanner.nextInt();
        int liczbaOdp = 0;

            if(liczba1 == 1 || liczba2 == 1 || liczba3 == 1){
                System.out.println("Tak w podanych liczbach znajduje sie liczba 1");
            }else {
                System.out.println("Podaj liczby jeszcze raz");
            }
    }
}
