package _03_JavaAdvanced._04_ExercisesMultidimensionalArrayss;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _08_TheHeiganDance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = 15;
        int cols = 15;

        List<List<Integer>> matrix = new ArrayList<>();

        fillMatrix(matrix, rows, cols);

        int midRows = matrix.size() / 2;
        int midCols = cols / 2;

        int playerHP = 18500;
        int heiganHp = 3000000;

        while (true) {
            if (playerHP <= 0 || heiganHp <= 0) {
                break;
            }
            int playerDmg = Integer.parseInt(scanner.nextLine());

            heiganHp -= playerDmg;

            String[] spells = scanner.nextLine().split("\\s+");
            String nameOfSpell = spells[0];
            int spellRow = Integer.parseInt(spells[1]);
            int spellCol = Integer.parseInt(spells[2]);

            switch (nameOfSpell) {
                case "Eruption":
                    if (isMidValid(spellRow, spellCol, rows, cols)) {
                        matrix.get(spellRow).set(spellCol, 0);
                    }
                    if (isLefValid(spellRow, spellCol, rows, cols)) {
                        matrix.get(spellRow).set(spellCol - 1,0);
                    }
                    if (isUpperLeftValid(spellRow, spellCol, rows, cols)) {
                         matrix.get(spellRow - 1).set(spellCol - 1,0);
                    }
                    if (isUpperValid(spellRow, spellCol, rows, cols)) {
                        matrix.get(spellRow - 1).set(spellCol,0);
                    }
                    if (isUpperRightValid(spellRow, spellCol, rows, cols)) {
                        matrix.get(spellRow - 1).set(spellCol + 1,0);
                    }
                    if (isRightValid(spellRow, spellCol, rows, cols)) {
                        matrix.get(spellRow).set(spellCol + 1,0);
                    }
                    if (isDownRightValid(spellRow, spellCol, rows, cols)) {
                        matrix.get(spellRow + 1).set(spellCol + 1,0);
                    }
                    if (isDownCenterValid(spellRow, spellCol, rows, cols)) {
                        matrix.get(spellRow + 1).set(spellCol,0);
                    }
                    if (isDownLeftValid(spellRow, spellCol, rows, cols)) {
                        matrix.get(spellRow + 1).set(spellCol - 1,0);

                    }
                    break;

                case "Plague":
                    break;

            }
        }


    }

    private static boolean isDownLeftValid(int spellRow, int spellCol, int rows, int cols) {
        return spellRow + 1 >= 0 && spellRow + 1 < rows && spellCol - 1 >= 0 && spellCol - 1 < cols;
    }

    private static boolean isDownCenterValid(int spellRow, int spellCol, int rows, int cols) {
        return spellRow + 1 >= 0 && spellRow + 1 < rows && spellCol >= 0 && spellCol < cols;
    }

    private static boolean isDownRightValid(int spellRow, int spellCol, int rows, int cols) {
        return spellRow + 1 >= 0 && spellRow + 1 < rows && spellCol + 1 >= 0 && spellCol + 1 < cols;
    }

    private static boolean isRightValid(int spellRow, int spellCol, int rows, int cols) {
        return spellRow >= 0 && spellRow < rows && spellCol + 1 >= 0 && spellCol + 1 < cols;
    }

    private static boolean isUpperRightValid(int spellRow, int spellCol, int rows, int cols) {
        return spellRow - 1 >= 0 && spellRow - 1 < rows && spellCol + 1 >= 0 && spellCol + 1 < cols;
    }

    private static boolean isUpperValid(int spellRow, int spellCol, int rows, int cols) {
        return spellRow - 1 >= 0 && spellRow - 1 < rows && spellCol >= 0 && spellCol < cols;
    }

    private static boolean isUpperLeftValid(int spellRow, int spellCol, int rows, int cols) {
        return spellRow - 1 >= 0 && spellRow - 1 < rows && spellCol - 1 >= 0 && spellCol - 1 < cols;
    }

    private static boolean isLefValid(int spellRow, int spellCol, int rows, int cols) {
        return spellRow >= 0 && spellRow < rows && spellCol - 1 >= 0 && spellCol - 1 < cols;
    }


    private static boolean isMidValid(int row, int col, int rows, int cols) {
        return row >= 0 && row < rows && col >= 0 && col < cols;
    }

    private static void fillMatrix(List<List<Integer>> matrix, int rows, int cols) {
        int count = 1;
        for (int row = 0; row < rows; row++) {
            ArrayList<Integer> numbers = new ArrayList<>();
            for (int col = 0; col < cols; col++) {
                numbers.add(count++);
            }
            matrix.add(numbers);
        }
    }
}

