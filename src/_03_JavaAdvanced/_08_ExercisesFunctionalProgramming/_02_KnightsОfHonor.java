package _03_JavaAdvanced._08_ExercisesFunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class _02_KnightsОfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Consumer<String> printName = System.out::println;

        Stream<String> names = Arrays.stream(scanner.nextLine().trim().split("\\s+"))
                .map(name -> "Sir " + name);

        names.forEach(printName);
    }
}
