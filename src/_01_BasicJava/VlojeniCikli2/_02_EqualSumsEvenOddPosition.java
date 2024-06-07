package _01_BasicJava.VlojeniCikli2;

import java.util.Scanner;

public class _02_EqualSumsEvenOddPosition {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        for (int i = firstNumber; i <=secondNumber ; i++) {
            String currentNum = String.valueOf(i);
            int oddSum = 0;
            int evenSum = 0;
            for (int j = 0; j < currentNum.length(); j++) {
                int currentDigit = Integer.parseInt(String.valueOf(currentNum.charAt(j)));

                if (j % 2 == 0){
                    evenSum+=currentDigit;
                }
                else{
                    oddSum += currentDigit;
                }

                
            }
            if (evenSum == oddSum){
                System.out.print(currentNum + " ");
            }
            
        }
    }
}
