package JavaFundamentals._27_FinalExamPrep;

import java.util.Scanner;

public class _01_ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        String input = scanner.nextLine();
        while (!input.equals("Generate")) {
            String[] instructions = input.split(">>>");
            String command = instructions[0];

            switch (command) {
                case "Contains":
                    String sub = instructions[1];
                    if (line.contains(sub)) {
                        System.out.printf("%s contains %s%n", line, sub);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String caseType = instructions[1];
                    int startIndex = Integer.parseInt(instructions[2]);
                    int endIndex = Integer.parseInt(instructions[3]);

                    line = flipSubstring(line, caseType, startIndex, endIndex);
                    System.out.println(line);
                    break;
                case "Slice":
                    int cutStart = Integer.parseInt(instructions[1]);
                    int cutEnd = Integer.parseInt(instructions[2]);

                    line = line.substring(0, cutStart) + line.substring(cutEnd);
                    System.out.println(line);
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.printf("Your activation key is: %s%n", line);
    }

    private static String flipSubstring(String line, String caseType, int startIndex, int endIndex) {
        StringBuilder flipped = new StringBuilder(line.substring(startIndex, endIndex));

        if (caseType.equals("Upper")) {
            flipped = new StringBuilder(flipped.toString().toUpperCase());
        } else if (caseType.equals("Lower")) {
            flipped = new StringBuilder(flipped.toString().toLowerCase());
        }

        return line.substring(0, startIndex) + flipped + line.substring(endIndex);
    }
}
