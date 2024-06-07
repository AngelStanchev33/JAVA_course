package _02_JavaFundamentals._11_MidExamPrep;

import java.util.Scanner;

public class _01_GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double quantityFood = Double.parseDouble(scanner.nextLine());
        double quantityHay = Double.parseDouble(scanner.nextLine());
        double quantityCover = Double.parseDouble(scanner.nextLine());
        double weight = Double.parseDouble(scanner.nextLine());

        double quantityFoodInGrams = quantityFood * 1000;
        double quantityHayInGrams = quantityHay * 1000;
        double quantityCoverInGrams = quantityCover * 1000;
        double weightInGrams = weight * 1000;

        int dayCount = 0;



        while (true) {
            if (quantityFoodInGrams == 0){
                break;
            }
            else if (quantityHayInGrams == 0) {
                break;
            }
            else if (quantityCoverInGrams == 0) {
                break;
            }

            dayCount++;

            quantityFoodInGrams -= 300;
            if (dayCount % 2 == 0) {
                double hayNeeded = quantityFoodInGrams * 0.05;
                quantityHayInGrams -= hayNeeded;
            }
            if (dayCount % 3 == 0) {
                double coverNeeded = weightInGrams * (1.0 / 3.0);
                quantityCoverInGrams -= coverNeeded;
            }
            if (dayCount == 30){
                break;
            }
        }

        if ((quantityHayInGrams > 0 && quantityCoverInGrams > 0 && quantityFoodInGrams > 0)){
            System.out.printf("Everything is fine! " +
                    "Puppy is happy! Food: %.2f, " +
                    "Hay: %.2f, Cover: %.2f.%n",quantityFoodInGrams/1000,quantityHayInGrams/1000,quantityCoverInGrams/1000);
        }
        else {
            System.out.println("Merry must go to the pet store!");
        }
    }
}
