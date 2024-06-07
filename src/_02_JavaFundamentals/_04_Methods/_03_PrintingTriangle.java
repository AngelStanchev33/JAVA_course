package _02_JavaFundamentals._04_Methods;

import java.util.Scanner;

public class _03_PrintingTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= number; i++) {
            printLine(1, i);
        }
        for (int i = number - 1; i >= 1; i--) {
            printLine(1, i);
        }
    }

    private static void printLine(int start, int finish) {
        for (int j = start; j <= finish; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
