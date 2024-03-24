package _03_JavaAdvanced._04_ExercisesMultidimensionalArrayss;

import java.util.Arrays;
import java.util.Scanner;

public class _03_DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine().trim());
        int[][] matrix = new int[n][n];

        readMatrix(n, scanner, matrix);

        int sumOne = 0;
        int sumTwo = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                int curEl = matrix[i][j];
                i++;
                sumOne += curEl;

            }
        }
        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = 0; j < matrix.length; j++) {
                int currentEl = matrix[i][j];
                i--;
                sumTwo += currentEl;

            }
        }
        System.out.println(Math.abs(sumOne - sumTwo));
    }

    private static void readMatrix(int n, Scanner scanner, int[][] matrix) {
        for (int i = 0; i < n; i++) {
            int[] input = Arrays.stream(scanner.nextLine().trim().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[i] = input;
        }
    }
}
