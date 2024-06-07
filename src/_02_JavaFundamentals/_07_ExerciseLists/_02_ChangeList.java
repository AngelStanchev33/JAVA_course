package _02_JavaFundamentals._07_ExerciseLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _02_ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = readInList(scanner);

        String command = scanner.nextLine();
        while (!"end".equals(command)) {
            String[] commandTokens = command.split("\\s+");
            String commandName = commandTokens[0];
            int argument = Integer.parseInt(commandTokens[1]);

            switch (commandName) {
                case "Delete":
                    while (numbers.contains(argument)) {
                        numbers.remove(Integer.valueOf(argument));
                    }
                    break;

                case "Insert":
                    if (commandTokens.length > 2) {
                        int index = Integer.parseInt(commandTokens[2]);
                        numbers.add(index,argument);
                    }
                    break;
            }
            command =scanner.nextLine();
        }
        prinNumbers(numbers);

    }

    private static void prinNumbers(List<Integer> list) {

        for (Integer element : list) {
            System.out.print(element + " ");
        }
    }

        private static List<Integer> readInList (Scanner scanner){
            List<Integer> numbers = new ArrayList<>();
            String[] input = scanner.nextLine().split(" ");
            for (String s : input) {
                numbers.add(Integer.parseInt(s));
            }
            return numbers;
        }
}
