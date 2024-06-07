package _01_BasicJava.PodgotovkaZaIzipit.PodgotovkaZaIzpit5;

import java.util.Scanner;

public class _01_MovieProfit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine().trim();
        int days = Integer.parseInt(scanner.nextLine().trim());
        int tickets = Integer.parseInt(scanner.nextLine().trim());
        double ticketPrice = Double.parseDouble(scanner.nextLine().trim());
        double cinemaCut = Double.parseDouble(scanner.nextLine().trim());

        double ticketProfit = tickets * ticketPrice;
        double dayProfits = days * ticketProfit;
        double total = dayProfits - (dayProfits * cinemaCut/100);

        System.out.printf("The profit from the movie %s is %.2f lv",movieName,total);


    }
}
