package _03_JavaAdvanced._04_ExercisesMultidimensionalArrayss;

import java.util.Arrays;
import java.util.Scanner;

public class _04_MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int row = input[0];
        int col = input[1];

        int[][] matrix = new int[row][col];

        int sum = 0;
        int topSum = Integer.MIN_VALUE;
        int minRow = 0;
        int maxRow = 0;

        fillTheMatrix(row, matrix, scanner);

        for (int i = 0; i < matrix.length - 2; i++) {
            for (int j = 0; j < matrix[i].length - 2; j++) {
                sum = 0;
                
                int currentEl = matrix[i][j];
                int nextEl = matrix[i][j + 1];
                int nextNextEl = matrix[i][j + 2];
                int belowCur = matrix[i + 1][j];
                int belowNext = matrix[i + 1][j + 1];
                int belowNextNext = matrix[i + 1][j + 2];
                int belowBelowCur = matrix[i + 2][j];
                int belowBelowNext = matrix[i + 2][j + 1];
                int belowBelowNextNext = matrix[i + 2][j + 2];

                sum += currentEl + nextEl + nextNextEl + belowCur + belowNext + belowNextNext + belowBelowCur + belowBelowNext + belowBelowNextNext;
                if (sum > topSum) {
                    topSum = sum;
                    maxRow = currentEl;
                    maxRow = belowBelowNextNext;
                }
            }
        }

    }

    private static void fillTheMatrix(int row, int[][] matrix, Scanner scanner) {
        for (int i = 0; i < row; i++) {
            matrix[i] = readArray(scanner);
        }
    }

    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
