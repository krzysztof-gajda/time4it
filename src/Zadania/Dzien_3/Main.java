package Zadania.Dzien_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Zadanie_42();
        //Zadanie_43(); nie wiem jak sworzyć własny wyjątek
        //Zadanie_44();
        //Zadanie_45();
        //Zadanie_46();
        //Zadanie_47();
        //Zadanie_48();
        //Zadanie_49();
        //Zadanie_50();
        //Zadanie_51();
        //Zadanie_52();
        //Zadanie_53();
        //Zadanie_54();
        //Zadanie_55();
        //Zadanie_56();
        //Zadanie_57();
        //Zadanie_58();
        //Zadanie_59();
        //Zadanie_60();

        scanner.close();
    }

    public static void Zadanie_42() {

    }

    public static void Zadanie_43() {
        System.out.println("Zadanie_43");
        System.out.println("Wplacaj lub wyplacaj metodami: deposit_xxx lub withdraw_xxx");
        BankAccount bankAccount = new BankAccount();
        String answer = scanner.next();
        String a = answer.substring(0, 9);
        switch (answer.substring(0, 8)) {
            case "deposit_": {
                System.out.println("Nowy stan konta to: " + bankAccount.deposit(Integer.parseInt(answer.substring(9))));
            }
            break;

            case "withdraw": {
                System.out.println("Nowy stan konta to: " + bankAccount.withdraw(Integer.parseInt(answer.substring(9))));
            }
            break;
        }
    }

    public static void Zadanie_44() {
        System.out.println("Zadanie_44");
        boolean test = true;
        while (test) {
            System.out.println("Witaj w grze w zgadywanie liczby [p-graj,w-wyjdz]");
            String answer = scanner.next();
            switch (answer) {
                case "p": {
                    Game game = new Game();
                    game.play(game.registration());
                }
                break;
                case "w": {
                    System.out.println("ŻEGNAM");
                    test = false;
                }
                break;
                default: {
                    System.out.println("Zła odpowiedz");
                }
            }
        }
    }

    public static void Zadanie_45() {
        System.out.println("Zadanie_45");
        Random random = new Random();
        int[] number = new int[6];
        number[0] = random.nextInt(43) + 1;
        System.out.println(1 + ": " + number[0]);
        for (int i = 1; i < 6; i++) {
            number[i] = random.nextInt(43) + 1;
            for (int j = 0; j < i; j++) {
                while (true) {
                    if (number[j] == number[i]) {
                        number[i] = random.nextInt(43) + 1;
                        j = 0;
                    } else
                        break;
                }
            }
            System.out.println((i + 1) + ": " + number[i]);
        }
    }

    public static void Zadanie_46() {
        System.out.println("Zadanie_46");
        System.out.println("Podaj wyraz");
        String word = scanner.next();
        if (word.charAt(0) > 64 && word.charAt(0) < 91)
            System.out.println("Pierwsza litera wyrazu jest duza litera");
        else
            System.out.println("Pierwsza litera wyrazu nie jest duza litera");
    }

    public static void Zadanie_47() {
        System.out.println("Zadanie_47");
        System.out.println("Podaj wyraz");
        String word = scanner.next();
        for (int i = 0; i < word.length(); i += 2) {
            if (i < word.length())
                System.out.println(word.charAt(i));

        }
    }

    public static void Zadanie_48() {
        System.out.println("Zadanie_48");
        System.out.println("Podaj wyraz");
        String word = scanner.next();
        boolean test = false;
        for (int i = 0; i < (word.length() / 2); i++) {
            System.out.println(i + ":" + word.charAt(i) + " " + (word.length() - (i + 1)) + ":" + word.charAt(word.length() - (i + 1)));
            if (word.charAt(i) != word.charAt(word.length() - (i + 1)))
                test = true;
        }
        if (!test)
            System.out.println("Wyraz jest palindromem");
        else
            System.out.println("Wyraz nie jest palindromem");
    }

    public static void Zadanie_49() {
        System.out.println("Zadanie_46");
        System.out.println("Podaj wyraz");
        String word = scanner.next();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) > 47 && word.charAt(i) < 58)
                System.out.println(word.charAt(i));
        }

    }

    public static void Zadanie_50() {
        System.out.println("Zadanie_50 \"to samo co w 45\"");
        Random random = new Random();
        int[] number = new int[6];
        number[0] = random.nextInt(43) + 1;
        System.out.println(1 + ": " + number[0]);
        for (int i = 1; i < 6; i++) {
            number[i] = random.nextInt(43) + 1;
            for (int j = 0; j < i; j++) {
                while (true) {
                    if (number[j] == number[i]) {
                        number[i] = random.nextInt(43) + 1;
                        j = 0;
                    } else
                        break;
                }
            }
            System.out.println((i + 1) + ": " + number[i]);
        }
    }

    public static void Zadanie_51() {
        System.out.println("Zadanie_51");
        System.out.println("Podaj dwie liczby");
        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println("Suma tych liczb to: " + add(a, b));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static void Zadanie_52() {
        System.out.println("Zadanie_52");
        System.out.println("Podaj dwie liczby");
        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println("Rużnica tych liczb to: " + substract(a, b));
    }

    public static int substract(int a, int b) {
        return a - b;
    }

    public static void Zadanie_53() {
        System.out.println("Zadanie_53");
        System.out.println("Podaj dwie liczby");
        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println("Iloczyn tych liczb to: " + multiply(a, b));
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void Zadanie_54() {
        System.out.println("Zadanie_54");
        System.out.println("Podaj dwie liczby");
        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println("Iloraz tych liczb to: " + divide(a, b));
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Nie dzielymy przez 0");
            return 0;
        } else
            return a / b;
    }

    public static void Zadanie_55() {
        System.out.println("Zadanie_55");
        System.out.println("Podaj trzy liczby");
        int a, b, c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if (isPitagora(a, b, c))
            System.out.println("Libczy sa pitagorejskie");
        else
            System.out.println("Libczy nie sa pitagorejskie");
    }

    public static boolean isPitagora(int a, int b, int c) {
        if (a * a + b * b == c * c || +a * a + c * c == b * b || b * b + c * c == a * a)
            return true;
        else
            return false;
    }

    public static void Zadanie_56() {
        System.out.println("Zadanie_56");
        System.out.println("Podaj liczbe");
        int a, b = 10, sum = 0;
        a = scanner.nextInt();
        while (a > 0) {
            sum += a % b;
            a = a / b;
        }
        System.out.println("Suma cyfr wynosi: " + sum);
    }

    public static void Zadanie_57(){
        System.out.println("Zadanie_56");
        System.out.println("Podaj liczbe");
        int a;
        a = scanner.nextInt();
        if(isSqr(a))
            System.out.println("Liczba jest kwadratem liczby calkowitej");
        else
            System.out.println("Liczba nie jest kwadratem liczby calkowitej");
    }

    public static boolean isSqr(int number){
        int a=1;
        while (true){
            if(a*a>number)
                return false;
            else if(a*a==number)
                return true;
            a++;
        }
    }

    public static void Zadanie_58(){
        System.out.println("Zadanie_56");
        System.out.println("Podaj liczbe");
        int a;
        a = scanner.nextInt();
        if(isPrimal(a))
            System.out.println("Podana liczba jest pierwsza");
        else
            System.out.println("Podana liczba nie jest pierwsza");
    }

    public static boolean isPrimal(int number){
        List<Integer> primal=new ArrayList<>();
        int a=2;
        primal.add(2);

        while (a<=number){
            if(a==number){
                for(int i=0;i<primal.size();i++)
                    if(a%primal.get(i)==0)
                        return false;

                return true;
            }

            for(int j=0;j<primal.size();j++){
                if(a%primal.get(j)==0)
                    break;

                else if((j+1)==primal.size()){
                    primal.add(a);
                    System.out.println(primal.get(j+1));
                }
            }
            a++;
        }
        return false;
    }

    public static void Zadanie_59(){
        System.out.println("Zadanie_59");
        System.out.println("Podaj liczbe");
        int a;
        a = scanner.nextInt();
        if(isSqr2(a))
            System.out.println("Liczba jest sześcianem liczby calkowitej");
        else
            System.out.println("Liczba nie jest sześcianem liczby calkowitej");
    }

    public static boolean isSqr2(int number){
        int a=1;
        while (true){
            if(a*a*a>number)
                return false;
            else if(a*a*a==number)
                return true;
            a++;
        }
    }

    public static void Zadanie_60(){
        System.out.println("Zadanie_60");
        System.out.println("Podaj 2 liczby");
        int a,b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        if(a>b)
            System.out.println("Maksimum tych liczb to: "+a);
        else
            System.out.println("Maksimum tych liczb to: "+b);
    }
}

