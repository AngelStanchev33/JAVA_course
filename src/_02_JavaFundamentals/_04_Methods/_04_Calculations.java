package _02_JavaFundamentals._04_Methods;

import java.util.Scanner;

public class _04_Calculations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String command = sc.nextLine();
        int a  = Integer.parseInt(sc.nextLine());
        int b =  Integer.parseInt(sc.nextLine());

        switch (command){
            case "add":
                add(a,b);
                break;
            case "multiply":
                multiply(a,b);
                break;
            case "subtract":
                subtract(a,b);
                break;
            case "divide":
                divide(a,b);
        }
    }

    private static void divide(int a, int b) {
        System.out.println(a / b);
    }
    private static void subtract(int a, int b){
        System.out.println(Math.abs(a - b));
    }
    private static void multiply(int a, int b){
        System.out.println(a * b);
    }
    private static void add(int a, int b){
        System.out.println(a + b);
    }
}

