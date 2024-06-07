package _03_JavaAdvanced._02_ExercisesStacksandQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class _07_SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder stringBuilder = new StringBuilder();
        Deque<String> stack = new ArrayDeque<>();

        int numberOfOperators = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfOperators; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String nameOfTheOperation = tokens[0];

            switch (nameOfTheOperation) {
                case "1":
                    String command = tokens[1];
                    stringBuilder.append(command);
                    stack.push(command);
                    break;

                case "2":
                    int count = Integer.parseInt(tokens[1]);
                    if (!stringBuilder.isEmpty() && count <= stringBuilder.length()) {
                        stringBuilder.delete(stringBuilder.length() - count, stringBuilder.length());
                        if (!stringBuilder.isEmpty()) {
                            stack.push(String.valueOf(stringBuilder));
                        }
                    }
                    break;

                case "3":
                    int index = Integer.parseInt(tokens[1]);
                    if (index > 0 && index <= stringBuilder.length() && !stringBuilder.isEmpty()) {
                        char character = stringBuilder.charAt(index - 1);
                        System.out.println(character);
                    }
                    break;

                case "4":
                    if (!stack.isEmpty()) {
                        String previousState = stack.pop();
                        stringBuilder.setLength(0);
                        stringBuilder.append(previousState);
                    }
                    break;
            }
        }
    }
}
