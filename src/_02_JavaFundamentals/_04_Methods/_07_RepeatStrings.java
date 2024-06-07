package _02_JavaFundamentals._04_Methods;

import java.util.Scanner;

public class _07_RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        String result = repeatString (text,n);
        System.out.println(result);

    }

    private static String repeatString(String text, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += text;

        }
        return result;
    }



    }

