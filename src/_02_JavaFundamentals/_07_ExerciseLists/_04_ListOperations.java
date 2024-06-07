import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _04_ListOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] parts = scanner.nextLine().split(" ");
        List<Integer> numbers = new ArrayList<>();
        for (String part : parts) {
            int current = Integer.parseInt(part);
            numbers.add(current);
        }

        String command = scanner.nextLine().trim();
        while (!"End".equals(command)) {
            String[] commandTokens = command.split("\\s+");
            String commandName = commandTokens[0];

            if (commandName.equals("Add")) {
                int argument = Integer.parseInt(commandTokens[1]);
                numbers.add(argument);
            } else if (commandName.equals("Insert")) {
                int index = Integer.parseInt(commandTokens[2]);
                int element = Integer.parseInt(commandTokens[1]);
                if (index >= 0 && index < numbers.size()) {
                    numbers.add(index, element);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (commandName.equals("Remove")) {
                int index = Integer.parseInt(commandTokens[1]);
                if (index >= 0 && index < numbers.size()) {
                    numbers.remove(index);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (commandName.equals("Shift")) {
                int positions = Integer.parseInt(commandTokens[2]);
                if (commandTokens[1].equals("left")) {
                    for (int i = 0; i < positions; i++) {
                        int first = numbers.get(0);
                        numbers.remove(0);
                        numbers.add(first);
                    }
                } else if (commandTokens[1].equals("right")) {
                    for (int i = 0; i < positions; i++) {
                        int last = numbers.get(numbers.size() - 1);
                        numbers.remove(numbers.size() - 1);
                        numbers.add(0, last);
                    }
                }
            }

            command = scanner.nextLine();
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
