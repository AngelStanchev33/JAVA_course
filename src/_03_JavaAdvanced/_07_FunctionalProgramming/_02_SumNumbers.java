package _03_JavaAdvanced._07_FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class _02_SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] numbs = Arrays.stream(scanner.nextLine().trim().split(" ,"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Function<int[], String> countNumbers = arr -> "Count = " + arr.length;
        Function<int[], String> sumNumbers = arr -> "Sum = " + Arrays.stream(arr).sum();

        System.out.println(countNumbers.apply(numbs));
        System.out.println(sumNumbers.apply(numbs));
    }
}
