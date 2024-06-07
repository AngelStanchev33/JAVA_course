package _02_JavaFundamentals._17_ExerciseAssociativeArrays;

import java.util.*;

public class _01_CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        char[] chars = text.toCharArray();

        Map<Character, Integer> textMap = new LinkedHashMap<>();

        for (char current : chars) {

            if (String.valueOf(current).equals(" ")) {
                continue;
            }

            if (!textMap.containsKey(current)) {
                textMap.put(current, 0);
            }

            textMap.put(current, textMap.get(current) + 1);
        }

        for (Map.Entry<Character, Integer> entry : textMap.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());

        }
    }
}
