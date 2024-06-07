package _02_JavaFundamentals._02_ArraysExercise;

import java.util.Scanner;

public class _02_CommonElements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] firstArray = scanner.nextLine().split(" ");
        String[] secondArray = scanner.nextLine().split(" ");

        for (String elementOne : firstArray) {
            for (String elementTwo : secondArray) {
                if (elementOne.equals(elementTwo)) {
                    System.out.print(elementOne + " ");
                }
            }
        }
    }
}
