package _03_JavaAdvanced._03_MultidimensionalArraysPrac;

import java.util.Scanner;

public class _02_PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] matrix = readMatrix(scanner);
        String number = scanner.nextLine();

        boolean notFound = true;

        for (int i = 0; i < matrix.length; i++) {
            String[] currentRow = matrix[i];
            for (int j = 0; j < currentRow.length; j++) {
                String currentEl = currentRow[j];

                if (currentEl.equals(number)) {
                    notFound = false;
                    System.out.println(i + " " + j);
                }
            }
        }
        if (notFound){
            System.out.println("not found");
        }
    }

    private static String[][] readMatrix(Scanner scanner) {
        String[] matrixSize = readArray(scanner);

        int rows = Integer.parseInt(matrixSize[0]);
        int cols = Integer.parseInt(matrixSize[1]);

        String[][] matrix = new String[rows][cols];

        for (int i = 0; i < rows; i++) {
            matrix[i] = readArray(scanner);

        }
        return matrix;
    }

    private static String[] readArray(Scanner scanner) {
        return scanner.nextLine().split("\\s+");
    }
}

