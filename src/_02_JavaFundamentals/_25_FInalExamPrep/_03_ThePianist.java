package _02_JavaFundamentals._25_FInalExamPrep;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _03_ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> composerMap = new LinkedHashMap<>();
        Map<String, String> keyMap = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split("\\|");
            String piece = line[0];
            String composer = line[1];
            String key = line[2];

            composerMap.put(piece, composer);
            keyMap.put(piece, key);
        }

        String input = scanner.nextLine();
        while (!"Stop".equals(input)) {
            String[] parts = input.split("\\|");
            String command = parts[0];
            String piece = parts[1];

            switch (command) {
                case "Add":
                    String composer = parts[2];
                    String key = parts[3];

                    if (!composerMap.containsKey(piece)) {
                        composerMap.put(piece, composer);
                        keyMap.put(piece, key);
                        System.out.printf("%s by %s in %s added to the collection!%n", piece, composer, key);
                    } else {
                        System.out.printf("%s is already in the collection!%n", piece);
                    }
                    break;
                case "Remove":
                    if (composerMap.containsKey(piece)) {
                        composerMap.remove(piece);
                        keyMap.remove(piece);
                        System.out.printf("Successfully removed %s!%n", piece);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                    }
                    break;
                case "ChangeKey":
                    String newKey = parts[2];
                    if (composerMap.containsKey(piece)) {
                        keyMap.put(piece, newKey);
                        System.out.printf("Changed the key of %s to %s!%n", piece, newKey);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                    }
                    break;
            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, String> entry : composerMap.entrySet()) {
            System.out.printf("%s -> Composer: %s, Key: %s%n", entry.getKey(), entry.getValue(), keyMap.get(entry.getKey()));
        }


    }
}
