package _03_JavaAdvanced._16_ExamPrep;

import java.util.Scanner;

public class _92_PawnWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] matrix = new char[8][8];
        fillMatrix(scanner, matrix);

        int[] whitePawnIndex = findWhitePawn(matrix);
        int[] blackPawnIndex = findBlackPawn(matrix);

        boolean whiteCanMove;
        boolean blackCanMove;

        while (true) {

            if (whitePawnIndex != null) {
                int row = whitePawnIndex[0];
                int col = whitePawnIndex[1];

                whiteCanMove = whitePawnMoves(matrix, row, col);

                if (whiteCanMove) {
                    matrix[row][col] = '-';
                    matrix[row - 1][col] = 'w';

                    whitePawnIndex[0] = row - 1;
                } else {
                    break;
                }
            }

            if (blackPawnIndex != null) {
                int row = blackPawnIndex[0];
                int col = blackPawnIndex[1];

                blackCanMove = blackPawnMoves(matrix, row, col);

                if (blackCanMove) {
                    matrix[row][col] = '-';
                    matrix[row + 1][col] = 'b';

                    blackPawnIndex[0] = row + 1;
                } else {
                    break;
                }
            }
        }
    }

    private static boolean isValidIndex(int row, int col, char[][] matrix) {
        return row >= 0 && row < matrix.length && col >= 0 && col < matrix[0].length;
    }

    private static boolean blackPawnMoves(char[][] matrix, int row, int col) {
        int nextRow = row;
        if (isValidIndex(row + 1, col, matrix)) {
            nextRow = row + 1;
        }
        int leftCol = col;
        if (isValidIndex(row, col - 1, matrix)) {
            leftCol = col - 1;
        }
        int rightCol = col;
        if (isValidIndex(row, col + 1, matrix)) {
            rightCol = col + 1;
        }


        if (matrix[nextRow][leftCol] == 'w') {
            char columnChar = (char) ('a' + leftCol);
            System.out.printf("Game over! Black capture on %s%d.", columnChar, 8 - nextRow);
            return false;
        }
        if (matrix[nextRow][rightCol] == 'w') {
            char columnChar = (char) ('a' + rightCol);
            System.out.printf("Game over! Black capture on %s%d.", columnChar, 8 - nextRow);
            return false;
        }
        if (nextRow == matrix.length - 1) {
            char columnChar = (char) ('a' + col);
            System.out.printf("Game over! Black pawn is promoted to a queen at %s%d.", columnChar, 8 - nextRow);
            return false;
        }

        return true;
    }

    private static boolean whitePawnMoves(char[][] matrix, int row, int col) {
        int nextRow = row;
        if (isValidIndex(row - 1, col, matrix)) {
            nextRow = row - 1;
        }
        int leftCol = col;
        if (isValidIndex(row, col - 1, matrix)) {
            leftCol = col - 1;
        }
        int rightCol = col;
        if (isValidIndex(row, col + 1, matrix)) {
            rightCol = col + 1;
        }


        if (matrix[nextRow][leftCol] == 'b') {
            char columnChar = (char) ('a' + leftCol);
            System.out.printf("Game over! White capture on %s%d.", columnChar, 8 - nextRow);
            return false;
        }
        if (matrix[nextRow][rightCol] == 'b') {
            char columnChar = (char) ('a' + rightCol);
            System.out.printf("Game over! White capture on %s%d.", columnChar, 8 - nextRow);
            return false;
        }
        if (nextRow == 0) {
            char columnChar = (char) ('a' + col);
            System.out.printf("Game over! White pawn is promoted to a queen at %s%d.", columnChar, 8 - nextRow);
            return false;
        }

        return true;

    }

    private static int[] findWhitePawn(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 'w') {
                    return new int[]{row, col};
                }
            }
        }
        return null;
    }

    private static int[] findBlackPawn(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 'b') {
                    return new int[]{row, col};
                }
            }
        }
        return null;
    }


    private static void fillMatrix(Scanner scanner, char[][] matrix) {
        for (int row = 0; row < 8; row++) {
            var line = scanner.nextLine();
            for (int col = 0; col < 8; col++) {
                matrix[row][col] = line.charAt(col);

            }
        }
    }
}
