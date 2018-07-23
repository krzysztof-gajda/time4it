package Zadania.Dzien_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private String name;
    private List<Player> players=new ArrayList<Player>();
    private Scanner scanner=new Scanner(System.in);
    private int i=0;

    public Player registration(){
        System.out.println("Podaj swoje imie");
        String name=scanner.next();
        System.out.println("Podaj swoj nik");
        String username=scanner.next();

        players.add(new Player(name,username));
        i++;
        return players.get(i-1);
    }

    public void play(Player player){
        Random random=new Random();
        int prize=random.nextInt(100);
        int number,counter=1;

        while (true) {
            System.out.println("GRACZ: "+player.getUsername());
            System.out.println("Zgadnij liczbe calkowita z przedzialu [0-100]"+prize);
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


}
