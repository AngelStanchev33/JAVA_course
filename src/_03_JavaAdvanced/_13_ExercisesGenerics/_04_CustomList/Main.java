package _03_JavaAdvanced._13_ExercisesGenerics._04_CustomList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().trim();
        CustomLIst<String> customList = new CustomLIst<>();

        while (!"END".equals(input)) {

            String[] tokens = input.split("\\s+");
            String command = tokens[0];

            switch (command) {

                case "Add":
                    customList.Add(tokens[1]);
                    break;
                case "Remove":
                    customList.remove(Integer.parseInt(tokens[1]));
                    break;
                case "Contains":
                    System.out.println(customList.contains(tokens[1]));
                    break;
            }




            input = scanner.nextLine();
        }
    }
}
