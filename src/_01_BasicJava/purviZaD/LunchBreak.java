package _01_BasicJava.purviZaD;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nameOfSerios = scanner.nextLine();
        double durationEpisode = Double.parseDouble(scanner.nextLine());
        double durationBreak = Double.parseDouble(scanner.nextLine());

        double lunch = durationBreak / 8.0;
        double chill = durationBreak / 4.0;
        double freeTime = lunch + chill;
        double result = freeTime - durationBreak;

        if (result >=durationEpisode){
            System.out.printf("You have enough time to watch %s and left with %.2f minutes free time.",
                    result - durationEpisode);}
        else { System.out.printf("You don't have enough time to watch %s ,you need 2.%f more minutes.",
                durationEpisode - result);}






    }
}
