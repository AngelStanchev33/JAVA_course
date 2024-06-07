package _02_JavaFundamentals._25_FInalExamPrep;

import java.util.Scanner;

public class _01_WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine().trim();

        String input = scanner.nextLine().trim();
        while (!"Travel".equals(input)) {
            String[] parts = input.split(":");
            String command = parts[0];

            switch (command) {
                case "Add Stop":
                    int index = Integer.parseInt(parts[1]);
                    String addStop = parts[2];

                    if (index >= 0 && index < line.length()) {
                        line = line.substring(0, index) + addStop + line.substring(index);
                    }
                    break;
                case "Remove Stop":
                    int startIndex = Integer.parseInt(parts[1]);
                    int endIndex = Integer.parseInt(parts[2]);

                    boolean isValid = isValidIndex(startIndex, endIndex, line);

                    if (isValid) {
                        line = line.substring(0, startIndex ) + line.substring(endIndex +1);
                    }
                    break;
                case "Switch":
                    String oldString = parts[1];
                    String newString = parts[2];

                    if (line.contains(oldString)) {
                        line = line.replace(oldString, newString);
                    }
                    break;
            }

            input = scanner.nextLine();

            System.out.println(line);

        }

        System.out.printf("Ready for world tour! Planned stops: %s",line);

    }

    private static boolean isValidIndex(int startIndex, int endIndex, String line) {
        return startIndex >= 0 && startIndex < line.length() && endIndex >=0  && endIndex < line.length();
    }
}
