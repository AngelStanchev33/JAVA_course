package _03_JavaAdvanced._03_MultidimensionalArraysPrac;

import java.util.Scanner;

public class _04_SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Object[] result = readMatrix(scanner);
        String[][] matrix = (String[][]) result[0];

        int rows = (int) result[1];
        int cols = (int) result[2];

        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            String[] row = matrix[i];

            for (int j = 0; j < row.length; j++) {
                int num = Integer.parseInt(row[j]);
                sum += num;
            }
        }
        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);
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
