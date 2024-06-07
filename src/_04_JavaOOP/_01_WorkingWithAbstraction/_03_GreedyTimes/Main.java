package _04_JavaOOP._01_WorkingWithAbstraction._03_GreedyTimes;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long bagCapacity = Long.parseLong(scanner.nextLine());

        String[] items = scanner.nextLine().split(" ");

        Map<String, Map<String, Long>> bag = new LinkedHashMap<>();

        long goldAmount = 0L;
        long cashAmount = 0L;
        long gemAmount = 0L;

        for (int i = 0; i < items.length; i += 2) {
            String item = items[i];
            long amount = Long.parseLong(items[i + 1]);

            String typeOFTreasure = itemType(item);

            switch (typeOFTreasure) {
                case "Gold":
                    if (canAddToBag(bagCapacity, goldAmount, amount)) {
                        bag.putIfAbsent(typeOFTreasure, new LinkedHashMap<>());
                        Map<String, Long> gold = bag.get(typeOFTreasure);
                        goldAmount += amount;
                        gold.put(item, goldAmount);
                    }
                    break;
                case "Gem":
                    if (canAddToBag(bagCapacity, gemAmount, amount)) {
                        bag.putIfAbsent(typeOFTreasure, new LinkedHashMap<>());
                        Map<String, Long> gem = bag.get(typeOFTreasure);
                        gemAmount += amount;

                        if (goldAmount >= gemAmount) {
                            gem.put(item, gemAmount);
                        } else {
                            gemAmount -= amount;
                        }
                    }
                    break;
                case "Cash":
                    if (canAddToBag(bagCapacity, cashAmount, amount)) {
                        bag.putIfAbsent(typeOFTreasure, new LinkedHashMap<>());
                        Map<String, Long> cash = bag.get(typeOFTreasure);
                        cashAmount += amount;

                        if (gemAmount >= cashAmount) {
                            cash.put(item, cashAmount);
                        } else {
                            cashAmount -= amount;
                        }
                        break;
                    }
                    break;
            }
        }

    }

    private static boolean canAddToBag(long capacity, long currentAmount, long amountToAdd) {
        return currentAmount + amountToAdd <= capacity;
    }

    private static String itemType(String item) {
        String type = "";

        if (item.equalsIgnoreCase("Gold")) {
            type = "Gold";
        }
        if (item.toLowerCase().endsWith("gem")) {
            type = "Gem";
        }
        if (item.length() == 3) {
            type = "Cash";
        }
        return type;
    }
}
