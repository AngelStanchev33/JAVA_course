package _03_JavaAdvanced._02_ExercisesStacksandQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class _01_ReverseNumbersWithStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Deque<Integer> numberStack = new ArrayDeque<>();

        for (int number : numbers) {
            numberStack.push(number);
        }

        while (!numberStack.isEmpty()){
            System.out.print(numberStack.pop() + " ");
        }
    }
}
