package JavaFundamentals.MidExamExtra;

import java.util.Scanner;

public class _01_GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double kiloFood = Double.parseDouble(scanner.nextLine());
        double kiloHay = Double.parseDouble(scanner.nextLine());
        double kiloCover = Double.parseDouble(scanner.nextLine());
        double kiloWeight = Double.parseDouble(scanner.nextLine());

        boolean enough = true;

        for (int i = 1; i < 31; i++) {

            kiloFood -= 0.300;

            if (i % 2 == 0) {
                double hay = kiloFood * 0.05;
                kiloHay -= hay;
            }
            if (i % 3 == 0) {
                double cover = kiloWeight * (1.0 / 3.0);
                kiloCover -= cover;
            }
            if (Math.round(kiloHay) <= 0.00 || Math.round(kiloCover) <= 0.00 || Math.round(kiloFood) <= 0.00) {
                enough = false;
                break;
            }
        }
        if (enough) {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", kiloFood, kiloHay, kiloCover);
        } else {
            System.out.println("Merry must go to the pet store!");
        }
    }
}
