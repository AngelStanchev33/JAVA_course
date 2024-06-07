package _01_BasicJava.PodgotovkaZaIzipit.PodgotovkaZaIzipit6;

import java.util.Scanner;

public class _05_TouristShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());

        boolean orderIsHigh = false;

        double order = 0;
        int productCount =0;

        String command = scanner.nextLine();
        while (!"Stop".equals(command)){

            double price = Double.parseDouble(scanner.nextLine());
            productCount++;

            if (productCount % 3 ==0){
                price /= 2;
            }

            order += price;

            //command = scanner.nextLine();

            if (budget < order){
                orderIsHigh = true;
                break;
            }
            command = scanner.nextLine();
        }
    if (orderIsHigh){
        System.out.println("You don't have enough money!");
        System.out.printf("You need %.2f leva!",order - budget);
    }
    else {System.out.printf("You bought %d products for %.2f leva.",productCount,order);}
    }
}
