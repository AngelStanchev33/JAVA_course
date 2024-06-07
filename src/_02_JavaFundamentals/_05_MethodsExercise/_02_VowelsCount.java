package _02_JavaFundamentals._05_MethodsExercise;

import java.util.Scanner;

public class _02_VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int vowelCount = vowels(input);

        System.out.print(vowelCount);

    }
    private static int vowels(String input) {
        int vowelCount = 0;

        for (int i = 0; i <=input.length() -1 ; i++) {
            char letter = input.charAt(i);
            char lowercaseLetter = Character.toLowerCase(letter);

            if (lowercaseLetter == 'a' || lowercaseLetter== 'e'|| lowercaseLetter== 'i'|| lowercaseLetter== 'o'|| lowercaseLetter== 'u'){
                vowelCount++;
            }

        }
        return vowelCount;}
}
