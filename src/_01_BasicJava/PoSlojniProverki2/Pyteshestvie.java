package _01_BasicJava.PoSlojniProverki2;

import java.util.Scanner;

public class Pyteshestvie {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String destination = "";



        if (budget <= 100){
            destination = "Bulgaria";
        if (season.equals("Summer")){
            budget = budget - budget * 30/100;
        }
        else if (season.equals("Winter")){
            budget = budget - budget * 70/100;
        }
        if (budget > 100 && budget <= 1000){
            destination = "Balkans";
        }
        if (season.equals("Summer")){
            budget =budget - budget * 40/100;
        }
        else if (season.equals("Winter")){
            budget =budget - budget * 80/100;
        }
        if (budget > 1000){
            destination = "Europe";
            budget =budget - budget * 90/100;}

        String type = "";

        if (season.equals("Summer")){
            type = "Camping";
        }
        else {
            type = "Hotel";
        }

        System.out.printf("Somewhere in %s",destination);
        System.out.printf("%s - %.2f",type,budget);



        }
    }
}
