package _01_BasicJava.PoSlojniProverki2;

import java.util.Scanner;

public class novDom {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String flowers = scanner.nextLine();
        int flowerCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double price = 0;

        if (flowers.equals("Roses")) {
            price = 5.00;
            if (flowerCount > 80)
                price = price - price * 10 / 100;
        }
        if (flowers.equals("Dalii")) {
            price = 3.80;
            if (flowerCount > 90)
                price = price - price * 15 / 100;
        }
        if (flowers.equals("Lale")) {
            price = 2.80;
            if (flowerCount > 80)
                price = price - price * 15 / 100;
        }
        if (flowers.equals("Narcis")) {
            price = 3.00;
            if (flowerCount < 120)
                price = price + price * 15 / 100;
        }
        if (flowers.equals("Gladiola")) {
            price = 2.50;
            if (flowerCount < 80)
                price = price + price * 20 / 100;

        }
        flowers = "";
        flowerCount = 0;
        double totalPirce = flowerCount * price;
        if (totalPirce > budget){
            System.out.printf("Not enough money, you need %.2f leva more.",totalPirce -budget);
        }
        else System.out.printf("Hey, you have a great garden with %.d %s and %.2f leva left.",flowerCount,flowers,budget- totalPirce);




    }
}




