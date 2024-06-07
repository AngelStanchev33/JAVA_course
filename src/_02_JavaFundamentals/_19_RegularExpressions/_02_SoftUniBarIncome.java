package _02_JavaFundamentals._19_RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _02_SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "%(?<name>[A-Z][a-z]+)%[^|$%.]*?<(?<product>[\\w]+)>[^|$%.]*?\\|(?<count>\\d+)\\|[^|$%.]*?(?<price>\\d+\\.?\\d*?)\\$";
        Pattern pattern = Pattern.compile(regex);

        double totalPrice = 0;

        String input = scanner.nextLine();
        while (!"end of shift".equals(input)) {

            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String name = matcher.group("name");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));

                double customerPrice = count * price;
                totalPrice += customerPrice;

                System.out.printf("%s: %s - %.2f%n", name, product, customerPrice);

            }

            input = scanner.nextLine();
        }

        System.out.printf( "Total income: %.2f",totalPrice);
    }
}
