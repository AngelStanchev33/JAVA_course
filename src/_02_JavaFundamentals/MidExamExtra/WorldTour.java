package _02_JavaFundamentals.MidExamExtra;

import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stops = scanner.nextLine();

        String line = scanner.nextLine();
        while (!"Travel".equals(line)) {
            String[] split = line.split(":");
            String command = split[0];

            switch (command) {
                case "Add Stop":
                    int index = Integer.parseInt(split[1]);
                    String string = split[2];

                    if (index >= 0 && index < stops.length()) {
                        stops = stops.substring(0, index) + string + stops.substring(index);
                    }
                    System.out.println(stops);
                    break;
                case "Remove Stop":
                    int startIndex = Integer.parseInt(split[1]);
                    int endIndex = Integer.parseInt(split[2]);

                    if (startIndex >= 0 && startIndex < stops.length() && endIndex >= 0 && endIndex < stops.length()) {
                        stops = stops.substring(0, startIndex) + stops.substring(endIndex + 1);
                    }
                    System.out.println(stops);
                    break;
                case "Switch":
                    String oldString = split[1];
                    String newString = split[2];

                    if (stops.contains(oldString)) {
                        stops = stops.replaceAll(oldString, newString);
                    }
                    System.out.println(stops);
                    break;
            }
            line = scanner.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s", stops);
    }
}
