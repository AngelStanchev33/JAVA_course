package _01_BasicJava.Exam;

import java.util.Scanner;

public class _04_CatFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int catCount = Integer.parseInt(scanner.nextLine());

        int groupSmallCats = 0;
        int groupBigCats = 0;
        int groupExtraBigCats = 0;
        double totalGrams = 0;

        for (int i = 0; i < catCount; i++) {
            double grams = Double.parseDouble(scanner.nextLine());
            if (grams >= 100 && grams < 200) {
                groupSmallCats++;
            }
            if (grams >= 200 && grams < 300) {
                groupBigCats++;
            }
            if (grams >= 300 && grams <= 400) {
                groupExtraBigCats++;
            }
            totalGrams += grams;
        }

        double priceForFood = totalGrams / 1000 * 12.45;

        System.out.printf("Group 1: %d cats.%n", groupSmallCats);
        System.out.printf("Group 2: %d cats.%n", groupBigCats);
        System.out.printf("Group 3: %d cats.%n", groupExtraBigCats);
        System.out.printf("Price for food per day: %.2f lv.", priceForFood);
    }
}
