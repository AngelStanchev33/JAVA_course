package _01_BasicJava.PoSlojniProverki2;

import java.util.Scanner;

public class lodkazaRiba {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermen = Integer.parseInt(scanner.nextLine());
        double rentprice = 0;

        switch (season){
            case "Spring":
                rentprice = 3000;
                break;
            case "Autumn", "Summer":
                rentprice = 4200;
                break;
            case "Winter":
                rentprice = 2600;
                break;
        }
        if (fishermen <= 6){
            rentprice = rentprice -rentprice * 10/100;
        }
        else if (fishermen > 7 && fishermen <= 11){
            rentprice = rentprice - rentprice * 15/100;
        }
        else  if (fishermen > 12){
            rentprice = rentprice - rentprice * 25/100;
        }
        if (fishermen == fishermen %2 && !season.equals("Aumtn")){
            rentprice = rentprice - rentprice * 5/100;
        }

        if (budget >= rentprice){
            System.out.printf("Yes! You have %.2f leva left.",budget - rentprice);
        }
        else System.out.printf("Not enough money! You need %.2f leva.",rentprice - budget);


    }
}
