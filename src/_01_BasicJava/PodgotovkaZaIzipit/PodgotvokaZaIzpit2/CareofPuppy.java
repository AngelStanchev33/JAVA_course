package _01_BasicJava.PodgotovkaZaIzipit.PodgotvokaZaIzpit2;

import java.util.Scanner;

public class CareofPuppy {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int boughtFood = Integer.parseInt(scanner.nextLine());
        int foodInGrams = boughtFood * 1000;
        int totalFoodAmount = 0;

        String command = scanner.nextLine();
        while (!"Adopted".equals(command)){
            int foodAmount = Integer.parseInt(command);
            totalFoodAmount += foodAmount;

        command = scanner.nextLine();
        }
    if (foodInGrams >= totalFoodAmount){
        System.out.printf("Food is enough! Leftovers: %d grams.",foodInGrams - totalFoodAmount);
    }
    else {
        System.out.printf("Food is not enough. You need %d grams more.",totalFoodAmount -foodInGrams);
    }

    }
}
