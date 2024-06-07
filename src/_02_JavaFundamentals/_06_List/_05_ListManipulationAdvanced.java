package _02_JavaFundamentals._06_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _05_ListManipulationAdvanced {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] parts = scanner.nextLine().split(" ");

        List<Integer> numbers = new ArrayList<>();
        for (String part : parts) {
            Integer current = Integer.parseInt(part);
            numbers.add(current);
        }

        String command = scanner.nextLine();
        while (!"end".equals(command)) {
            String[] commandTokens = command.split(" ");
            String commandName = commandTokens[0];

            switch (commandName) {
                case "Contains":
                    int argument = Integer.parseInt(commandTokens[1]);
                    if (numbers.contains(argument)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;

                case "Print":
                    String type = commandTokens[1];
                    switch (type) {
                        case "even":
                            for (int i = 0; i < numbers.size(); i++) {
                                int current = numbers.get(i);
                                if (current % 2 == 0) {
                                    System.out.print(current + " ");
                                }
                            }
                            System.out.println();
                            break;

                        case "odd":
                            for (int i = 0; i < numbers.size(); i++) {
                                int current = numbers.get(i);
                                if (current % 2 != 0) {
                                    System.out.print(current + " ");
                                }
                            }
                            System.out.println();
                            break;
                    }
                    break;

                case "Get":
                    String operation = commandTokens[1];
                    int sum = 0;
                    for (int i = 0; i < numbers.size(); i++) {
                        int current = numbers.get(i);
                        sum += current;
                    }
                    if (operation.equals("sum")) {
                        System.out.println(sum);
                    }
                    break;

                case "Filter":
                    String condition = commandTokens[1];
                    int num = Integer.parseInt(commandTokens[2]);

                    for (int i = 0; i < numbers.size(); i++) {
                        int current = numbers.get(i);
                        if (condition.equals("<") && current < num) {
                            System.out.print(current + " ");
                        }
                        if (condition.equals(">") && current > num) {
                            System.out.print(current + " ");
                        }
                        if (condition.equals(">=") && current >= num) {
                            System.out.print(current + " ");
                        }
                        if (condition.equals("<=") && current <= num) {
                            System.out.print(current + " ");
                        }
                    }
                    System.out.println();
                    break;
            }

            command = scanner.nextLine();
        }
    }
}
