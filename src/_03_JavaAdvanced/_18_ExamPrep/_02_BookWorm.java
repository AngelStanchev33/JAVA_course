package _03_JavaAdvanced._18_ExamPrep;

import java.util.Scanner;

public class _02_BookWorm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        char[][] matrix = fillMatrix(scanner, n);

        StringBuilder sb = new StringBuilder();
        sb.append(line);

        String command = scanner.nextLine();
        while (!"end".equals(command)) {

            int[] playerCords = findPlayer(matrix);
            assert playerCords != null;

            int[] move = playerMove(command, playerCords[0], playerCords[1]);

            if (inBounds(move[0], move[1], matrix)) {
                char charAtPosition = matrix[move[0]][move[1]];
                matrix[playerCords[0]][playerCords[1]] = '-';

                if (Character.isLetter(charAtPosition)) {
                    sb.append(charAtPosition);
                }
                matrix[move[0]][move[1]] = 'P';
            } else {
                if (!sb.isEmpty()) {
                    sb.deleteCharAt(sb.length() - 1);
                }

            }

            command = scanner.nextLine();
        }

        System.out.println(sb.toString());
        printMatrix(matrix);

    }

    private static void printMatrix(char[][] matrix) {
        for (char[] row : matrix) {
            for (char element : row) {
                System.out.print(element);
            }
            System.out.println();
        }
    }


    private static boolean inBounds(int row, int col, char[][] matrix) {
        return row >= 0 && row < matrix.length && col >= 0 && col < matrix[0].length;
    }


    private static int[] playerMove(String command, int playerRow, int playerCol) {
        switch (command) {
            case "up" -> playerRow--;
            case "down" -> playerRow++;
            case "left" -> playerCol--;
            case "right" -> playerCol++;
        }
        return new int[]{playerRow, playerCol};
    }


    public static int[] findPlayer(char[][] matrix) {
        int[] playerCords = new int[2];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 'P') {
                    playerCords[0] = row;
                    playerCords[1] = col;
                    return playerCords;
                }
            }
        }

        return null;
    }

    private static char[][] fillMatrix(Scanner scanner, int n) {
        char[][] matrix = new char[n][n];

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < n; j++) {
                matrix[i][j] = line.charAt(j);
            }
        }

        return matrix;
    }
}
