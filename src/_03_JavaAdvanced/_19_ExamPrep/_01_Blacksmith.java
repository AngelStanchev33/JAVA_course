package _03_JavaAdvanced._19_ExamPrep;

import java.util.*;
import java.util.stream.Stream;

public class _01_Blacksmith {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> steel = getFromInput(scanner, true);
        Deque<Integer> carbon = getFromInput(scanner, false);

        Map<String,Integer> craftedSwords = new TreeMap<>();

        int craftSwords = 0;

        while (!steel.isEmpty() && !carbon.isEmpty()) {

            int sum = getSum(steel, carbon);

            if (sum == 70 || sum == 80 || sum == 90 || sum == 110) {
                craftSwords++;
                String item = forge(sum);
                craftedSwords.merge(item,1,Integer::sum);

                steel.removeFirst();
                carbon.removeFirst();
            } else {
                steel.removeFirst();
                Integer first = carbon.removeFirst() + 5;
                carbon.addFirst(first);
            }
        }

        if (!craftedSwords.isEmpty()) {
            System.out.printf("You have forged %d swords.%n", craftSwords);
        } else {
            System.out.println("You did not have enough resources to forge a sword.");
        }

        printItemsLeft(steel, "Steel ");
        printItemsLeft(carbon, "Carbon ");

        craftedSwords.forEach((key, value) -> System.out.printf("%s: %d%n", key, value));
    }

    private static void printItemsLeft(Deque<Integer> deque, String itemType) {
        Iterator<Integer> iterator = deque.iterator();
        System.out.print(itemType + "left: ");

        if (deque.isEmpty()) {
            System.out.print("none");
            System.out.println();
        } else {

            while (iterator.hasNext()) {
                Integer currentItem = iterator.next();

                if (iterator.hasNext()) {
                    System.out.print(currentItem + ", ");
                } else {
                    System.out.println(currentItem);
                }
            }
        }
    }

    private static String forge(int sum) {
        return switch (sum) {
            case 70 -> "Gladius";
            case 80 -> "Shamshir";
            case 90 -> "Katana";
            case 110 -> "Sabre";
            default -> "";
        };
    }

    private static int getSum(Deque<Integer> steel, Deque<Integer> carbon) {
        return steel.getFirst() + carbon.getFirst();
    }

    private static Deque<Integer> getFromInput(Scanner scanner, boolean fromFront) {

        int[] numbers = Stream.of(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Deque<Integer> stack = new ArrayDeque<>();

        if (!fromFront) {
            Arrays.stream(numbers)
                    .forEach(stack::addFirst);
        } else {
            Arrays.stream(numbers)
                    .forEach(stack::addLast);
        }
        return stack;
    }
}
