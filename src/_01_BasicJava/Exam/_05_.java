package _01_BasicJava.Exam;

import java.util.Scanner;

public class _05_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int boughtFood = Integer.parseInt(scanner.nextLine());

        double foodInGrams = boughtFood * 1000;
        double foodEatenTotal = 0;

        String command = scanner.nextLine();
        while (!"Adopted".equals(command)){
            int foodEaten = Integer.parseInt(command);
            foodEatenTotal+=foodEaten;

            command = scanner.nextLine();
        }
        if (foodInGrams < foodEatenTotal){
            System.out.printf(
                    "Food is not enough. You need %.0f grams more.",Math.abs(foodInGrams - foodEatenTotal));
        }
        else System.out.printf("Food is enough! Leftovers: %.0f grams.", Math.abs(foodEatenTotal - foodInGrams));
    }
}
