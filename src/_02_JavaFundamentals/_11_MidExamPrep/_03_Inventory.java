package _02_JavaFundamentals._11_MidExamPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _03_Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> items = new ArrayList<>(Arrays.asList(scanner.nextLine().split(", ")))
                .stream()
                .collect(Collectors.toList());

        while (true){
            String line = scanner.nextLine();
            if (line.equals("Craft!")){
                break;
            }

            String[] lines = line.trim().split(" - ");
            String command = lines[0];
            String item = lines[1];

            switch (command){
                case "Collect":
                    if (items.contains(item)) {
                        break;
                    }
                    else {items.add(item);
                    }
                    break;
                case "Drop":
                    items.remove(item);
                    break;
                case "Combine Items":
                    String[] combineItems = item.split(":");
                    String oldItem = combineItems[0];
                    String newItem = combineItems[1];
                    if (items.contains(oldItem)){
                        int index = items.indexOf(oldItem);
                        items.add(index+1,newItem);
                        break;
                    }
                case "Renew":
                    if (items.contains(item)){
                    items.remove(item);
                    items.add(item);
                    }
                    break;
            }

        }
        System.out.println(String.join(
                ", ",
                items.stream().map(String::valueOf).collect(Collectors.toList())
        ));
    }
}
