import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _03_HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> guestList = new ArrayList<>();
        int commandsCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < commandsCount; i++) {
            String[] commandTokens = scanner.nextLine().split(" ", 2);
            String name = commandTokens[0];
            String commandName = commandTokens[1];

            if (commandName.equals("is going!")) {
                if (!guestList.contains(name)) {
                    guestList.add(name);
                } else {
                    System.out.printf("%s is already in the list!%n", name);
                }
            } else if (commandName.equals("is not going!")) {
                if (guestList.contains(name)) {
                    guestList.remove(name);
                } else {
                    System.out.printf("%s is not in the list!%n", name);
                }
            }
        }

        System.out.println(String.join(System.lineSeparator(), guestList));
    }
}
