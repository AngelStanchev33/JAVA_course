package _03_JavaAdvanced._15_ExercisesIteratorsAndComparators._04_Froggy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Lake lake = new Lake();

        while (!"END".equals(input)) {
            int[] numbers = readIntArray(input);

            lake = new Lake(numbers);

            input = scanner.nextLine();
        }

        for (Integer i : lake) {
            if (i < Lake.size(lake)) {
                System.out.print(i + ", ");
            }else {
                System.out.println(i);
            }
        }
    }

    private static int[] readIntArray(String input) {
        return Arrays.stream(input.split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
