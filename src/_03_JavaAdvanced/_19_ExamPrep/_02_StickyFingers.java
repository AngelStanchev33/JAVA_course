package _03_JavaAdvanced._19_ExamPrep;

import java.util.Scanner;

public class _02_StickyFingers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int pocket = 0;

        String[] input = scanner.nextLine().split(",");

        char[][] matrix = fillMatrix(scanner, n);

        for (String command : input) {

            int[] dillingerCords = getCords(matrix);
            assert dillingerCords != null;
            int oldRow = dillingerCords[0];
            int oldCol = dillingerCords[1];

            int[] move = direction(command, dillingerCords[0], dillingerCords[1]);
            if (inBounds(move[0], move[1], matrix)) {
                int row = move[0];
                int col = move[1];
                char symbol = matrix[row][col];

                switch (symbol) {
                    case '$' -> {
                        int rob = row * col;
                        pocket += rob;
                        System.out.printf("You successfully stole %d$.\n", rob);
                    }
                    case 'P' -> {
                        System.out.printf("You got caught with %d$, and you are going to jail.\n", pocket);
                        matrix[oldRow][oldCol] = '+';
                        matrix[row][col] = '#';
                        printMatrix(matrix);
                        return;
                    }
                }
                matrix[oldRow][oldCol] = '+';
                matrix[row][col] = 'D';
            } else {
                System.out.println("You cannot leave the town, there is police outside!");
            }
        }
        System.out.printf("Your last theft has finished successfully with %d$ in your pocket.\n", pocket);
        printMatrix(matrix);
    }

    private static void printMatrix(char[][] matrix) {
        for (char[] row : matrix) {
            for (char element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }


    private static boolean inBounds(int row, int col, char[][] matrix) {
        return row >= 0 && row < matrix.length && col >= 0 && col < matrix[0].length;
    }


    private static int[] direction(String command, int dillingerRow, int dillingerCol) {
        switch (command) {
            case "up" -> dillingerRow--;
            case "down" -> dillingerRow++;
            case "left" -> dillingerCol--;
            case "right" -> dillingerCol++;
        }

        return new int[]{dillingerRow, dillingerCol};
    }

    private static int[] getCords(char[][] matrix) {

        int[] cords = new int[2];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 'D') {
                    cords[0] = row;
                    cords[1] = col;
                    return cords;
                }
            }
        }

        return null;
    }

    private static char[][] fillMatrix(Scanner scanner, int n) {
        char[][] matrix = new char[n][n];

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] symbols = line.split(" "); // Използваме интервал за разделяне на символите
            for (int j = 0; j < n; j++) {
                matrix[i][j] = symbols[j].charAt(0);
            }
        }

        return matrix;
    }
}
