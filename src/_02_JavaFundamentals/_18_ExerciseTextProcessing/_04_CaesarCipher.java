package _02_JavaFundamentals._18_ExerciseTextProcessing;

import java.util.Scanner;

public class _04_CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();

        String code = "";

        for (int i = 0; i < message.length(); i++) {
            char letter = message.charAt(i);
            int asciiValue = (int) letter;
            char symbol = (char) (asciiValue + 3);

            code += symbol;

        }

        System.out.print(code);
    }
}
