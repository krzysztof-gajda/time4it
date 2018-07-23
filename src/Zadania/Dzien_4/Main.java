package Zadania.Dzien_4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Zadanie_61();
        //Zadanie_62();
        //Zadanie_63();
        //Zadanie_64();
        //Zadanie_65();
        //Zadanie_66();
        //Zadanie_67();
        //Zadanie_68();
        //Zadanie_69();
        //Zadanie_70();
        //Zadanie_71();
        //Zadanie_72(); brak MySql
        //Zadanie_73(); brak MySql
        //Zadanie_74(); brak MySql

        scanner.close();
    }

    public static void Zadanie_61(){
        System.out.println("Zadanie_61");
        System.out.println("Podaj liczbe");
        int number=scanner.nextInt();
        for (int i = 0; i <number ; i++) {
            if(number%(i+1)==0)
                System.out.println((i+1));
        }
    }

    public static void Zadanie_62(){
        System.out.println("Zadanie_62");
        System.out.println("Podaj 2 liczby");
        int a=scanner.nextInt();
        int n=scanner.nextInt();
        int b=a;
        for (int i = 0; i <n-1 ; i++)
            a=a*b;

        System.out.println(b+" do potegi "+n+"="+a);
    }

    public static void Zadanie_63(){
        System.out.println("Zadanie_63");
        System.out.println("Wszystkie liczby parzyste od 10 do 50 to:");
        for (int i = 9; i <51 ; i++)
            if(i%2==0)
                System.out.println(i);
    }

    public static void Zadanie_64(){
        System.out.println("Zadanie_64");
        System.out.println("Podaj liczbe");
        int number=scanner.nextInt();
        int sum=1;
        for (int i = 0; i <number ; i++) {
            sum=sum*(i+1);
        }
        System.out.println("Silnia "+number+" to "+sum);
    }

    public static void Zadanie_65(){
        System.out.println("Zadanie_65");
        while (true){
            System.out.println("Podaj slowo Java");
            String word=scanner.next();
            if(word.compareTo("Java")==0)
                break;
            else
                System.out.println("Zle slowo");
        }
    }

    public static void Zadanie_66(){
        System.out.println("Zadanie_66");
        System.out.println("Podaj wysokosc wiezy");
        int hight=scanner.nextInt();
        String line="O";
        String O="O";
        for (int i=0; i<hight;i++){
            System.out.println(line);
            line+=O;
        }
    }

    public static void Zadanie_67(){
        System.out.println("Zadanie_67");
        System.out.println("Podaj liczbe");
        int number=scanner.nextInt();
        int sum=0;
        for (int i = 0; i <number+1 ; i++)
            if(i%2==0)
                sum+=i;
        System.out.println("Suma wszystkich parzystyvh liczb do "+number+" to "+sum);
    }

    public static void Zadanie_68(){
        System.out.println("Zadanie_68");
        int prize=126;
        int number,counter=1;

        while (true) {
            System.out.println("Zgadnij liczbe calkowita");
            number = scanner.nextInt();
            if (number < prize)
                System.out.println("Wiecej");
            else if (number > prize)
                System.out.println("Mniej");
            else if (number == prize) {
                System.out.println("WYGRALES");
                System.out.println("Wykonales " + counter + " prob");
                break;
            }
            counter++;
        }
    }

    public static void Zadanie_69(){
        System.out.println("Zadanie_69");
        String prize="Polska";
        String Try;
        int counter=1;

        while (true) {
            System.out.println("Zgadnij haslo");
            Try = scanner.next();
            if (Try.compareTo(prize)==0) {
                System.out.println("WYGRALES");
                System.out.println("Wykonales " + counter + " prob");
                break;
            }
            counter++;
        }
    }

    public static int Zadanie_70(){
        System.out.println("Zadanie_70");
        String answer;
        while (true){
            System.out.println("Cześć Krzysiek , słyszałem, że masz 20 lat i uczysz się programowania, czy to prawda?");
            answer=scanner.next();
            if(answer.compareTo("true")==0)
                break;
            else if (answer.compareTo("false")==0)
                return 0;
        }
        while (true){
            System.out.println("Czy Twoje inicjały to K.G. ?");
            answer=scanner.next();
            if(answer.compareTo("true")==0||answer.compareTo("Tak")==0)
                break;
            else if (answer.compareTo("false")==0)
                return 0;
        }
    return 0;
    }

    public static void Zadanie_71(){
        System.out.println("Zadanie_71");
        Random random = new Random();
        int number;
        number= random.nextInt(5) + 1;
        System.out.println(number);
    }

    public static void Zadanie_72(){

    }
}
