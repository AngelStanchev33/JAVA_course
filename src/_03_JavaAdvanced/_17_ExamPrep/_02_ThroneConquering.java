package _03_JavaAdvanced._17_ExamPrep;

import java.util.Scanner;

public class _02_ThroneConquering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int energy = Integer.parseInt(scanner.nextLine());

        char[][] matrix = fillTheMatrix(scanner);

        while (true) {
            String[] line = scanner.nextLine().split("\\s+");

            matrix[Integer.parseInt(line[1])][Integer.parseInt(line[2])] = 'S';

            int[] oldParisIndex = findParis(matrix);
            int[] parisMoves = getIndex(matrix, line);
            int updatedParisRow = parisMoves[0];
            int updatedParisCol = parisMoves[1];

            energy -= 1;

            if (moveIsValid(updatedParisRow, updatedParisCol, matrix) && !isOnEnemy(updatedParisRow, updatedParisCol, matrix)
                    && !parisFoundHelen(updatedParisRow, updatedParisCol, matrix)) {
                matrix[oldParisIndex[0]][oldParisIndex[1]] = '-';
                matrix[updatedParisRow][updatedParisCol] = 'P';
            }
            if (moveIsValid(updatedParisRow, updatedParisCol, matrix)) {
                if (isOnEnemy(updatedParisRow, updatedParisCol, matrix)) {
                    energy -= 2;
                    if (energy > 0) {
                        matrix[oldParisIndex[0]][oldParisIndex[1]] = '-';
                        matrix[updatedParisRow][updatedParisCol] = 'P';
                    }
                }
            }
            if (moveIsValid(updatedParisRow, updatedParisCol, matrix)) {
                if (parisFoundHelen(updatedParisRow, updatedParisCol, matrix)) {
                    System.out.printf("Paris has successfully abducted Helen! Energy left: %d%n", energy);
                    matrix[oldParisIndex[0]][oldParisIndex[1]] = '-';
                    matrix[updatedParisRow][updatedParisCol] = '-';
                    break;
                }
            }

            if (energy <= 0) {
                System.out.printf("Paris died at %d;%d.%n", updatedParisRow, updatedParisCol);
                matrix[oldParisIndex[0]][oldParisIndex[1]] = '-';
                matrix[updatedParisRow][updatedParisCol] = 'X';
                break;
            }
        }

        printMatrix(matrix);
    }

    private static void printMatrix(char[][] matrix) {
        for (char[] row : matrix) {
            for (char cell : row) {
                System.out.print(cell);
            }
            System.out.println();
        }
    }

    private static boolean parisFoundHelen(int updatedParisRow, int updatedParisCol, char[][] matrix) {
        return matrix[updatedParisRow][updatedParisCol] == 'H';
    }

    private static int[] getIndex(char[][] matrix, String[] line) {

        int[] parisCurrentIndex = findParis(matrix);
        int row = parisCurrentIndex[0];
        int col = parisCurrentIndex[1];

        return switch (line[0]) {
            case "up" -> new int[]{row - 1, col};
            case "down" -> new int[]{row + 1, col};
            case "left" -> new int[]{row, col - 1};
            case "right" -> new int[]{row, col + 1};
            default -> new int[]{row, col};
        };
    }

    private static boolean isOnEnemy(int parisRow, int parisCol, char[][] matrix) {
        return matrix[parisRow][parisCol] == 'S';
    }

    private static boolean moveIsValid(int parisRow, int parisCol, char[][] matrix) {
        return parisRow >= 0 && parisRow < matrix.length &&
                parisCol >= 0 && parisCol < matrix[0].length;

    }

    private static int[] findParis(char[][] matrix) {
        int[] parisIndex = new int[2];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 'P') {
                    parisIndex[0] = row;
                    parisIndex[1] = col;
                    return parisIndex;
                }
            }
        }

        return parisIndex;
    }

    private static char[][] fillTheMatrix(Scanner scanner) {
        int rows = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[rows][];

        for (int row = 0; row < rows; row++) {
            String line = scanner.nextLine();
            matrix[row] = line.toCharArray();
        }

        return matrix;
    }
}
