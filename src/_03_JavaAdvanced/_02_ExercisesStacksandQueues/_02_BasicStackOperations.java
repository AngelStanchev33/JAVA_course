package _03_JavaAdvanced._02_ExercisesStacksandQueues;

import java.util.*;

public class _02_BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nsx = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int n = nsx[0]; //number of elements to push into the stack,
        int s = nsx[1]; // number of elements to pop from the stack
        int x = nsx[2]; //that you should check whether is present in the stack.

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Deque<Integer> stackNumbers = new ArrayDeque<>();

        // Проверка за добавяне на числа в стека
        for (int i = 0; i < n; i++) {
            stackNumbers.push(numbers[i]);
        }

        // Проверка за изваждане на числа от стека
        for (int i = 0; i < s; i++) {
            if (!stackNumbers.isEmpty()) {
                stackNumbers.pop();
            }
        }

        // Проверка дали числото x е в стека
        if (stackNumbers.contains(x)) {
            System.out.println(true);
        } else {
            // Ако x не е в стека, отпечатваме най-малкото число в стека
            if (!stackNumbers.isEmpty()) {
                int smallestNum = Collections.min(stackNumbers);
                System.out.println(smallestNum);
            } else {
                // Ако стекът е празен, отпечатваме 0
                System.out.println(0);
            }
        }
    }
}
