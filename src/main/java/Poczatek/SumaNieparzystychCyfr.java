package Poczatek;

import java.util.Scanner;

public class SumaNieparzystychCyfr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj cyfrę");
        int cyfra = scanner.nextInt();
        int suma = 0;

        for (int i = 1; i <= cyfra; i++){
            if(i % 2 != 0){
                System.out.println(suma = suma + i);
            }
        }
    }
}
