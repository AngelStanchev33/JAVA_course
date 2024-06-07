package _02_JavaFundamentals.MidExamExtra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();
        String[] input = scanner.nextLine().split(" ");
        for (String number : input) {
            int current = Integer.parseInt(number);
            numbers.add(current);
        }

        int total = 0;
        double averageNumber = 0;
        for (Integer number : numbers) {
            total += number;
        }
        averageNumber = (total * 1.0) / numbers.size();

        List<Integer> biggerThenAverage = new ArrayList<>();
        for (Integer number : numbers) {
            if (number > averageNumber) {
                biggerThenAverage.add(number);
            }
            Collections.sort(biggerThenAverage);
            Collections.reverse(biggerThenAverage);
        }

        int count = 0;
        List<Integer> topFive = new ArrayList<>();
        if (!biggerThenAverage.isEmpty()) {
            for (Integer number : biggerThenAverage) {
                count++;
                topFive.add(number);
                if (count >= 5) {
                    break;
                }
            }
            for (Integer print : topFive) {
                System.out.print(print + " ");
            }
            System.out.println();

        } else {
            System.out.println("No");
        }
    }
}
