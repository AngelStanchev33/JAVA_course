package _02_JavaFundamentals._04_Methods;

import java.util.Scanner;

public class _06_CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());

        double area = rectangleArea(width, length);
        System.out.println(area);
    }

    private static double rectangleArea(double width, double length) {
        return width * length;
    }
}
