package _03_JavaAdvanced._04_ExercisesMultidimensionalArrayss;

import java.util.Scanner;

public class _01_FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] split = scanner.nextLine().split(", ");
        int size = Integer.parseInt(split[0]);
        String type = split[1];

        int[][] matrix = new int[size][size];

        switch (type) {
            case "A":
                fillPatternA(matrix);
                break;
            case "B":
                fillPatternB(matrix);
                break;
        }
        printMatrix(matrix);
    }

    private static void fillPatternB(int[][] matrix) {
        int count = 1;

        for (int i = 0; i < matrix.length; i++) {
            if ((i + 1) % 2 != 0) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[j][i] = count; // това обърща пълненто на колони да става отгоре надолу
                    count++;
                }
            } else {
                for (int j = matrix[i].length - 1; j >= 0; j--) {
                    matrix[j][i] = count;
                    count++;

                }
            }
        }
    }


    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void fillPatternA(int[][] matrix) {
        int count = 1;
        //пълнене по колони
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[j][i] = count;
                count++;

            }
        }
    }
}
