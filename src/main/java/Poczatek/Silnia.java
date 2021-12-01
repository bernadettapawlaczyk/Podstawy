package Poczatek;

public class Silnia {
    public static void main(String[] args) {
        int liczba = 5;
        int silnia = 1;
        for(int i = 1; i <= liczba; i++){
            silnia = silnia * i;
        }
        System.out.println(silnia);
    }
}
