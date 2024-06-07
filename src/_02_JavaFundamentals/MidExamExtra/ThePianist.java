package _02_JavaFundamentals.MidExamExtra;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> linkedCompMap = new LinkedHashMap<>();
        Map<String, String> linkedKeyMap = new LinkedHashMap<>();


        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] pieces = scanner.nextLine().split("\\|");
            String piece = pieces[0];
            String comp = pieces[1];
            String key = pieces[2];

            linkedCompMap.put(piece, comp);
            linkedKeyMap.put(piece, key);
        }

        String input = scanner.nextLine();
        while (!"Stop".equals(input)) {
            String[] split = input.split("\\|");
            String command = split[0];
            String piece = split[1];

            switch (command) {
                case "Add":
                    String comp = split[2];
                    String key = split[3];

                    if (!linkedCompMap.containsKey(piece)) {
                        linkedCompMap.put(piece, comp);
                        linkedKeyMap.put(piece, key);
                        System.out.printf("%s by %s in %s added to the collection!%n", piece, comp, key);
                    } else {
                        System.out.printf("%s is already in the collection!%n", piece);
                    }
                    break;
                case "Remove":
                    if (linkedCompMap.containsKey(piece)) {
                        linkedCompMap.remove(piece);
                        linkedKeyMap.remove(piece);

                        System.out.printf("Successfully removed %s!%n", piece);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                    }
                    break;
                case "ChangeKey":
                    String newKey = split[2];
                    if (linkedCompMap.containsKey(piece)) {
                        linkedKeyMap.put(piece, newKey);
                        System.out.printf("Changed the key of %s to %s!%n", piece, newKey);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);

                    }
                    break;
            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, String> entry : linkedCompMap.entrySet()) {
            System.out.printf("%s -> Composer: %s, Key: %s%n", entry.getKey(), entry.getValue(), linkedKeyMap.get(entry.getKey()));
        }
    }
}
