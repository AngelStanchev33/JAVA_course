package _02_JavaFundamentals._04_Methods;

import java.util.Scanner;

public class _01_SignOfInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());
        positiveOrNegative(number);
    }

    private static void positiveOrNegative(int number) {
        if (number > 0){
            System.out.printf("The number %d is positive.",number);
        }
        if (number <0){
            System.out.printf("The number %d is negative.",number);
        }
        if (number ==0){
            System.out.printf("The number %d is zero.",number);
        }
    }
}
