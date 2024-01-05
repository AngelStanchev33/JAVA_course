package JavaFundamentals._22_FinalExamPreparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _02_FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < n; i++) {
            String barcode = scanner.nextLine();

            String regex = "([@][#]+)([A-Z][a-zA-Z0-9]{4,}[A-Z])([@][#]+)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(barcode);

            if (matcher.find()) {
                String match = matcher.group();
                StringBuilder sb = new StringBuilder();
                int count = 0;

                for (char letter : match.toCharArray()) {
                    if (Character.isDigit(letter)) {
                        sb.append(letter);
                        count++;
                    }
                }
                if (count == 0) {
                    sb.append("00");
                }

                String result = sb.toString();
                System.out.printf("Product group: %s%n", result);

            } else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
