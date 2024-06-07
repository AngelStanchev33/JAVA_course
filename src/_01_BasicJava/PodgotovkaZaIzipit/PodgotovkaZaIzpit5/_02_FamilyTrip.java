package _01_BasicJava.PodgotovkaZaIzipit.PodgotovkaZaIzpit5;

import java.util.Scanner;

public class _02_FamilyTrip {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        double pricePerDay = Double.parseDouble(scanner.nextLine());
        double expenses = Double.parseDouble(scanner.nextLine());

        if (days > 7){
            pricePerDay -= pricePerDay * 0.05;
        }
        double totalDays = days * pricePerDay;
        double extraExp = budget -(budget * expenses/100);
        double extraExpTotal = budget - extraExp;
        double total = totalDays + extraExpTotal;

        if (total <= budget){
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.",budget - total);
        }
        else {
            System.out.printf("%.2f leva needed.",Math.abs(total - budget));
        }


    }
}
