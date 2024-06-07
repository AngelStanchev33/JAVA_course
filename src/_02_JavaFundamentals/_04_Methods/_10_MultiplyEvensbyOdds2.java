package _02_JavaFundamentals._04_Methods;

import java.util.Scanner;

public class _10_MultiplyEvensbyOdds2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int numbers = Integer.parseInt(scanner.nextLine());

            int evenSum = getSumOfEvenDigits(numbers);
            int oddSum = getSumOfOddDigits(numbers);

            int totalSum = evenSum * oddSum;

            System.out.print(totalSum);
    }
    private static int getSumOfOddDigits(int numbers) {

        String numAsString = Integer.toString(numbers);

        int evenSum = 0;

        for (int i = 0; i < numAsString.length(); i++) {
            char digitChar = numAsString.charAt(i);
            int digit = Character.getNumericValue(digitChar);

            if (digit % 2 == 0){
                evenSum +=digit;
            }
        }
    return evenSum;
    }

    private static int getSumOfEvenDigits(int numbers) {
        String numAsString = Integer.toString(numbers);
        int oddSum = 0;

        for (int i = 0; i <numAsString.length() ; i++) {
            char digitChar = numAsString.charAt(i);
            int digit = Character.getNumericValue(digitChar);
            if (digit % 2 != 0){
                oddSum+=digit;
            }
        }
        return oddSum;
    }
}
