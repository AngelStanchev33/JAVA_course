package _02_JavaFundamentals._18_ExerciseTextProcessing;

import java.math.BigInteger;
import java.util.Scanner;

public class _05_MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger bigNumber  = new BigInteger(scanner.nextLine());
        BigInteger smallNumber = new BigInteger(scanner.nextLine());

        BigInteger result = bigNumber.multiply(smallNumber);
        System.out.print(result);
    }
}
