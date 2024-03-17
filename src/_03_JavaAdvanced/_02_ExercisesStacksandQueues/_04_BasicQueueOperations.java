package _03_JavaAdvanced._02_ExercisesStacksandQueues;

import java.util.*;

public class _04_BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] tokens = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Deque<Integer> numStack = new ArrayDeque<>();

        int n = tokens[0];
        int s = tokens[1];
        int x = tokens[2];

        int[] numbs = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < n; i++) {
            numStack.offer(numbs[i]);
        }
        for (int i = 0; i < s; i++) {
            if (!numStack.isEmpty()) {
                numStack.poll();
            }
        }
        if (numStack.isEmpty()) {
            System.out.println(0);
        } else if (numStack.contains(x)) {
            System.out.println(true);
        } else {
            System.out.println(Collections.min(numStack));
        }
    }
}
