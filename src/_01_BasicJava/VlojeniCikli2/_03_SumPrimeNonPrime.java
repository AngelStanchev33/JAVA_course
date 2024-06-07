import java.util.Scanner;

public class _03_SumPrimeNonPrime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int primeSum = 0;
        int nonPrimeSum = 0;
        boolean isPrime = false;

        String input = scanner.nextLine();
        while (!input.equalsIgnoreCase("stop")) {
            int num = Integer.parseInt(input);
            if (num < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }

            isPrime = true; // Предполагаме, че числото е просто

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false; // Ако има делител, то числото не е просто
                    break;
                }
            }

            if (isPrime) {
                primeSum += num;
            } else {
                nonPrimeSum += num;
            }

            input = scanner.nextLine();
        }

        System.out.printf("Sum of all prime numbers is: %d%n", primeSum);
        System.out.printf("Sum of all non prime numbers is: %d%n", nonPrimeSum);
    }
}
