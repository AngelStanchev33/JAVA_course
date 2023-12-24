package JavaFundamentals._19_RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _06_ValidPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String password = scanner.nextLine();

            Pattern pattern = Pattern.compile("_\\.+[A-Z][A-Za-z0-9]{4,}[A-Z]_\\.+");
            Matcher matcher = pattern.matcher(password);

            if (matcher.find()) {
                String validPassword = matcher.group();

                String groupNumber = getGroupNumber(validPassword);

                if (groupNumber.isEmpty()) {
                    System.out.println("Group: default");
                } else {
                    System.out.printf("Group: %s%n", groupNumber);
                }
            }
            else {
                System.out.println("Invalid pass!");
            }

        }
    }

    private static String getGroupNumber(String validPassword) {
        StringBuilder sb = new StringBuilder();

        for (char symbol : validPassword.toCharArray()) {
            if (Character.isDigit(symbol)) {
                sb.append(symbol);
            }
        }
        return sb.toString();
    }
}
