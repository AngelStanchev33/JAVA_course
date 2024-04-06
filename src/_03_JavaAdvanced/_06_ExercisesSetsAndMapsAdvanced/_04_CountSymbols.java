package _03_JavaAdvanced._06_ExercisesSetsAndMapsAdvanced;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _04_CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Character, Integer> alphaMap = new TreeMap<>();

        String line = scanner.nextLine().trim();

        for (char symbol : line.toCharArray()) {
            alphaMap.putIfAbsent(symbol, 0);
            Integer value = alphaMap.get(symbol);
            alphaMap.put(symbol, value + 1);
        }
        for (Map.Entry<Character, Integer> entry : alphaMap.entrySet()) {
            System.out.printf("%s: %d time/s%n",entry.getKey(),entry.getValue());
        }

    }
}
