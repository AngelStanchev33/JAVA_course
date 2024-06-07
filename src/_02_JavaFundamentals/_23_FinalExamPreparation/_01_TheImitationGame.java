package _02_JavaFundamentals._23_FinalExamPreparation;

import java.util.Scanner;

public class _01_TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String encryptedMessage = scanner.nextLine();

        String input = scanner.nextLine();
        while (!"Decode".equals(input)) {
            String[] parts = input.split("\\|");
            String command = parts[0];

            switch (command) {
                case "Move":
                    int indexLetters = Integer.parseInt(parts[1]);
                    if (indexLetters >= 0 && indexLetters <= encryptedMessage.length()) {
                        String firstPart = encryptedMessage.substring(0, indexLetters);
                        String secondPart = encryptedMessage.substring(indexLetters);
                        encryptedMessage = secondPart + firstPart;
                    }
                    break;
                case "Insert":
                    int indexValue = Integer.parseInt(parts[1]);
                    String value = parts[2];
                    if (indexValue >= 0 && indexValue <= encryptedMessage.length()) {
                        String beforeIndex = encryptedMessage.substring(0, indexValue);
                        encryptedMessage = beforeIndex + value + encryptedMessage.substring(indexValue);
                    }
                    break;
                case "ChangeAll":
                    String sub = parts[1];
                    String replacement = parts[2];
                    if (encryptedMessage.contains(sub)) {
                        encryptedMessage = encryptedMessage.replace(sub, replacement);
                    }
                    break;
            }
            input = scanner.nextLine();
        }

        System.out.printf("The decrypted message is: %s", encryptedMessage);
    }
}

