package _02_JavaFundamentals._02_ArraysExercise;

import java.util.Scanner;

public class _03_ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] arrayOne = new String[n];
        String[] arrayTwo = new String[n];

        for (int i = 0; i <n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String firstEl = input[0];
            String secondEL = input[1];

            if (i % 2 == 0){
                arrayTwo[i] = firstEl;
                arrayTwo [i] = secondEL;
            }
            else {
                arrayOne[i] = secondEL;
                arrayOne [i] = secondEL;
            }
        }
        System.out.println(String.join(" ", arrayOne));
        System.out.println(String.join(" ", arrayTwo));;
    }
}
