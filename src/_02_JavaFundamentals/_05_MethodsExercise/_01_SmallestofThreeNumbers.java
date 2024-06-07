package _02_JavaFundamentals._05_MethodsExercise;

import java.util.Scanner;

public class _01_SmallestofThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNUm =Integer.parseInt(scanner.nextLine());
        int secondNUm =Integer.parseInt(scanner.nextLine());
        int thirdNUm =Integer.parseInt(scanner.nextLine());

        int smallest = smallestNumber(firstNUm,secondNUm,thirdNUm);

        System.out.print(smallest);
    }

    private static int smallestNumber(int a, int b, int c) {

        int min = a;

        if (b < min){
            min = b;
        }
        if (c < min){
            min = c;
        }
    return min;
    }

}
