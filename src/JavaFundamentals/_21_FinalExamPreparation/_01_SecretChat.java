package JavaFundamentals._21_FinalExamPreparation;

import java.util.Scanner;
import java.util.regex.Pattern;

public class _01_SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String concealedMessage = scanner.nextLine();

        while (true) {
            String input = scanner.nextLine();
            String[] instructions = input.split(":\\|:");
            if (input.equals("Reveal")) {
                break;
            }
            String instructionName = instructions[0];

            switch (instructionName) {

                case "InsertSpace":
                    int index = Integer.parseInt(instructions[1]);
                    if (index >= 0 && index < concealedMessage.length()) {
                        concealedMessage = concealedMessage.substring(0, index) + " " + concealedMessage.substring(index);
                    }
                    break;
                case "Reverse":
                    String substrings = instructions[1];
                    String escapedSubstrings = Pattern.quote(substrings);

                    StringBuilder reversed = new StringBuilder(substrings).reverse();
                    String result = reversed.toString();

                    if (concealedMessage.contains(substrings)) {
                        concealedMessage = concealedMessage.replaceFirst(escapedSubstrings, result);
                    } else {
                        System.out.println("error");
                        continue;
                    }
                    break;
                case "ChangeAll":
                    String text = instructions[1];
                    String replace = instructions[2];
                    if (concealedMessage.contains(text)) {
                        concealedMessage = concealedMessage.replaceAll(text, replace);
                    }

            }

            System.out.println(concealedMessage);
        }

        System.out.printf("You have a new text message: %s%n",concealedMessage);
    }
}
