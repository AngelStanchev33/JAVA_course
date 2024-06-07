package _04_JavaOOP._01_WorkingWithAbstraction._02_Traffic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String[] result = changeLight(input);

            print(result);

        }
    }

    private static void print(String[] result) {
        for (int i = 0; i < result.length; i++) {
            String s = result[i];
            if (i < result.length - 1) {
                System.out.print(s + " ");
            } else {
                System.out.print(s);
            }
        }
        System.out.println();
    }
    //priniraha kato maha + " " na posledniq element

    private static String[] changeLight(String[] input) {

        for (int i = 0; i < input.length; i++) {
            String light = input[i];

            switch (light) {
                case "RED" -> input[i] = String.valueOf(Signal.GREEN);
                case "GREEN" -> input[i] = String.valueOf(Signal.YELLOW);
                case "YELLOW" -> input[i] = String.valueOf(Signal.RED);
            }
        }

        return input;
    }
}
