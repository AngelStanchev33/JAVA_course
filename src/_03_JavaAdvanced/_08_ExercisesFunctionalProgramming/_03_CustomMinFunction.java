package _03_JavaAdvanced._08_ExercisesFunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class _03_CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Function<Integer[], Integer> findSmallestNumber = arr -> Arrays.stream(arr)
                .min(Integer::compare)
                .get();


        Integer[] numbs = Arrays.stream(scanner.nextLine().trim().split("\\s+"))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);

        Integer smallsNumber = findSmallestNumber.apply(numbs);

        System.out.println(smallsNumber);

    }
}
