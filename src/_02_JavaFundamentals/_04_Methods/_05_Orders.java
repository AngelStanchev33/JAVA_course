package _02_JavaFundamentals._04_Methods;

import java.util.Scanner;

public class _05_Orders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String order = sc.nextLine();
        int quantity = Integer.parseInt(sc.nextLine());

        double price = 0;

        switch (order){
            case "coffee":
                price = 1.50;
                orderPirceCofee(quantity,price );
                break;
            case "water":
                price = 1.00;
                orderPirceWater(quantity,price);
                break;
            case "coke":
                price = 1.40;
                orderPirceCoke(quantity,price);
                break;
            case "snacks":
                price = 2.00;
                orderPirceSnacks(quantity,price);
                break;
        }
    }

    private static void orderPirceSnacks(int quantity, double price) {
        System.out.println(quantity * price);

    }

    private static void orderPirceCoke(int quantity, double price) {
        System.out.println(quantity * price);

    }

    private static void orderPirceWater(int quantity, double price) {
        System.out.println(quantity * price);
    }

    private static void orderPirceCofee(int quantity, double price) {
        System.out.println(quantity * price);
    }
}
