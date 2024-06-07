package _02_JavaFundamentals._04_Methods;

import java.util.Scanner;

public class _08_MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        double exponent = Double.parseDouble(scanner.nextLine());

        double result = mathPower(number, exponent);
        System.out.println(result);
    }

    private static double mathPower(double number, double exponent) {
        double result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
}
