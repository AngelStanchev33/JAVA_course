package _01_BasicJava.forCycle;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int evenNumbersum =0;
        int oddNumbersum = 0;

        for (int i = 1; i <= n ; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            if (i % 2 ==0){
                oddNumbersum += currentNumber;}
            else {
                evenNumbersum += currentNumber;
            }
        }

        if (oddNumbersum == evenNumbersum){
            System.out.println(" Yes, sum = " +oddNumbersum);
        }
        else {
            int diff = Math.abs(oddNumbersum - evenNumbersum);
            System.out.println(" No, diff = " + diff);
        }
    }
}