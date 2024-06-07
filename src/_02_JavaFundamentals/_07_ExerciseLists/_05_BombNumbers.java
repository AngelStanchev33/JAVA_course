package _02_JavaFundamentals._07_ExerciseLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _05_BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] parts = scanner.nextLine().split(" ");
        List<Integer> numbers = new ArrayList<>();
        for (String part : parts) {
            int current = Integer.parseInt(part);
            numbers.add(current);
        }

        String specialNumbers = scanner.nextLine();
        String[] specialTokens = specialNumbers.split(" ");
        int specialNumber = Integer.parseInt(specialTokens[0]);
        int power = Integer.parseInt(specialTokens[1]);


        while (numbers.contains(specialNumber)){
            int index = numbers.indexOf(specialNumber);

            int leftBound = Math.max(index - power,0);
            int rightBound = Math.min(index + power,numbers.size()-1);
            for (int i = rightBound; i >= leftBound ; i --) {
                numbers.remove(i);
            }
        }

        int sum = 0;
        for (Integer number : numbers) {
            sum += number;

            System.out.print(sum);

        }
    }
}



