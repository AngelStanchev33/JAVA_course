package _03_JavaAdvanced._13_ExercisesGenerics._03_GenericCountMethodStrings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> valuesToCompareLIst = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine().trim());

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine().trim();

            valuesToCompareLIst.add(line);
        }
        String lastValue = scanner.nextLine();

        System.out.println(CountMethod.number(valuesToCompareLIst,lastValue));
    }
}
