package _03_JavaAdvanced._06_ExercisesSetsAndMapsAdvanced;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class _02_SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> nSet = new LinkedHashSet<>();
        Set<String> mSet = new LinkedHashSet<>();

        int[] line = Arrays.stream(scanner.nextLine().trim().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int n = line[0];
        int m = line[1];


        for (int i = 0; i < n; i++) {
            String num = scanner.nextLine().trim();
            nSet.add(num);

        }

        for (int i = 0; i < m; i++) {
            String num = scanner.nextLine().trim();
            mSet.add(num);
        }

        nSet.retainAll(mSet);

        String result = String.join(" ",nSet);
        System.out.println(result);
    }
}
