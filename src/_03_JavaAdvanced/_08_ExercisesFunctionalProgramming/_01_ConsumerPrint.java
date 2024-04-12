package _03_JavaAdvanced._08_ExercisesFunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class _01_ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Consumer<String> printName = System.out::println;

        Arrays.stream(scanner.nextLine().trim().split("\\s+"))
                .forEach(printName);


    }
}
