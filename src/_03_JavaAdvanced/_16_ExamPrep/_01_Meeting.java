import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.stream.Stream;

public class _01_Meeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> males = parseInputAsStack(scanner.nextLine(), true);
        Deque<Integer> females = parseInputAsStack(scanner.nextLine(), false);

        removeMultiplesOf25(males);
        removeMultiplesOf25(females);

        int matches = findMatches(males, females);

        System.out.printf("Matches: %d%n", matches);

        printRemaining("Males", males);
        printRemaining("Females", females);
    }

    private static int findMatches(Deque<Integer> males, Deque<Integer> females) {
        int matches = 0;

        while (!males.isEmpty() && !females.isEmpty()) {
            if (males.getFirst().equals(females.getFirst())) {
                males.remove();
                females.remove();
                matches++;
            } else {
                females.remove();
                Integer first = males.remove() - 2;
                males.addFirst(first);
                if (first <= 0) {
                    males.remove(first);
                }
            }
        }
        return matches;
    }

    private static void removeMultiplesOf25(Deque<Integer> stack) {
        stack.removeIf(n -> n % 25 == 0);
    }

    private static Deque<Integer> parseInputAsStack(String s, boolean fromFront) {
        int[] numbers = Stream.of(s.split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Deque<Integer> stack = new ArrayDeque<>();

        if (!fromFront) {
            for (int i = numbers.length - 1; i >= 0; i--) {
                stack.push(numbers[i]);
            }
        } else {
            for (int number : numbers) {
                stack.push(number);
            }
        }
        return stack;
    }

    private static void printRemaining(String gender, Deque<Integer> stack) {
        if (stack.isEmpty()) {
            System.out.println(gender + " left: none");
        } else {
            System.out.printf("%s left: %s%n", gender, join(stack));
        }
    }

    private static String join(Deque<Integer> stack) {
        StringJoiner joiner = new StringJoiner(", ");
        for (Integer element : stack) {
            joiner.add(String.valueOf(element));
        }
        return joiner.toString();
    }
}
