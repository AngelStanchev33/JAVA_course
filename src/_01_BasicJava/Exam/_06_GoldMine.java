package _01_BasicJava.Exam;

import java.util.Scanner;

public class _06_GoldMine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int locationCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < locationCount; i++) {
            double gold = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());

            double kilosGold = 0;

            for (int j = 1; j <= days; j++) {
                double goldByDay = Double.parseDouble(scanner.nextLine());
                kilosGold += goldByDay;
            }

            double middleGold = kilosGold / days;

            if (middleGold >= gold) {
                System.out.printf("Good job! Average gold per day: %.2f.%n", middleGold);
            } else {
                System.out.printf("You need %.2f gold.%n", gold - middleGold);
            }
        }
    }
}
