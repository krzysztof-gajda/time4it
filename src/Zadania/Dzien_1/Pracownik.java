package Zadania.Dzien_1;

public class Pracownik {
    private String imie;
    private String nazwisko;
    private int pensjaMiesiac;
    private int wiek;

    public Pracownik(String imie, String nazwisko, int pensjaMiesiac, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pensjaMiesiac = pensjaMiesiac;
        this.wiek = wiek;
    }

    public boolean poprawnoscImie() {
        if (imie.length() > 4){
            if (imie.charAt(0) > 64 && imie.charAt(0) < 91)
                return true;
            else {
                int CH = imie.charAt(0) + 32;
                imie.replace(imie.charAt(0), ((char) CH));
                return true;
            }
        }
        return false;
    }

    public boolean poprawnoscNazwisko(){
        if(nazwisko.length()>4) {
            if (nazwisko.charAt(0) > 64 && nazwisko.charAt(0) < 91)
                return true;
            else {
                int CH = nazwisko.charAt(0) + 32;
                nazwisko.replace(nazwisko.charAt(0), ((char) CH));
                return true;
            }
        }
        return false;
    }

    public int pensjaRoczna(){
        return pensjaMiesiac*12;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
}
