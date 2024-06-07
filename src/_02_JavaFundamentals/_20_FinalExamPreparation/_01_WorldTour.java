import java.util.Scanner;

public class _01_WorldTour {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stops = scanner.nextLine();

        while (true) {
            String[] command = scanner.nextLine().split(":");
            if (command[0].equals("Travel")) {
                break;
            }

            switch (command[0]) {
                case "Add Stop":
                    int indexAdd = Integer.parseInt(command[1]);
                    String stringAdd = command[2];
                    if (indexAdd >= 0 && indexAdd < stops.length()) {
                        stops = stops.substring(0, indexAdd) + stringAdd + stops.substring(indexAdd);
                    }
                    break;

                case "Remove Stop":
                    int startIdx = Integer.parseInt(command[1]);
                    int endIdx = Integer.parseInt(command[2]);
                    if (startIdx >= 0 && startIdx < stops.length() && endIdx >= 0 && endIdx < stops.length()) {
                        stops = stops.substring(0, startIdx) + stops.substring(endIdx + 1);
                    }
                    break;

                case "Switch":
                    String oldString = command[1];
                    String newString = command[2];
                    if (stops.contains(oldString)) {
                        stops = stops.replace(oldString, newString);
                    }
                    break;
            }

            System.out.println(stops);
        }

        System.out.println("Ready for world tour! Planned stops: " + stops);
    }
}
