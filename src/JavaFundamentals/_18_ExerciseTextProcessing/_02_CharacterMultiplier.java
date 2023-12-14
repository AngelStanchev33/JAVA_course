package JavaFundamentals._18_ExerciseTextProcessing;

import java.util.Scanner;

public class _02_CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] data = scanner.nextLine().split("\\s+");
        String stringOne = data[0];
        String stringTwo = data[1];

        int result =asciiValue(stringOne, stringTwo);
        System.out.print(result);


    }

    private static int asciiValue(String stringOne, String stringTwo) {

        int multiply = 0;
        int sum = 0;

        int longString = Math.max(stringOne.length(), stringTwo.length());
        int shortString = Math.min(stringOne.length(), stringTwo.length());

        for (int i = 0; i < shortString; i++) {

            char one = stringOne.toCharArray()[i];
            int valueOne = (int) one;
            char two = stringTwo.toCharArray()[i];
            int valueTwo = (int) two;

            multiply = valueOne * valueTwo;
            sum += multiply;

        }
        for (int i = shortString; i < longString; i++) {
            if (longString == stringOne.length()) {
                sum += stringOne.charAt(i);
            } else {
                sum += stringTwo.charAt(i);
            }

        }
        return sum;
    }

}
