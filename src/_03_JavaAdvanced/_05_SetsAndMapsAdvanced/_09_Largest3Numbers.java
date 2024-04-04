package _03_JavaAdvanced._05_SetsAndMapsAdvanced;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _09_Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> sorted = Arrays
                .stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt).sorted((n1, n2) -> n2.compareTo(n1))
                .toList();

        for (int i = 0; i < 3; i++) {
            int current = sorted.get(i);
            System.out.print(current + " ");
        }
    }
}
