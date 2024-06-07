package _01_BasicJava.PoSlojniProverki2;

import java.util.Scanner;

public class Izpitnavreme {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int hourfExam = Integer.parseInt(scanner.nextLine());
        int minofExam = Integer.parseInt(scanner.nextLine());
        int hourArival = Integer.parseInt(scanner.nextLine());
        int minofArival = Integer.parseInt(scanner.nextLine());

        int examTimeInMinutes = hourfExam * 60 + minofExam;
        int timeOfArivalInMinutes = hourArival * 60 + minofArival;
        int diff = examTimeInMinutes - timeOfArivalInMinutes;
        String output;

        if (diff >= 0 && diff <= 30){
            output = "On time";
        }
        else if (diff > 30){
            output = "Early";
        }
        else {
            output ="Late";
        }

        if (diff > 0 && diff < 60){
            System.out.printf("%d minutes before the start",diff);
        }
        else if (diff >= 60) {
            int hour = diff / 60;
            int mins = diff % 60;
            System.out.printf("%d:%02d hours before the start", hour, mins);
        }
        else if (diff < 0 && diff > - 60){
            int hours = Math.abs(diff);
            System.out.printf("%d minutes after the start",hours);
        }
        else if (diff <= -60) {
            int hour = Math.abs(diff)/ 60;
            int mins = Math.abs(diff) % 60;
            System.out.printf("%d:%02d hours after the start", hour, mins);
        }







    }
}
