package _01_BasicJava.forCycle;

import java.util.Scanner;

public class chetnaNechentaSuma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int evenNumber = 0;
        int oddNumber = 0;
        int evenNumbersum =0;
        int oddNumbersum = 0;

        for (int i = 1; i <= n ; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            if (currentNumber % 2 ==0){
                currentNumber = evenNumber;
                evenNumbersum += evenNumber;
            }
        }

        for (int i = 1; i < n ; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            if (currentNumber % 2 ==1) {
                currentNumber = oddNumber;
                oddNumbersum += oddNumber;
            }

        }

        if (oddNumbersum == evenNumbersum){
            System.out.println(" Yes, sum = " +oddNumbersum);
        }
        else {
            int diff = Math.abs(oddNumbersum - evenNumbersum);
            System.out.println("No DIff" + diff);
        }
    }
}
