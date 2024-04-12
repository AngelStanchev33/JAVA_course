package _03_JavaAdvanced._08_ExercisesFunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class _06_PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String[] names = Arrays.stream(scanner.nextLine().trim().split("\\s+"))
                .toArray(String[]::new);

        Predicate<String> nameLength = e -> e.length() <= n;

        names = Arrays.stream(names)
                .filter(nameLength)
                .toArray(String[]::new);

        Arrays.stream(names)
                .forEach(System.out::println);
    }
}
