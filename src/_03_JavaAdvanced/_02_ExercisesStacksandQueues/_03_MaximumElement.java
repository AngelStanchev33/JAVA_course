package _03_JavaAdvanced._02_ExercisesStacksandQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class _03_MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Deque<Integer> stackNum = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");

            switch (tokens[0]) {
                case "1":
                    stackNum.push(Integer.parseInt(tokens[1]));
                    break;
                case "2":
                    if (!stackNum.isEmpty()) {
                        stackNum.pop();
                    }
                    break;
                case "3":
                    int maximumElement = Collections.max(stackNum);
                    System.out.println(maximumElement);
                    break;
            }
        }
    }
}

