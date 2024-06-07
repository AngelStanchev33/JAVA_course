package _01_BasicJava.purviZaD;

import java.util.Scanner;

public class LucnhBreak2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nameofSerios = scanner.nextLine();
        int durtionofEpisode = Integer.parseInt(scanner.nextLine());
        int durationofBreak = Integer.parseInt(scanner.nextLine());

        double restofBreak = durationofBreak - ((durationofBreak / 8.0) + (durationofBreak / 4.0));
        double diff = Math.abs(restofBreak - durtionofEpisode);

        if (restofBreak >= durtionofEpisode) {
            System.out.printf("You don't have enough time to watch %s ,you need %.2f more minutes.",nameofSerios,diff);}
        else { System.out.printf("You don't have enough time to watch %s ,you need 2.%f more minutes.",nameofSerios,diff);}

        }





    }

