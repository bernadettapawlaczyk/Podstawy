package Poczatek;

public class Poczatek {
    public static void main(String[] args) {
        System.out.println("Ania \nBartek \nKasia");

        int liczba1 = 1;
        int liczba2 = 2;
        int liczba3 = 3;
        int liczba4 = 4;

        String nazwa1 = "Jeden";
        String nazwa2 = "Dwa";
        String nazwa3 = "Trzy";
        String nazwa4 = nazwa1 + nazwa2 + nazwa3;

        System.out.println(nazwa4);
        System.out.println(nazwa4.substring(0,7));
        /*
            wyświeltlony jest ciąg znaków od 0 do 7
         */
    }
}
