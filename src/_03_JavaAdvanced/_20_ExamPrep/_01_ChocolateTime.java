package _03_JavaAdvanced._20_ExamPrep;

import java.util.*;
import java.util.stream.Stream;

public class _01_ChocolateTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Double> milkQuantity = getFromInput(scanner, true);
        Deque<Double> cacaoPowder = getFromInput(scanner, false);

        Map<String, Integer> chocolates = new TreeMap<>();

        while (!milkQuantity.isEmpty() && !cacaoPowder.isEmpty()) {

            double sumOfCacaoAndMilk = milkQuantity.getFirst() + cacaoPowder.getFirst();
            int chocolatePercentage = (int) ((cacaoPowder.getFirst() / sumOfCacaoAndMilk) * 100);

            if (chocolatePercentage == 30 || chocolatePercentage == 50 || chocolatePercentage == 100) {
                String chocolate = prepareTheChocolate(chocolatePercentage);
                milkQuantity.removeFirst();
                cacaoPowder.removeFirst();
                chocolates.merge(chocolate, 1, Integer::sum);

            } else {
                cacaoPowder.removeFirst();
                Double last = milkQuantity.removeFirst() + 10;
                milkQuantity.addLast(last);
            }
        }

        if (chocolates.containsKey("Baking Chocolate") && chocolates.containsKey("Dark Chocolate")
                && chocolates.containsKey("Milk Chocolate")) {
            System.out.println("It’s a Chocolate Time. All chocolate types are prepared.");
        } else {
            System.out.println("Sorry, but you didn't succeed to prepare all types of chocolates.");
        }

        if (!chocolates.isEmpty()) {
            chocolates.forEach((key, value) -> System.out.printf("# %s --> %d\n", key, value));
        }
    }

    private static String prepareTheChocolate(int sum) {
        return switch (sum) {
            case 30 -> "Milk Chocolate";
            case 50 -> "Dark Chocolate";
            case 100 -> "Baking Chocolate";
            default -> "";
        };
    }

    private static Deque<Double> getFromInput(Scanner scanner, boolean fromFront) {
        List<Double> numbers = Stream.of(scanner.nextLine().split("\\s+"))
                .map(Double::parseDouble)
                .toList();

        Deque<Double> stack = new ArrayDeque<>();

        if (fromFront) {
            numbers.forEach(stack::addLast);
        } else {
            numbers.forEach(stack::addFirst);
        }
        return stack;
    }

}


