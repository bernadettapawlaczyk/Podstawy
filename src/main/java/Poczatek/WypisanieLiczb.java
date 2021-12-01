package Poczatek;

public class WypisanieLiczb {
    public static void main(String[] args) {
        int liczba = 1;

        while (liczba <= 10) {
            if (liczba != 10) {
                System.out.print(liczba++ + ", ");
            } else {
                System.out.print(liczba++);
            }
        }
    }
}