package _01_BasicJava.PoSlojniProverki2;

import java.util.Scanner;

public class Kino {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int colums = Integer.parseInt(scanner.nextLine());
        double price = 0;

        switch (projection){
            case "Premiere":
                price = 12.00;
                break;
            case "Normal":
                price = 7.50;
                break;
            case "Discount":
                price = 5.00;
                break;}
        double full = rows * colums * price;
        System.out.printf("%.2f",full);


    }
}
