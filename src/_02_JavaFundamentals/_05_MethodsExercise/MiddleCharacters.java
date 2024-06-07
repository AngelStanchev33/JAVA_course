import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String middleChar = middleChar(input);

        System.out.println(middleChar);
    }

    private static String middleChar(String input) {
        int length = input.length();
        String middleOFinal = "";

        if (length % 2 == 0) {
            char middle1 = input.charAt(length / 2 - 1);
            char middle2 = input.charAt(length / 2);
            middleOFinal = String.valueOf(middle1) + String.valueOf(middle2);
        } else {
            char middle = input.charAt(length / 2);
            middleOFinal = String.valueOf(middle);
        }

        return middleOFinal;
    }
}
