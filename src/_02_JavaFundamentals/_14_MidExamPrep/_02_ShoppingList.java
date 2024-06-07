package _02_JavaFundamentals._14_MidExamPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _02_ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().trim().split("!");
        List<String> groceries = new ArrayList<>(Arrays.asList(input));

        while (true) {
            String line = scanner.nextLine();
            if (line.equals("Go Shopping!")) {
                break;
            }
            String[] tokens = line.split(" ");
            String command = tokens[0];
            String item = tokens[1];

            switch (command) {
                case "Urgent":
                    if (!groceries.contains(item)) {
                        groceries.add(0, item);
                    } else {
                        break;
                    }
                    break;
                case "Unnecessary":
                    groceries.remove(item);
                    break;
                case "Correct":
                    String newItem = tokens[2];
                    if (groceries.contains(item)) {
                        int index = groceries.indexOf(item);
                        groceries.remove(item);
                        groceries.add(index, newItem);
                    } else {
                        break;
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

        String joined = String.join(", ",groceries);
        System.out.println(joined);
    }
}
