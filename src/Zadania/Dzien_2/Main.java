package Zadania.Dzien_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //Zadanie_20();
        //Zadanie_21(); nie wim o co chodzi????
        //Zadanie_22();
        //Zadanie_23();
        //Zadanie_24();
        //Zadanie_25();
        //Zadanie_26();
        //Zadanie_27();
        //Zadanie_28();
        //Zadanie_29();
        //Zadanie_30();
        //Zadanie_31();
        //Zadanie_32();
        //Zadanie_33();
        //Zadanie_34();
        //Zadanie_35();
        //Zadanie_36();
        //Zadanie_37();
        //Zadanie_38();
        //Zadanie_39();
        //Zadanie_40();
        //Zadanie_41();

        scanner.close();
    }
    public static void Zadanie_20(){
        int n;
        System.out.println("Zadanie_20");
        System.out.println("Podaj wilkosc tablicy");
        n=scanner.nextInt();
        int[] tab=new int[n];
        for (int i=0;i<n;i++){
            System.out.println("Podaj "+(i+1)+" liczbe");
            tab[i]=scanner.nextInt();
        }
        int counter=0,number,max;
        number=tab[0];
        max=tab[0];
        for(int j=0;j<n;j++)
        {
            if(number>tab[j])
                number=tab[j];
            if(max<tab[j])
                max=tab[j];
        }


        while(number!=(max+1))
        {
            for(int k=0;k<n;k++)
                if(tab[k]==number)
                    counter++;
            System.out.println(number+" wystepuje "+counter);
            counter=0;
            number++;
        }


    }

    public static void Zadanie_22(){
        System.out.println("Zadanie_22");
        System.out.println("Hellow World");
    }

    public static void Zadanie_23(){
        System.out.println("Zadanie_23");
        System.out.println("1000");
    }

    public static void Zadanie_24(){
        System.out.println("Zadanie_24");
        System.out.println("100*30000");
    }

    public static void Zadanie_25() {
        System.out.println("Zadanie_25");
        System.out.println("Podaj liczbe");
        int number=scanner.nextInt();
        System.out.println("Jej ostatnia cyfra to "+number%10);
    }

    public static void Zadanie_26() {
        System.out.println("Zadanie_26");
        System.out.println("Podaj 2 liczby");
        int number1=scanner.nextInt();
        int number2=scanner.nextInt();
        System.out.println("Ich suma to "+number1+number2);
    }

    public static void Zadanie_27() {
        System.out.println("Zadanie_27");
        System.out.println("Podaj 2 liczby");
        double number1=scanner.nextDouble();
        double number2=scanner.nextDouble();
        System.out.println("Ich iloraz to "+number1*number2);
    }

    public static void Zadanie_28() {
        System.out.println("Zadanie_28");
        System.out.println("Podaj promien kola, r=");
        double r=scanner.nextDouble();
        System.out.println("Pole kola o podanym promieniu to "+3.14*r*r);
    }

    public static void Zadanie_29() {
        System.out.println("Zadanie_29");
        System.out.println("Podaj swoje imie:");
        String name=scanner.next();
        System.out.println("Podaj swoje nazwisko");
        String lastName=scanner.next();
        System.out.println("Twoje imie i nazwisko to "+name+" "+lastName);
    }

    public static void Zadanie_30(){
        System.out.println("Zadanie_30");
        System.out.println("Podaj wyraz:");
        String word=scanner.next();
        System.out.println("Dlugosc wyrazu to "+word.length());
    }

    public static void Zadanie_31(){
        System.out.println("Zadanie_31");
        System.out.println("\"Mowa jest srebrem a milczenie zlotem\"");
    }

    public static void Zadanie_32(){
        System.out.println("Zadanie_32");
        System.out.println("Podaj wyraz:");
        String word=scanner.next();
        System.out.println("Dlugosc wyrazu to "+word.length());
    }

    public static void Zadanie_33(){
        System.out.println("Zadanie_33");
        System.out.println("Podaj wyraz");
        String word=scanner.next();
        System.out.println("Przed ostatnia litera wyrazu to "+word.charAt(word.length()-2));
    }

    public static void Zadanie_34(){
        System.out.println("Zadanie_34");
        System.out.println("Podaj wyraz");
        String word=scanner.next();
        System.out.println("Pierwsza litera wyrazu to "+word.charAt(0));
    }

    public static void Zadanie_35(){
        System.out.println("Zadanie_35");
        System.out.println("Podaj wyraz");
        String word=scanner.next();
        System.out.println("Przed ostatnie 2 litery wurazu to "+word.charAt(word.length()-2)+","+word.charAt(word.length()-1));
    }

    public static void Zadanie_36(){
        System.out.println("Zadanie_36");
        System.out.println("Podaj wyraz");
        String word = scanner.next();
        if (word.length() > 3)
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == 'k')
                    if (word.charAt(i + 1) == 'o')
                        if (word.charAt(i + 2) == 't'){
                            System.out.println("true");
                            break;
                        }

                if (word.length() - i < 3) {
                    System.out.println("false");
                    break;
                }

            }
        else {
            System.out.println("false");
        }
    }

    public static void Zadanie_37(){
        System.out.println("Zadanie_37");
        System.out.println("Podaj wyraz:");
        String word=scanner.next();
        System.out.println("Wyraz malymi literami to "+word.toLowerCase());
    }

    public static void Zadanie_38(){
        System.out.println("Zadanie_38");
        System.out.println("Podaj wyraz:");
        String word=scanner.next();
        String word2="";
        for (int i = 0; i <word.length(); i++) {
            if(word.charAt(i)!='*')
                word2+=word.charAt(i);
        }
        System.out.println("Poprawione slowo to "+word2);
    }

    public static void Zadanie_39(){
        System.out.println("Zadanie_39");
        System.out.println("Podaj liczbe");
        squerRoot(scanner.nextDouble());
    }

    public static void squerRoot(double number)throws IllegalArgumentException{
        if(number<0)
            throw new IllegalArgumentException("Nie można pierwiaskować liczb ujemnych");
        else
            System.out.println(Math.sqrt(number));
    }

    public static void Zadanie_40(){
        System.out.println("Zadanie_40");
        System.out.println("Podaj 5 liczb");
        double[] tab=new double[5];
        for (int i = 0; i <5 ; i++)
            tab[i]=scanner.nextDouble();
        tab=getConverseArray(tab);
        for (int j = 0; j <5 ; j++) {
            System.out.println(tab[j]);
        }
    }

    public static double[] getConverseArray(double[] array) throws ArithmeticException{
        double[] array2=new double[5];
        for (int i = 0; i <5 ; i++) {
            if(array[i]!=0)
                array2[i]=1/array[i];
            else
                throw new ArithmeticException("Nie dzielimy przez zero");
        }
        return  array2;
    }

    public static void Zadanie_41()throws IndexOutOfBoundsException{
        System.out.println("Zadanie_41");
        System.out.println("Podaj index elementu z tablicy 5 elementowej do wyświetlenia");
        double[] tab={5,4,1,10,2};
        int index=scanner.nextInt();
        if(index<5)
            System.out.println(tab[index]);
        else
            throw new IndexOutOfBoundsException("Przekroczono dostepne indeksy");
    }
    }
