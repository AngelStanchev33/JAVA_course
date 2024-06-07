package _01_BasicJava.VlojeniCikli;

import java.util.Scanner;

public class _04_SumofTwoNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int combsCount = 0;
        boolean foundCombination = false;

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                combsCount++;

                if (i + j == magicNumber) {
                    foundCombination = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)%n", combsCount, i, j, magicNumber);
                    break; // Прекратяваме вътрешния цикъл
                }
            }

            if (foundCombination) {
                break; // Прекратяваме външния цикъл
            }
        }

        if (!foundCombination) {
            System.out.printf("%d combinations - neither equals %d%n", combsCount, magicNumber);
        }
    }
}
