import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class _05_ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbs = new ArrayList<>(
                Arrays.asList(
                        Arrays.stream(scanner.nextLine().trim().split("\\s+"))
                                .map(Integer::parseInt)
                                .toArray(Integer[]::new)
                )
        );

        int n = Integer.parseInt(scanner.nextLine());

        Predicate<Integer> dividePredicate = e -> e % n == 0;

        numbs.removeIf(dividePredicate);
        Collections.reverse(numbs);

        numbs.forEach(e -> System.out.print(e + " "));
    }
}
