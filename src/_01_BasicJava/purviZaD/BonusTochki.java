package _01_BasicJava.purviZaD;

import java.util.Scanner;

public class BonusTochki {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        double bonus = 0;

        if (number <= 100) {
            bonus = 5;
        } else if (number > 1000) {
            bonus = number * 20 / 100;
        } else if (number > 100) {
            bonus = number * 10 / 100;
        }

        if (number % 2 == 0) {
            bonus = bonus + 1;
        }
        if (number % 10 == 5) {
            bonus = bonus + 1;
        }
        System.out.print(bonus);
        System.out.print(number + bonus);}


    }