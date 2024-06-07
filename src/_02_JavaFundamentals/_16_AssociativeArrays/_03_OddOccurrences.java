package _02_JavaFundamentals._16_AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _03_OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().trim().split(" ");

        LinkedHashMap<String, Integer> words = new LinkedHashMap<>();

        for (String s : input) {
            s = s.toLowerCase();

            if (!words.containsKey(s)) {
                words.put(s, 0);
            }
            words.put(s, words.get(s) + 1);
        }

        for (Map.Entry<String, Integer> value : words.entrySet()) {
            String key = value.getKey();

            if (value.getValue() % 3 == 0) {
                System.out.printf("%s", String.join(", ", key));

            }
        }
    }
}
