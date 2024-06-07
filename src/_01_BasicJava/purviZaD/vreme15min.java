package _01_BasicJava.purviZaD;

import java.util.Scanner;

public class vreme15min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalMinutes = hours * 60 +minutes;
        totalMinutes += 15;

        int newHour = totalMinutes / 60;
        int newMinutes = totalMinutes % 60;

        System.out.printf("След 15 минути ще бъде: %02d:%02d", newHour, newMinutes);





        }


    }

