import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _02_GaussTrick {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] parts = scanner.nextLine().split(" ");

        List<Integer> numbers = new ArrayList<>();
        for (String part : parts) {
            Integer current = Integer.parseInt(part);
            numbers.add(current);
        }

        if (numbers.size() % 2 == 0) {

            for (int i = 0; i < numbers.size(); i++) {
                int current = numbers.get(i);
                int last = numbers.get(numbers.size() - 1);

                numbers.remove(numbers.size() - 1);
                numbers.set(i, current + last);
            }
        } else {

            for (int i = 0; i < numbers.size() / 2; i++) {
                int current = numbers.get(i);
                int last = numbers.get(numbers.size() - 1);

                numbers.remove(numbers.size() - 1);
                numbers.set(i, current + last);
            }
        }

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
