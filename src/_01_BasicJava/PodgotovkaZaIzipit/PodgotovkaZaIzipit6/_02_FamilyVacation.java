package _01_BasicJava.PodgotovkaZaIzipit.PodgotovkaZaIzipit6;

import java.util.Scanner;

public class _02_FamilyVacation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double priceForNight = Double.parseDouble(scanner.nextLine());
        double extraExpenses = Double.parseDouble(scanner.nextLine());

        if (nights > 7){
            priceForNight -= priceForNight * 0.05;
        }

        double holydaySUM = nights * priceForNight;
        double sumExtraExp = budget * extraExpenses /100;
        double totalSum = holydaySUM + sumExtraExp;

        if (totalSum <= budget){
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.",budget - totalSum);
        }
        else {
            System.out.printf("%.2f leva needed.",totalSum- budget);
        }



    }
}
