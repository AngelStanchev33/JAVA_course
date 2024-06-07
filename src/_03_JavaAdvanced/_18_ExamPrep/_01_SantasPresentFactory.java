package _03_JavaAdvanced._18_ExamPrep;

import java.util.*;
import java.util.stream.Stream;

public class _01_SantasPresentFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> materials = parseInputAsStack(scanner.nextLine(), false);
        Deque<Integer> magic = parseInputAsStack(scanner.nextLine(), true);

        Map<String, Integer> presents = new TreeMap<>();

        while (!materials.isEmpty() && !magic.isEmpty()) {
            int result = getResult(materials, magic);

            Integer magicFirst = magic.getFirst();
            Integer materialsFirst = materials.getFirst();

            if (isInGraph(result)) {
                String present = getPresent(result);
                if (!presents.containsKey(present)) {
                    presents.put(present, 1);
                } else {
                    presents.put(present, presents.get(present) + 1);
                }

                magic.removeFirst();
                materials.removeFirst();
            } else {
                if (result < 0) {
                    result = 0;
                    result = magicFirst + materialsFirst;
                    magic.removeFirst();
                    materials.removeFirst();
                    materials.addFirst(result);
                } else if (result > 0) {
                    magic.removeFirst();
                    int addMat = materials.removeFirst() + 15;
                    materials.addFirst(addMat);
                }
                if (magicFirst == 0) {
                    magic.removeFirst();
                } else if (materialsFirst == 0) {
                    materials.removeFirst();
                }
            }
        }

        boolean checkPresents1 = checkPair1(presents);
        boolean checkPresents2 = checkPair2(presents);

        if (checkPresents1 || checkPresents2) {
            System.out.println("The presents are crafted! Merry Christmas!");
        } else {
            System.out.println("No presents this Christmas!");
        }

        if (!materials.isEmpty()) {
            printItemsLeft(materials, "Materials");
        } else if (!magic.isEmpty()) {
            printItemsLeft(magic, "Magic");
        }

        for (Map.Entry<String, Integer> entry : presents.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }

    }

    private static void printItemsLeft(Deque<Integer> deque, String itemType) {
        Iterator<Integer> iterator = deque.iterator();
        System.out.print(itemType + " left: ");
        while (iterator.hasNext()) {
            Integer currentItem = iterator.next();
            if (iterator.hasNext()) {
                System.out.print(currentItem + ", ");
            } else {
                System.out.println(currentItem);
            }
        }
    }


    private static boolean checkPair2(Map<String, Integer> presents) {
        return presents.containsKey("Doll") && presents.containsKey("Wooden train");
    }

    private static boolean checkPair1(Map<String, Integer> presents) {
        return presents.containsKey("Teddy bear") && presents.containsKey("Bicycle");
    }

    private static int getResult(Deque<Integer> numbers, Deque<Integer> magic) {
        return numbers.getFirst() * magic.getFirst();
    }

    private static boolean isInGraph(int result) {
        return result == 150 || result == 250 || result == 300 || result == 400;
    }

    private static String getPresent(int result) {
        return switch (result) {
            case 150 -> "Doll";
            case 250 -> "Wooden train";
            case 300 -> "Teddy bear";
            case 400 -> "Bicycle";
            default -> "";
        };
    }


    public static Deque<Integer> parseInputAsStack(String s, boolean fromFront) {
        int[] numbers = Stream.of(s.split("\\s+"))
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
