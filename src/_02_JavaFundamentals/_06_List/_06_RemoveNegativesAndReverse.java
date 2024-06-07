import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class _06_RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] parts = scanner.nextLine().split(" ");

        List<Integer> numbers = new ArrayList<>();
        for (String part : parts) {
            int current = Integer.parseInt(part);
            numbers.add(current);
        }

        List<Integer> positiveNumbers = new ArrayList();

        for (int i = 0; i < numbers.size(); i++) {
            int current = numbers.get(i);

            if (current >= 0) {
                positiveNumbers.add(current);
            }
        }

        Collections.reverse(positiveNumbers);

        if (positiveNumbers.isEmpty()){
            System.out.print("empty");
        }
        else {
            for (int num : positiveNumbers) {
            System.out.print(num + " ");
            }

        }
    }
}
