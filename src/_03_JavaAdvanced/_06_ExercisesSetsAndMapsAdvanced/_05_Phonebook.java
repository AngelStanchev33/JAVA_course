package _03_JavaAdvanced._06_ExercisesSetsAndMapsAdvanced;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _05_Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> phoneBookMap = new HashMap<>();

        String line = scanner.nextLine().trim();

        while (!"search".equals(line)) {
            String[] tokens = line.trim().split("-");
            String name = tokens[0];
            String number = tokens[1];

            phoneBookMap.putIfAbsent(name, "");
            String value = phoneBookMap.get(name);
            phoneBookMap.put(name, value + number);

            line = scanner.nextLine().trim();
        }
        line = scanner.nextLine().trim();

        while (!"stop".equals(line)) {
            if (!phoneBookMap.containsKey(line)) {
                System.out.printf("Contact %s does not exist.%n", line);
            } else {
                String value = phoneBookMap.get(line);

                System.out.printf("%s -> %s%n",line,value);
            }
            line = scanner.nextLine().trim();
        }
    }
}
