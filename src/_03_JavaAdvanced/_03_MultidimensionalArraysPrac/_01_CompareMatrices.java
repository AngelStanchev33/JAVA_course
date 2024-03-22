package _03_JavaAdvanced._03_MultidimensionalArraysPrac;

import java.util.Arrays;
import java.util.Scanner;

public class _01_CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] firstMatrix = readMatrix(scanner);
        int[][] secondMatrix = readMatrix(scanner);

        boolean areEqual = firstMatrix.length == secondMatrix.length;

        if (areEqual) {
            for (int matrixRow = 0; matrixRow < firstMatrix.length; matrixRow++) {
                int[] firstArr = firstMatrix[matrixRow];
                int[] secondArr = secondMatrix[matrixRow];

                areEqual = firstArr.length == secondArr.length;

                if (areEqual) {
                    for (int i = 0; i < firstArr.length; i++) {
                        if (firstArr[i] != secondArr[i]) {
                            areEqual = false;
                        }
                    }
                }
            }
        }
        if (areEqual) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }

    private static int[][] readMatrix(Scanner scanner) {
        int[] matrixSize = readIntArray(scanner);

        int rows = matrixSize[0];
        int cols = matrixSize[1];

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            matrix[i] = readIntArray(scanner);

        }
        return matrix;
    }

    private static int[] readIntArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
