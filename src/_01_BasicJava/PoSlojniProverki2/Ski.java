package _01_BasicJava.PoSlojniProverki2;

import java.util.Scanner;

public class Ski {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int stayPeriod = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String review = scanner.nextLine();
        double price = 0;
        stayPeriod = stayPeriod - 1;

        switch (type){
            case "Room for one person":
                price = 18.00;
                if (review.equals("positive")){
                    price += price * 25/100;
                }
                else  if (review.equals("negative")){
                    price -= price * 10/100;
                }
                break;
            case "apartment":
                price = 25.00;
                if (stayPeriod > 15){
                    price -= price * 50/100;
                }
                else if (stayPeriod > 10 && stayPeriod < 15 ){
                    price -= price * 35/100;
                }
                else if (stayPeriod < 10){
                    price -= price * 30/100;
                }
                if (review.equals("positive")){
                    price += price * 25/100;
                }
                else  if (review.equals("negative")){
                    price -= price * 10/100;
                }
                break;
            case "president apartment":
                price = 35.00;
                if (stayPeriod > 15){
                    price -= price * 20/100;
                }
                else if (stayPeriod > 10 && stayPeriod < 15 ){
                    price -= price * 15/100;
                }
                else if (stayPeriod < 10){
                    price -= price * 10/100;
                }
                if (review.equals("positive")){
                    price += price * 25/100;
                }
                else  if (review.equals("negative")){
                    price -= price * 10/100;
                }
                break;
        }
        double finalPrice = price * stayPeriod;
        System.out.printf("%.2f",finalPrice);

    }
}
