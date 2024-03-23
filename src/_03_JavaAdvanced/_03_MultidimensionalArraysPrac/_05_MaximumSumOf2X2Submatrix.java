package _03_JavaAdvanced._03_MultidimensionalArraysPrac;

import java.util.Scanner;

public class _05_MaximumSumOf2X2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Object[] result = readMatrix(scanner);
        String[][] matrix = (String[][]) result[0];

        int rows = (int) result[1];
        int cols = (int) result[2];

        String[] lastRow = matrix[matrix.length - 1];
        int minValue = Integer.MIN_VALUE;

        int sum = 0;
        int topSum = Integer.MIN_VALUE;
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;

        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                int currentEl = Integer.parseInt(matrix[i][j]);
                int nextEl = Integer.parseInt(matrix[i][j+1]);
                int belowEl = Integer.parseInt(matrix[i+1][j]);
                int belowElNext = Integer.parseInt(matrix[i+1][j+1]);

                sum = currentEl + nextEl + belowEl + belowElNext;

                if (sum > topSum){
                    topSum = sum;
                    one = currentEl;
                    two = nextEl;
                    three =belowEl;
                    four = belowElNext;
                }
            }
        }

        System.out.println(one + " " + two);
        System.out.println(three + " " + four);
        System.out.println(topSum);

    }

    private static Object[] readMatrix(Scanner scanner) {
        String[] matrixSize = readArray(scanner);

        int rows = Integer.parseInt(matrixSize[0]);
        int cols = Integer.parseInt(matrixSize[1]);

        String[][] matrix = new String[rows][cols];

        for (int i = 0; i < rows; i++) {
            matrix[i] = readArray(scanner);
        }

        return new Object[]{matrix, rows, cols};
    }

    private static String[] readArray(Scanner scanner) {
        return scanner.nextLine().trim().split(", ");
    }

}

