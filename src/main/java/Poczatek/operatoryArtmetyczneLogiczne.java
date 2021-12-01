package Poczatek;

public class operatoryArtmetyczneLogiczne {
    public static void main(String[] args) {
        double a = 2.3;
        double b = 3.4;
        double c = 4.5;

        double wynik = (a + b) * c;
        double wynik1 = a - b / c;

        System.out.println("(a + b) * c = " + wynik);
        System.out.println("a - b / c = " + wynik1);

        a++;
        b++;
        c++;

        System.out.println("(a + b) > c? " + ((a + b) > c));
        System.out.println("czy a jest równe b? " + (a==b));
    }
}
