package _02_JavaFundamentals._16_AssociativeArrays;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _01_CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numberArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToDouble(Integer::parseInt)
                .toArray();

        TreeMap<Double, Integer> countMap = new TreeMap<>();

        for (double num : numberArr) {

            if (!countMap.containsKey(num)) {
                countMap.put(num, 0);
            }
            countMap.put(num, countMap.get(num) + 1);
        }
        for (Map.Entry<Double, Integer> entry : countMap.entrySet()) {
            System.out.printf("%.0f -> %d%n",entry.getKey(),entry.getValue());

        }


    }
}
