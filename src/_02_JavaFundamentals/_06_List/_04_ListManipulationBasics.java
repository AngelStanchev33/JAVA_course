package _02_JavaFundamentals._06_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _04_ListManipulationBasics {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] parts = scanner.nextLine().split(" ");

        List<Integer> numbers = new ArrayList<>();
        for (String part : parts){
            int current = Integer.parseInt(part);
            numbers.add(current);
        }

        String command = scanner.nextLine();
        while (!"end".equals(command)) {
            String[]commandParts = command.split(" ");
            String commandName = commandParts[0];
            int argument = Integer.parseInt(commandParts[1]);

            switch (commandName){
                case "Add":
                    numbers.add(argument);
                    break;

                case "Remove":
                    numbers.remove(Integer.valueOf(argument));
                    break;

                case "RemoveAt":
                    numbers.remove(argument);
                    break;

                case "Insert":
                    int index = Integer.parseInt(commandParts[2]);
                    numbers.add(index,argument);
                    break;
            }

            command = scanner.nextLine();
        }
    System.out.println(numbers.toString().replaceAll("[\\[\\],]",""));


    }

}

