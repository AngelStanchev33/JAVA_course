import java.util.ArrayDeque;
import java.util.Scanner;

public class _03_DecimalToBinaryConvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> binary = new ArrayDeque<>();

        if (number == 0) {
            binary.push(0);
        } else {
            while (number != 0) {
                int binaryResult = number % 2;
                binary.push(binaryResult);
                number = number / 2;
            }
        }

        while (!binary.isEmpty()) {
            System.out.print(binary.pop());
        }
    }
}
