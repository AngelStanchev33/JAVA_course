import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = readInList(scanner);
        int capacity = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();
        while (!"end".equals(command)) {
            String[] commandTokens = command.split(" ");

            if ("Add".equals(commandTokens[0])) {
                int passengers = Integer.parseInt(commandTokens[1]);
                wagons.add(passengers);
            } else {
                int passengersToAdd = Integer.parseInt(commandTokens[0]);
                for (int i = 0; i < wagons.size(); i++) {
                    int currentWagon = wagons.get(i);
                    if (currentWagon + passengersToAdd <= capacity) {
                        wagons.set(i, currentWagon + passengersToAdd);
                        break;
                    }
                }
            }

            command = scanner.nextLine();
        }

        printTrain(wagons);
    }

    private static void printTrain(List<Integer> list) {
        for (Integer element : list) {
            System.out.print(element + " ");
        }
    }

    private static List<Integer> readInList(Scanner scanner) {
        List<Integer> train = new ArrayList<>();
        String[] input = scanner.nextLine().split(" ");
        for (String s : input) {
            train.add(Integer.parseInt(s));
        }
        return train;
    }
}
