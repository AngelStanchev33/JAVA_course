package _01_BasicJava.purviZaD;

import java.util.Scanner;

public class Pazaruvane {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCardCount = Integer.parseInt(scanner.nextLine());
        int procesorCount = Integer.parseInt(scanner.nextLine());
        int ramCount = Integer.parseInt(scanner.nextLine());

        double VideocardPrice = videoCardCount * 250;
        double procesorPrice = (double) (VideocardPrice * 35 / 100);
        double ramPirce = (double) (VideocardPrice * 10 / 100);

        double totalProcesorPrice = procesorPrice * procesorCount;
        double totalRamPrice = ramPirce * ramCount;

        double sum = totalRamPrice + totalProcesorPrice + VideocardPrice;
        if (videoCardCount > procesorCount) {
            sum -= sum * 15 / 100;
        }

        if (budget >= sum) {
            System.out.printf("You have %.2f leva left!", budget - sum);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", sum - budget);
        }
    }}

