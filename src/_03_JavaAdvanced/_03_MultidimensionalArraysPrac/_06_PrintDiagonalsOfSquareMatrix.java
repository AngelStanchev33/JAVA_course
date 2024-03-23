package _03_JavaAdvanced._03_MultidimensionalArraysPrac;

import java.util.Scanner;

public class _06_PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] matrix = readMatrix(scanner);

        StringBuilder sbOne = new StringBuilder();
        StringBuilder sbtWO = new StringBuilder();


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                String curEl = matrix[j][i];
                i++;
                sbOne.append(curEl).append(" ");

            }
        }
        for (int i = matrix.length-1; i >=0; i--) {
            for (int j = 0; j < matrix.length; j++) {
                String currentEl = matrix[i][j];
                i--;
                sbtWO.append(currentEl).append(" ");

            }
        }

        System.out.println(sbOne);
        System.out.println(sbtWO);
    }

    private static String[][] readMatrix(Scanner scanner) {
        int matrixSize = Integer.parseInt(scanner.nextLine().trim());

        String[][] matrix = new String[matrixSize][];

        for (int i = 0; i < matrixSize; i++) {
            matrix[i] = readArray(scanner);
        }
        return matrix;
    }

    private static String[] readArray(Scanner scanner) {
        return scanner.nextLine().split("\\s+");

    }
}