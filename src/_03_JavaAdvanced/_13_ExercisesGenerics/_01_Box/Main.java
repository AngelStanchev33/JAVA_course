package _03_JavaAdvanced._13_ExercisesGenerics._01_Box;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            Box<String> stringBox = new Box<>(scanner.nextLine());


            System.out.println(stringBox.toString());
        }
    }
}
