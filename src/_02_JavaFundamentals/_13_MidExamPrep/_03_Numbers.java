package _02_JavaFundamentals._13_MidExamPrep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class _03_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> sequenceOfNumbers = new ArrayList<>();
        String[] input = scanner.nextLine().trim().split(" ");
        for (String s : input) {
            int number = Integer.parseInt(s);
            sequenceOfNumbers.add(number);
        }

        double sumOfNumbers = 0;
        double averageValue = 0;

        int count = 0;

        for (Integer sequenceOfNumber : sequenceOfNumbers) {
            sumOfNumbers += sequenceOfNumber;
        }

        averageValue = sumOfNumbers / sequenceOfNumbers.size();

        List<Integer> printList = new ArrayList<>();
        for (Integer currentNumber : sequenceOfNumbers) {
            if (currentNumber > averageValue) {
                printList.add(currentNumber);
            }
        }
        printList.sort(Collections.reverseOrder());

        if (printList.isEmpty()) {
            System.out.println("No");
        } else {
            List<String> printListFinal = new ArrayList<>();
            for (int s : printList) {
                count++;
                if (count >5){
                    break;
                }
                String current = String.valueOf(s);
                printListFinal.add(current);
            }
            String joined = String.join(" ", printListFinal);
            System.out.println(joined);
        }
    }
}



