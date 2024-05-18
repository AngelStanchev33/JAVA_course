package _03_JavaAdvanced._20_ExamPrep;

import java.util.Scanner;

public class _02_Armory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        char[][] matrix = fillTheMatrix(scanner, n);

        int moneySpent = 0;

        while (true) {

            int[] armyOfficer = findCharacter(matrix, 'A');
            assert armyOfficer != null;
            int armyOfficerRow = armyOfficer[0];
            int armyOfficerCol = armyOfficer[1];

            String line = scanner.nextLine();

            int[] updatedIndexes = updateTheIndexes(armyOfficerRow, armyOfficerCol, line);

            if (areValid(updatedIndexes[0], updatedIndexes[1], matrix)) {
                int armyOfficerNewRow = updatedIndexes[0];
                int armyOfficerNewCol = updatedIndexes[1];

                char symbol = matrix[armyOfficerNewRow][armyOfficerNewCol];

                if (Character.isDigit(symbol)) {
                    int price = Character.getNumericValue(symbol);
                    moneySpent += price;
                    matrix[armyOfficerRow][armyOfficerCol] = '-';
                    matrix[armyOfficerNewRow][armyOfficerNewCol] = 'A';

                    if (sumIsReached(moneySpent)){

                        System.out.println("Very nice swords, I will come back for more!");
                        break;
                    }

                } else if (Character.isLetter(symbol)) {
                    matrix[armyOfficerRow][armyOfficerCol] = '-';
                    matrix[armyOfficerNewRow][armyOfficerNewCol] = '-';
                    int[] mirror = findCharacter(matrix, 'M');
                    assert mirror != null;
                    matrix[mirror[0]][mirror[1]] = 'A';
                } else {
                    matrix[armyOfficerRow][armyOfficerCol] = '-';
                    matrix[armyOfficerNewRow][armyOfficerNewCol] = 'A';
                }
            }else {
                matrix[armyOfficerRow][armyOfficerCol] = '-';

                System.out.println("I do not need more swords!");
                break;
            }
        }

        System.out.printf("The king paid %d gold coins.%n",moneySpent);

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


    private static boolean sumIsReached(int moneySpent) {
        return moneySpent >= 65;
    }

    private static boolean areValid(int row, int col, char[][] matrix) {
        return row >= 0 && row < matrix.length && col >= 0 && col < matrix[0].length;
    }

    private static int[] updateTheIndexes(int armyOfficerRow, int armyOfficerCol, String line) {
        switch (line) {
            case "up" -> armyOfficerRow--;
            case "down" -> armyOfficerRow++;
            case "left" -> armyOfficerCol--;
            case "right" -> armyOfficerCol++;
        }
        return new int[]{armyOfficerRow, armyOfficerCol};
    }

    private static char[][] fillTheMatrix(Scanner scanner, int n) {
        char[][] matrix = new char[n][n];

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < n; j++) {
                matrix[i][j] = line.charAt(j);
            }
        }

        return matrix;
    }

    private static int[] findCharacter(char[][] matrix, char target) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return null;
    }
}
