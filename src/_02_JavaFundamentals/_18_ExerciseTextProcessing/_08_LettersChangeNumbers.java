import java.util.Scanner;

public class _08_LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        double totalSum = 0;

        for (String text : input) {
            char firstLetter = text.charAt(0);
            char lastLetter = text.charAt(text.length() - 1);
            int number = Integer.parseInt(text.substring(1, text.length() - 1));

            double result = 0;

            if (Character.isUpperCase(firstLetter)) {
                result = (double) number / (firstLetter - 'A' + 1);
            } else if (Character.isLowerCase(firstLetter)) {
                result = (double) number * (firstLetter - 'a' + 1);
            }

            if (Character.isUpperCase(lastLetter)) {
                result -= (lastLetter - 'A' + 1);
            } else if (Character.isLowerCase(lastLetter)) {
                result += (lastLetter - 'a' + 1);
            }

            totalSum += result;
        }

        System.out.printf("%.2f", totalSum);
    }
}
