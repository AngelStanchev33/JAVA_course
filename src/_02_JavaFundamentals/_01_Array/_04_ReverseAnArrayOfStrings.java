package _02_JavaFundamentals._01_Array;

import java.util.Scanner;

public class _04_ReverseAnArrayOfStrings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split(" ");

        for (int i = 0; i < parts.length/2 ; i++) {
            String tmp = parts[i];
            parts[i] = parts[parts.length - i - 1];
            parts[parts.length - i -1] = tmp;
        }
        System.out.println(String.join(" ",parts));
    }
}
