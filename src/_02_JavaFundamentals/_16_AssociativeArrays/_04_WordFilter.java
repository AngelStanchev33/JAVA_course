package _02_JavaFundamentals._16_AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _04_WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        LinkedHashMap<String, Integer> words = new LinkedHashMap<>();

        for (String word : input) {
            int wordLength = word.length();
            if (wordLength % 2 == 0) {
                words.put(word, wordLength);
            }
        }

        for (Map.Entry<String, Integer> word : words.entrySet()) {
            String key = word.getKey();
            System.out.println(key);
        }


    }
}
