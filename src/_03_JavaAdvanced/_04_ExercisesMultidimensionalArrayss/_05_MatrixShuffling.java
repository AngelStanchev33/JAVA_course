package _03_JavaAdvanced._04_ExercisesMultidimensionalArrayss;

import java.util.Arrays;
import java.util.Scanner;

public class _05_MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] matrix = getMatrix(scanner);

        String input = scanner.nextLine();
        while (!"END".equals(input)) {
            String[] commands = input.split("\\s+");

            if (commands.length == 5) {
                int row = Integer.parseInt(commands[1]);
                int col = Integer.parseInt(commands[2]);
                int row1 = Integer.parseInt(commands[3]);
                int col1 = Integer.parseInt(commands[4]);

                if (isInBounds(row, col, row1, col1, matrix.length, matrix[0].length)) {

                    String temp = matrix[row][col];
                    matrix[row][col] = matrix[row1][col1];
                    matrix[row1][col1] = temp;

                    printMatrix(matrix);
                } else {
                    System.out.println("Invalid input!");
                }
            } else {
                System.out.println("Invalid input!");
            }
            input = scanner.nextLine();
        }
    }


    private static void printMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean isInBounds(int row, int col, int row1, int col1, int numRow, int numCol) {
        return row >= 0 && row < numRow &&
                col >= 0 && col < numCol &&
                row1 >= 0 && row1 < numRow &&
                col1 >= 0 && col1 < numCol;

    }

    private static String[][] getMatrix(Scanner scanner) {
        int[] tokens = getTokens(scanner);

        int row = tokens[0];
        int col = tokens[1];

        String[][] matrix = new String[row][col];

        for (int i = 0; i < row; i++) {
            matrix[i] = readArray(scanner);
        }
        return matrix;
    }

    private static String[] readArray(Scanner scanner) {
        return scanner.nextLine().split("\\s+");
    }

    private static int[] getTokens(Scanner scanner) {
        int[] tokens = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        return tokens;
    }
}
