package _03_JavaAdvanced._06_ExercisesSetsAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class _01_UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> wordSet = new LinkedHashSet<>();

        int n = Integer.parseInt(scanner.nextLine().trim());

        for (int i = 0; i < n; i++) {

            String line = scanner.nextLine().trim();

            wordSet.add(line);

        }
        for (String word : wordSet) {
            System.out.println(word);
        }
    }
}
