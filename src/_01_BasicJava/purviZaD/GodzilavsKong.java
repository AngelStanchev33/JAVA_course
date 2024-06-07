package _01_BasicJava.purviZaD;

import java.util.Scanner;

public class GodzilavsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int extras = Integer.parseInt(scanner.nextLine());
        double wardrobe = Double.parseDouble(scanner.nextLine());
        double priceWardobe = wardrobe * extras;
        double dekor = budget * 10/100;

        if (extras > 150){
            priceWardobe -= priceWardobe * 10/100;
        }
        double result = dekor + priceWardobe;

        if (result > budget){
            System.out.printf("Not enough money! Wingard starts filming with %.2f leva left." , result - budget
            );}
        else {System.out.printf("Action! Wingard starts filming with %.2f leva left." , result - budget);}
        }



    }

