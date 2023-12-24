package JavaFundamentals._19_RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _04_NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        String[] parts = line.split("\\s*,\\s*");
        for (String s : parts) {

            int health = getDemonName(s);

            double damage = getDamage(s);
            for (char symbol : s.toCharArray()) {
                if (symbol == '*') {
                    damage *= 2;
                } else if (symbol == '/') {
                    damage /= 2;

                }
            }

            System.out.printf("%s - %d health, %.2f damage%n", s, health, damage);
        }
    }

    private static double getDamage(String damage) {
        double damagePoints = 0;

        Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
        Matcher matcher = pattern.matcher(damage);

        while (matcher.find()) {
            damagePoints += Double.parseDouble(matcher.group());
        }
        return damagePoints;

    }

    private static int getDemonName(String demonName) {

        int health = 0;

        Pattern pattern = Pattern.compile("(?<name>[^^+\\-*/.0-9])");
        Matcher matcher = pattern.matcher(demonName);

        while (matcher.find()) {
            health += (int) matcher.group().charAt(0);
        }
        return health;
    }
}

