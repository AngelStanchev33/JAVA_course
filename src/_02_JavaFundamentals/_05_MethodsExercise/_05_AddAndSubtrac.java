package _02_JavaFundamentals._05_MethodsExercise;

import java.util.Scanner;

public class _05_AddAndSubtrac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int digitOne = Integer.parseInt(scanner.nextLine());
        int digitTwo = Integer.parseInt(scanner.nextLine());
        int digitThree = Integer.parseInt(scanner.nextLine());

        int sumOfIntegers = sumOFIntegers(digitOne,digitTwo);

        int totalSum = sumOfIntegers - digitThree;
        System.out.print(totalSum);
    }

    private static int sumOFIntegers(int digitOne, int digitTwo) {
        return digitOne + digitTwo;}
}
