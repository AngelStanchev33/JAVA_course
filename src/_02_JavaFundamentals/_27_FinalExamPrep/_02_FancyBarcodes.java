package _02_JavaFundamentals._27_FinalExamPrep;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _02_FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();

            String regex = "([@][#]+)([A-Z][a-z0-9A-Z]{4,}[A-Z])([@][#]+)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(line);

            StringBuilder sb = new StringBuilder();

            if (matcher.matches()) {
                String product = matcher.group();
                for (char ch : product.toCharArray()) {

                    if (Character.isDigit(ch)) {
                        sb.append(ch);
                    }
                }
                if (sb.length() ==0) {
                    sb.append("00");
                }
                String group = sb.toString();

                System.out.printf("Product group: %s%n", group);

            } else {
                System.out.println("Invalid barcode");
            }

        }
    }
}
