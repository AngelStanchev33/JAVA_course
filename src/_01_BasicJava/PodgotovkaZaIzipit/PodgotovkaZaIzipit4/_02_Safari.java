package _01_BasicJava.PodgotovkaZaIzipit.PodgotovkaZaIzipit4;

import java.util.Scanner;

public class _02_Safari {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double littersOfFuel = Double.parseDouble(scanner.nextLine());
        String dayOfTheWeek = scanner.nextLine();

        double fuelCharges = littersOfFuel * 2.10;
        double fuelAndGuide = fuelCharges + 100;

        if (dayOfTheWeek.equals("Sunday")){
            fuelAndGuide -= fuelAndGuide * 0.20;
        }
        else if (dayOfTheWeek.equals("Saturday")){
            fuelAndGuide -= fuelAndGuide * 0.10;
        }
        if (budget > fuelAndGuide){
            System.out.printf("Safari time! Money left: %.2f lv.",budget - fuelAndGuide);
        }
        else {
            System.out.printf("Not enough money! Money needed: %.2f lv.", Math.abs(fuelAndGuide - budget));
        }


    }
}
