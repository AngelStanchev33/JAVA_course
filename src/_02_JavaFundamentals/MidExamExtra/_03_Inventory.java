package _02_JavaFundamentals.MidExamExtra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _03_Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().trim().split(", ");
        List<String> inventory = new ArrayList<>(Arrays.asList(line));

        while (true) {
            String input = scanner.nextLine().trim();
            if (input.equals("Craft!"))
                break;

            String[] tokens = input.split(" - ");
            String command = tokens[0];
            String item = tokens[1];

            switch (command) {
                case "Collect":
                    if (!inventory.contains(item)) {
                        inventory.add(item);
                    }
                    break;
                case "Drop":
                    inventory.remove(item);
                    break;
                case "Combine Items":
                    String[] getNewItems = item.split(":");
                    String oldItems = getNewItems[0];
                    String newItems = getNewItems[1];
                    int index = inventory.indexOf(oldItems) + 1;
                    if (inventory.contains(oldItems)) {
                        inventory.add(index, newItems);
                    }
                    break;
                case "Renew":
                    if (inventory.contains(item)) {
                        inventory.remove(item);
                        inventory.add(inventory.size(), item);
                    }
                    break;
            }
        }
        String joined = String.join(", ",inventory);
        System.out.println(joined);
    }
}
