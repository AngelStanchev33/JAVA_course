package _03_JavaAdvanced._03_MultidimensionalArraysPrac;

import java.util.Scanner;

public class _03_IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine().trim());
        int cols = Integer.parseInt(scanner.nextLine().trim());

        String[][] firstMatrix = readMatrix(scanner, rows, cols);
        String[][] secondMatrix = readMatrix(scanner, rows, cols);

        for (int i = 0; i < firstMatrix.length; i++) {
            String[] firstMatrixRow = firstMatrix[i];
            String[] secondMatrixRow = secondMatrix[i];

            for (int j = 0; j < firstMatrixRow.length; j++) {
                String el = firstMatrixRow[j];
                String el2 = secondMatrixRow[j];

                if (!el.equals(el2)) {
                    firstMatrixRow[j] = "*";
                }
            }
        }
        printMatrix(firstMatrix);
    }

    private static void printMatrix(String[][] firstMatrix) {
        for (String[] row : firstMatrix) {
            for (String element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    private static String[][] readMatrix(Scanner scanner, int rows, int cols) {

        String[][] matrix = new String[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] arr = scanner.nextLine().split("\\s+");
            matrix[i] = arr;
        }
        return matrix;
    }
}
