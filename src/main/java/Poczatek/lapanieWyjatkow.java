package Poczatek;

public class lapanieWyjatkow {
    private static String imie;
    private String nazwisko;
    private static int wiek;

    public lapanieWyjatkow(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public static void main(String[] args) {
        try{
            lapanieWyjatkow lw = new lapanieWyjatkow("Asia", "Nowak", -1);
        }catch (IllegalArgumentException e){
            if (wiek <= 0) {
                System.out.println("Wystąpił błąd, wiek nie może być mniejszy od zera " + e.getMessage());
            }
        }

        try{
            lapanieWyjatkow lp = new lapanieWyjatkow(null, "Kowlaski", 2);
        }catch (NullPointerException e){
            if(imie == null){
                System.out.println("Wystąpił błąd" + e.getMessage());
            }
        }
    }
}


