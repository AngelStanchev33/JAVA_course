package _01_BasicJava.PodgotovkaZaIzipit;

import java.util.Scanner;

public class _03_SnookerTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stageOfChampionship = scanner.nextLine().trim();
        String ticketType = scanner.nextLine().trim();
        int tickets = Integer.parseInt(scanner.nextLine().trim());
        String trophyPic = scanner.nextLine().trim();

        double ticketPrice = 0;
        double bill = 0;
        double trophyPicPrice = 0;
        if ("Y".equals(trophyPic)){
            trophyPicPrice = 40;
        }
        double finalTicketPrice = tickets *trophyPicPrice;

        switch (ticketType){

            case "Standard":
                if (stageOfChampionship.equals("Quarter final")){
                    ticketPrice = 55.50;}
                else if (stageOfChampionship.equals("Semi final")){
                    ticketPrice = 75.88;}
                else if (stageOfChampionship.equals("Final")){
                    ticketPrice = 110.10;}
                break;

            case "Premium":
                if (stageOfChampionship.equals("Quarter final")){
                    ticketPrice = 105.20;}
                else if (stageOfChampionship.equals("Semi final")){
                    ticketPrice = 125.22;}
                else if (stageOfChampionship.equals("Final")){
                    ticketPrice = 160.66;}
                break;

            case "VIP":
                if (stageOfChampionship.equals("Quarter final"))
                    ticketPrice = 118.90;
                else if (stageOfChampionship.equals("Semi final"))
                    ticketPrice = 300.40;
                else if (stageOfChampionship.equals("Final"))
                    ticketPrice = 400;
                break;
        }
        bill = ticketPrice * tickets;
        if (bill >= 4000){
            bill -= (bill * 0.25);
        }
        else  if (bill > 2500){
            bill-=(bill * 0.10);
            bill += finalTicketPrice;
        }

        System.out.printf("%.2f",bill);


        }



    }





