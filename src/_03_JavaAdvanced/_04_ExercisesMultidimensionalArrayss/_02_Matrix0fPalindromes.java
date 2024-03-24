package _03_JavaAdvanced._04_ExercisesMultidimensionalArrayss;

import java.util.Scanner;

public class _02_Matrix0fPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] split = scanner.nextLine().split("\\s+");
        int r = Integer.parseInt(split[0]);
        int c = Integer.parseInt(split[1]);

        String[][] matrix = new String[r][c];

        fillTheMatrix(matrix);
        printMatrix(matrix);

    }

    private static void printMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    private static void fillTheMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                String outsideSymbol = String.valueOf((char) ('a' + row));
                String midSymbol = String.valueOf((char) ('a' + row + col));
                matrix[row][col] = outsideSymbol + midSymbol + outsideSymbol;

            }
        }
    }
}



