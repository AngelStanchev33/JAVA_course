package _03_JavaAdvanced._13_ExercisesGenerics._02_GenericSwapMethodStrings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> boxList = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine().trim());

        for (int i = 0; i < n; i++) {

            Swap<String> line = new Swap<>(scanner.nextLine().trim());
            boxList.add(line.toString());

        }

        String[] line = scanner.nextLine().trim().split("\\s+");
        int indexOne = Integer.parseInt(line[0]);
        int indexTwo = Integer.parseInt(line[1]);

        List<String> pirntLIst = Swap.swap(boxList, indexOne, indexTwo);

        for (String linePrint : pirntLIst) {
            System.out.println(linePrint);
        }
    }
}
