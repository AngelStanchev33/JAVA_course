package _02_JavaFundamentals._02_ArraysExercise;

import java.util.Scanner;

public class _04_ArrayRotation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[]array = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String temp = array[0];
            for (int j = 0; j <array.length -1 ; j++) {
                array[j] = array [j + 1];
            }
            array[array.length -1] = temp;
        }
    System.out.println(String.join(" ",array));
    }
}
