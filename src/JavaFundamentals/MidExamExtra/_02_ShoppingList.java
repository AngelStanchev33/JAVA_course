package JavaFundamentals.MidExamExtra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _02_ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().trim().split("!");
        List<String> groceries = new ArrayList<>(Arrays.asList(line));

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Go Shopping!")) {
                break;
            }
            String[] tokens = input.split(" ");
            String command = tokens[0];
            String item = tokens[1];

            switch (command) {
                case "Urgent":
                    if (!groceries.contains(item)) {
                        groceries.add(0,item);
                    }
                    break;
                case "Unnecessary":
                    groceries.remove(item);
                    break;
                case "Correct":
                    String newItem = tokens[2];
                    int index = groceries.indexOf(item);
                    if (groceries.contains(item)) {
                        groceries.add(index, newItem);
                        groceries.remove(item);
                    }
                    break;
                case "Rearrange":
                    if (groceries.contains(item)) {
                        groceries.remove(item);
                        groceries.add(item);
                    }
                    break;
            }

        }

        StringBuilder print = new StringBuilder();
        for (int i = 0; i < groceries.size() - 1; i++) {
            String current = groceries.get(i);
            print.append(current).append(", ");
        }
        String lastGrocery = groceries.get(groceries.size() - 1);
        System.out.println(print + lastGrocery);

    }
}
