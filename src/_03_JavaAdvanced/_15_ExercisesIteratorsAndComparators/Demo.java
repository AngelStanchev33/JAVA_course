package _03_JavaAdvanced._15_ExercisesIteratorsAndComparators;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    Scanner scanner = new Scanner(System.in);
    int[] numbers = readIntArray(scanner);


    private static int[] readIntArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
