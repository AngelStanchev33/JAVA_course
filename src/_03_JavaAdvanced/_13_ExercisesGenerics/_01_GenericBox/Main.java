package _03_JavaAdvanced._13_ExercisesGenerics._01_GenericBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine().trim());

        for (int i = 0; i < n; i++) {

            Box<String> line = new Box<>(scanner.nextLine().trim());
            System.out.println(line.toString());

        }
    }
}
