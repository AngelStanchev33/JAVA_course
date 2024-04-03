package _03_JavaAdvanced._05_SetsAndMapsAdvanced;

import java.util.*;

public class _04_CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = Arrays.stream(scanner.nextLine().trim().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();

        Map<Double, Integer> numKeyMap = new LinkedHashMap<>();

        for (double currentNumber : numbers) {

            if (!numKeyMap.containsKey(currentNumber)) {
                numKeyMap.put(currentNumber, 1);
            } else {
                numKeyMap.put(currentNumber, numKeyMap.get(currentNumber) + 1);
            }
        }

        for (Double key : numKeyMap.keySet()) {
            System.out.printf("%.1f -> %d%n",key,numKeyMap.get(key));
        }
    }
}
