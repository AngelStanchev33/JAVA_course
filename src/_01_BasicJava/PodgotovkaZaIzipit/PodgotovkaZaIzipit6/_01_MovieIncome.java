package _01_BasicJava.PodgotovkaZaIzipit.PodgotovkaZaIzipit6;

import java.util.Scanner;

public class _01_MovieIncome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        int dayNum = Integer.parseInt(scanner.nextLine());
        int ticketNum  = Integer.parseInt(scanner.nextLine());
        double ticketPrice = Double.parseDouble(scanner.nextLine());
        double percentForCinema = Double.parseDouble(scanner.nextLine());

        double ticketPriceForDay = ticketPrice * ticketNum;
        double sum = ticketPriceForDay * dayNum;
        double cinemaCut = (percentForCinema/100) * sum;
        double totalSum = sum - cinemaCut ;

        System.out.printf("The profit from the movie %s is %.2f lv.",movieName,totalSum);

    }
}
