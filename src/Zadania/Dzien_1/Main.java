package Zadania.Dzien_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Zadanie_1();
        //Zadanie_2();
        //Zadanie_3();
        //Zadanie_4();
        //Zadanie_5();
        //Zadanie_6();
        //Zadanie_7();
        //Zadanie_8();
        //Zadanie_9("https://www.wp.pl");
        //Zadanie_10();
        //Zadanie_11();
        //Zadanie_12();
        //Zadanie_13();
        //Zadanie_14();
        //Zadanie_15(); klasa zrobiona
        //Zadanie_16();
        //Zadanie_17(); nie wiem jak wypisac wszystkie stworzone
        //Zadanie_18();
        //Zadanie_19();

        scanner.close();
    }

    public static void Zadanie_1() {
        System.out.println("Zadanie_1");
        System.out.println("Podaj liczbe");
        int liczba = scanner.nextInt();
        if (liczba > 5)
            System.out.println("Podana liczba wieksza od 5");
        else {
            System.out.println("podana lizcba miejsza lub rowna 5");
        }
    }

    public static void Zadanie_2() {
        System.out.println("Zadanie_2");
        System.out.println("Podaj liczbe");
        int liczba = scanner.nextInt();
        if (liczba % 3 == 0)
            System.out.println("Podana liczba jest podzielna przez 3");
        else {
            System.out.println("Podana lizcba nie jest podzielna przez trzy");
        }
    }

    public static void Zadanie_3() {
        System.out.println("Zadanie_3");
        System.out.println("Podaj wyraz");
        String word = scanner.next();
        if (word.length() > 3)
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == 'J')
                    if (word.charAt(i + 1) == 'a')
                        if (word.charAt(i + 2) == 'v')
                            if (word.charAt(i + 3) == 'a') {
                                System.out.println("Podane slowo zawiera wyraz Java");
                                break;
                            }

                if (word.length() - i < 4) {
                    System.out.println("Podane slowo nie zawiera wyrazu Java");
                    break;
                }

            }
        else {
            System.out.println("Podane slowo nie zawiera wyrazu Java");
        }

    }

    public static void Zadanie_4() {//dodatowo można dodać więcej wyjątków(zaczytać bazę czy coś)
        System.out.println("Zadanie_4");
        System.out.println("Podaj polskie imie");
        String word = scanner.next();
        if (word.charAt(word.length() - 1) == 'a') {
            if (word.toUpperCase() != "KUBA")
                System.out.println("To imie żeńskie");
            else {
                System.out.println("To imie meskie");
            }
        } else {
            System.out.println("to imie meskie");
        }
    }

    public static void Zadanie_5() {
        System.out.println("Zadanie_5");
        System.out.println("Podaj 3 liczby:");
        int[] tab = new int[3];
        int max;
        max = tab[0] = scanner.nextInt();
        tab[1] = scanner.nextInt();
        tab[2] = scanner.nextInt();
        if (tab[1] > max)
            max = tab[1];
        if (tab[2] > max)
            max = tab[2];

        System.out.println("Najwieksza liczba to " + max);
    }

    public static void Zadanie_6() {
        System.out.println("Zadanie_6");
        System.out.println("Podaj wyraz");
        String word = scanner.next();
        if (word.toUpperCase().charAt(word.length() - 1) == 'M')
            System.out.println("Ostatnia litera to M lub m");
        else
            System.out.println("Otatnia litera to nie M ani m");
    }

    public static void Zadanie_7() {
        System.out.println("Zadanie_7");
        System.out.println("Podaj wyraz");
        String word = scanner.next();
        if (word.charAt(0) == word.charAt(word.length() - 1))
            System.out.println("Pierwsza i ostatnia litera wyrazu sa takie same");
        else
            System.out.println("Pierwsza i ostatnia litera wyrazu nie sa takie same");
    }

    public static void Zadanie_8() {
        System.out.println("Zadanie_8");
        System.out.println("Podaj 2 wyraz");
        String word = scanner.next();
        String word2 = scanner.next();
        int ile = 0, ile2 = 0;
        for (int i = 0; i < word.length(); i++)
            if (word.charAt(i) > 64 && word.charAt(i) < 91)
                ile++;
        for (int j = 0; j < word2.length(); j++) {
            if (word2.charAt(j) > 64 && word2.charAt(j) < 91)
                ile2++;
        }
        if (ile != ile2)
            System.out.println("Wyrazy maja inna lizcbe dużych liter");
        else
            System.out.println("Wyrazy mają taką samą ilosc duzych liter");
    }

    public static void Zadanie_9(String word) {
        System.out.println("Zadanie_9");
        //System.out.println("Podaj adreas url");
        //String word = scanner.next();
        boolean test = false;
        if (word.length() > 14) {
            if (word.substring(0, 11).compareTo("http://www.") == 0 && word.substring(word.length() - 3, word.length()).compareTo(".pl") == 0) {
                System.out.println("Adres jest poprawny");
                test = true;
            }
        }
        if (word.length() > 15) {
            if (word.substring(0, 12).compareTo("https://www.") == 0 && word.substring(word.length() - 3, word.length()).compareTo(".pl") == 0) {
                System.out.println("Adres jest poprawny");
                test = true;
            }
        }
        if (word.length() > 7) {
            if (word.substring(0, 4).compareTo("www.") == 0 && word.substring(word.length() - 3, word.length()).compareTo(".pl") == 0) {
                System.out.println("Adres jest poprawny");
                test = true;
            }
        }
        if (!test)
            System.out.println("Adres jest niepoprawny");
    }

    public static void Zadanie_10() {
        System.out.println("Zadanie_10");
        System.out.println("Podaj wyraz");
        String word = scanner.next();
        boolean test = false;
        for (int i = 0; i < word.length(); i++)
            if (word.charAt(i) == 'k' && word.charAt(i + 4) == 'k')
                if (word.charAt(i + 1) == 'a' && word.charAt(i + 3) == 'a')
                    if (word.charAt(i + 2) == 'j') {
                        System.out.println("Wyraz zawiera slowo kajak");
                        test = true;
                        break;
                    }
        if (!test)
            System.out.println("Wyraz nie zawiera slowa kajak");
    }

    public static void Zadanie_11() {
        System.out.println("Zadanie_10");
        System.out.println("Podaj kod pocztowy");
        String word = scanner.next();
        boolean test = false;

        if (word.length() == 6)
        {
            if(word.charAt(0)>47&&word.charAt(0)<58)
                if(word.charAt(1)>47&&word.charAt(0)<58)
                    if(word.charAt(3)>47&&word.charAt(0)<58)
                        if(word.charAt(4)>47&&word.charAt(0)<58)
                            if(word.charAt(5)>47&&word.charAt(0)<58)
                                if (word.charAt(2) == '-') {
                                System.out.println("Podany wyraz moze byc kodem pocztowym");
                                test = true;
                            }
        }

        if (!test)
            System.out.println("Podany wyraz nie moze byc kodem pocztowym");
    }

    public static void Zadanie_12() {
        System.out.println("Zadanie_12");
        System.out.println("Podaj liczbe");
        int liczba = scanner.nextInt();
        if (liczba % 3 == 0||liczba % 5 == 0)
            System.out.println("Podana liczba jest podzielna przez 3 lub 5");
        else {
            System.out.println("Podana lizcba nie jest podzielna przez 3 ani przez 5");
        }
    }

    public static void Zadanie_13() {
        System.out.println("Zadanie_13");
        System.out.println("Podaj swoj wiek");
        int liczba = scanner.nextInt();
        if (liczba > 17)
            System.out.println("Jestes pelnoletni");
        else {
            System.out.println("Nie jestes pelnoletni");
        }
    }

    public static void Zadanie_14() {
        System.out.println("Zadanie_13");
        System.out.println("Podaj swoj wiek i wiek kogoś innego");
        int liczba = scanner.nextInt();
        int liczba2=scanner.nextInt();
        if (liczba > 13 && liczba<18)
            System.out.println("Jestesnie nastolatkami");
        else {
            System.out.println("Nie jestes nastolatkami");
        }
    }

    public static void Zadanie_16() {
        System.out.println("Zadanie_16");
        Pracownik Marek=new Pracownik("Marek","Jastrzab",4300,35);
        System.out.println("Podaj parametry Praconika:");
        System.out.println("Imie: ");
        String imie=scanner.next();
        System.out.println("Nazwisko: ");
        String nazwisko=scanner.next();
        System.out.println("Miesieczna pensje: ");
        int pensja=scanner.nextInt();
        System.out.println("Wiek pracownika: ");
        int wiek=scanner.nextInt();
        Pracownik pracownik=new Pracownik(imie,nazwisko,pensja,wiek);
        while(!pracownik.poprawnoscImie()) {
            System.out.println("Podaj poprawne imie");
            imie=scanner.next();
            pracownik.setImie(imie);
        }

        while(!pracownik.poprawnoscNazwisko()){
            System.out.println("Podaj poprawne Nazwisko");
            nazwisko=scanner.next();
            pracownik.setNazwisko(nazwisko);
        }
        System.out.println("Pensja roczna Marka to "+Marek.pensjaRoczna()+"zł");
    }

    public static void Zadanie_17(){
        System.out.println("Zadanie_17");
        Post post = new Post( "Programowanie w Javie to przygoda" , "Programowanie jest super" );
        Post secondPost = new Post( "W Ruby występują wszystkie zmienne" , "Programowanie w Ruby" );
        Post.findAll();
    }

    public static void Zadanie_18(){
        System.out.println("Zadanie_18");
        System.out.println("Stworz tablice liczb (zakoncz wpisywanie x)");
        int number;
        List<Integer> numbers=new ArrayList<>();
        String a;

        while(true){
            if((a=scanner.next()).compareTo("x")!=0) {
                number=Integer.parseInt(a);
                numbers.add(number);
            }
            else
                break;
        }
        System.out.println("Twoje liczby");
        System.out.println(numbers);
        System.out.println("Twoje liczby po przetworzeniu");
        System.out.println(getDevidetByThree(numbers));
    }

    public static List<Integer> getDevidetByThree(List<Integer> numbers){
        List<Integer> newNumbers=new ArrayList<>();
        for (int i = 0; i <numbers.size() ; i++) {
            if(numbers.get(i)%3==0)
                newNumbers.add(numbers.get(i));
        }
        return newNumbers;
    }

    public static void Zadanie_19(){
        System.out.println("Zadanie_19");
        System.out.println("Stworz tablice liczb (zakoncz wpisywanie x)");
        int number;
        List<Integer> numbers=new ArrayList<>();
        String a;

        while(true){
            if((a=scanner.next()).compareTo("x")!=0) {
                number=Integer.parseInt(a);
                numbers.add(number);
            }
            else
                break;
        }
        System.out.println("Twoje liczby");
        System.out.println(numbers);
        System.out.println("Twoje posortowane liczby");
        System.out.println(getSortedList(numbers));
    }

    public static List<Integer> getSortedList(List<Integer> numbers){
        List<Integer> sortedNumbers=new ArrayList<>();
        int[] tab=new int[numbers.size()];

        int number;
        boolean test;
        for (int i = 0; i <numbers.size(); i++) {
            tab[i]=numbers.get(i);
        }

        do{
            test=false;
            for(int ile=0;ile<tab.length-1;ile++)
            if(tab[ile]>tab[ile+1]){
                number=tab[ile];
                tab[ile]=tab[ile+1];
                tab[ile+1]=number;
                test=true;
            }
        }while(test);

        for(int j=0;j<tab.length;j++)
            sortedNumbers.add(tab[j]);
        return sortedNumbers;
    }
}
