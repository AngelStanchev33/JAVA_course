package _02_JavaFundamentals._01_Array;

import java.util.Arrays;
import java.util.Scanner;

public class _06_EqualArrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arrayOne = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] arrayTwo = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int arrayOneSum = 0;

        boolean areIdentical = true;

        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] != arrayTwo[i]) {
                System.out.printf("Arrays are not identical.%nFound difference at %d index.%n", i);
                areIdentical = false;
                break;
            }
            arrayOneSum += arrayOne[i];
        }

        if (areIdentical) {
            System.out.printf("Arrays are identical.%nSum: %d%n", arrayOneSum);
        }
    }
}
