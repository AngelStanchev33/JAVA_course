package _02_JavaFundamentals._13_MidExamPrep;

import java.util.Scanner;

public class _01_BlackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysPlunder = Integer.parseInt(scanner.nextLine());
        double dailyPlunder = Double.parseDouble(scanner.nextLine());
        double expectedPlunder = Double.parseDouble(scanner.nextLine());

        double plunderGained = 0;

        for (int i = 1; i <= daysPlunder; i++) {
            plunderGained += dailyPlunder;

            if (i % 3 == 0) {
                double bonus = dailyPlunder * 0.50;
                plunderGained += bonus;
            }
            if (i % 5 == 0) {
                double loss = plunderGained * 0.30;
                plunderGained -= loss;
            }

        }
        double collectedPercent = (plunderGained / expectedPlunder) * 100;

        if (plunderGained >= expectedPlunder) {
            System.out.printf("Ahoy! %.2f plunder gained.", plunderGained);
        } else {

            System.out.printf("Collected only %.2f%% of the plunder.", collectedPercent);
        }
    }
}
