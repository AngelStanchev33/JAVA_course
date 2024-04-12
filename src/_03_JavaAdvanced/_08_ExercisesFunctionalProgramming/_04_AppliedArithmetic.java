import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _04_AppliedArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbs = Arrays.stream(scanner.nextLine().trim().split("\\s+"))
                .map(Integer::parseInt)
                .toList();

        Function<Integer, Integer> add = (n) -> n + 1;
        Function<Integer, Integer> multiply = (n) -> n * 2;
        Function<Integer, Integer> subtract = (n) -> n - 1;

        String line = scanner.nextLine().trim();

        while (!"end".equals(line)) {

            switch (line) {
                case "add":
                    numbs = numbs.stream()
                            .map(add)
                            .collect(Collectors.toList());
                    break;
                case "multiply":
                    numbs = numbs.stream()
                            .map(multiply)
                            .collect(Collectors.toList());
                    break;
                case "subtract":
                    numbs = numbs.stream()
                            .map(subtract)
                            .collect(Collectors.toList());
                    break;
                case "print":
                    numbs.forEach(n -> System.out.print(n + " "));
            }

            line = scanner.nextLine().trim();
        }
    }
}
