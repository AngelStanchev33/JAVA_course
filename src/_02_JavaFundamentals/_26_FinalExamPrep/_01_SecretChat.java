package _02_JavaFundamentals._26_FinalExamPrep;

import java.util.Scanner;

public class _01_SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        String input = scanner.nextLine();
        while (!"Reveal".equals(input)) {
            String[] parts = input.trim().split(":\\|:");
            String command = parts[0];

            switch (command) {
                case "InsertSpace":
                    int index = Integer.parseInt(parts[1]);
                    line = line.substring(0, index) + " " + line.substring(index);

                    System.out.println(line);
                    break;
                case "Reverse":
                    String subString = parts[1];
                    StringBuilder sb = new StringBuilder();
                    if (line.contains(subString)) {
                        sb.append(subString).reverse();
                        String reversedSub = sb.toString();

                        line = line.replace(subString, "");
                        line = line + reversedSub;

                        System.out.println(line);
                    } else {
                        System.out.println("error");
                        break;
                    }
                    break;
                case "ChangeAll":
                    String givenSub = parts[1];
                    String replacementText = parts[2];

                    if (line.contains(givenSub)) {
                        line = line.replaceAll(givenSub, replacementText);
                    }

                    System.out.println(line);
                    break;
            }
            input = scanner.nextLine();
        }

        System.out.printf("You have a new text message: %s%n", line);
    }
}
