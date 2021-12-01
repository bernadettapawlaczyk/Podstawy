package Poczatek;

public class Zad_10 {
    /*
    dla podanej liczby całkowitej nieujemnej n, obliczy sumę wszystkich jej cyfr i wyświetl
otrzymany wynik, a następnie powtórz te dwie czynności dla obliczonej sumy, itd. Ten proces
winien być zakończony, gdy obliczona suma cyfr będzie liczbą jednocyfrową, np. dla n=7895,
należy wyświetlić liczby: 29, 11, 2.
     */
    public static void main(String[] args) {

        int liczba = 7895;
        String napis = String.valueOf(liczba);
        int suma = 0;
        int ileCyfr = napis.length();

        for (int i = 0; i < ileCyfr; i++){
            char znak = napis.charAt(i);
            int cyfra = Character.getNumericValue(znak);
            suma = suma + cyfra;
        }
        System.out.println(suma);
    }
}
