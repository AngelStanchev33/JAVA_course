package _01_BasicJava.PodgotovkaZaIzipit.PodgotovkaZaIzpit3;

import java.util.Scanner;

public class _01_AgencyProfit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nameOfCompany = scanner.nextLine();
        int numberOfTickets = Integer.parseInt(scanner.nextLine());
        int numberOfChildTickets = Integer.parseInt(scanner.nextLine());
        double ticketPrice = Double.parseDouble(scanner.nextLine());
        double priceForService = Double.parseDouble(scanner.nextLine());

        double priceForKids = (ticketPrice * 70) /100;
        double priceForKidsReal = ticketPrice - priceForKids;
        double ticketForSeniorWithService = ticketPrice + priceForService;
        double ticketForKidsWithService = priceForKidsReal + priceForService;

        double total = (numberOfChildTickets* ticketForKidsWithService) + (numberOfTickets * ticketForSeniorWithService);
        double profit = (total * 20)/100;


        System.out.printf("The profit of your agency from %s tickets is %.2f lv.",nameOfCompany,profit);



    }
}
