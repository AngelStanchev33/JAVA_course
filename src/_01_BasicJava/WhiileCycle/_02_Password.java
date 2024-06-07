package _01_BasicJava.WhiileCycle;

import java.util.Scanner;

public class _02_Password {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        String password = scanner.nextLine();

        String enteredPassword = scanner.nextLine();
        while (!enteredPassword.equals(password)){
            enteredPassword = scanner.nextLine();
        }

        System.out.println("Welcome" + userName + "!" );


    }
}
