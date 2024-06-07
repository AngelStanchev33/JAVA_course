package _02_JavaFundamentals._20_FinalExamPreparation;

import java.util.*;

public class _03_ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> favoritePianoPieceMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] parts = scanner.nextLine().split("\\|");
            String piece = parts[0];
            String composer = parts[1];
            String key = parts[2];
            if (!favoritePianoPieceMap.containsKey(piece)) {
                favoritePianoPieceMap.put(piece, new ArrayList<>());
            }
            favoritePianoPieceMap.get(piece).add(composer);
            favoritePianoPieceMap.get(piece).add(key);
        }

        String input = scanner.nextLine();
        while (!"Stop".equals(input)) {
            String[] commands = input.split("\\|");
            String command = commands[0];

            switch (command) {
                case "Add":
                    String piece = commands[1];
                    String composer = commands[2];
                    String key = commands[3];

                    if (!favoritePianoPieceMap.containsKey(piece)) {
                        favoritePianoPieceMap.put(piece, new ArrayList<>());
                        favoritePianoPieceMap.get(piece).add(composer);
                        favoritePianoPieceMap.get(piece).add(key);

                        System.out.printf("%s by %s in %s added to the collection!%n", piece, composer, key);
                    } else {

                        System.out.printf("%s is already in the collection!%n", piece);
                    }
                    break;
                case "Remove":
                    String pieceRemove = commands[1];

                    if (favoritePianoPieceMap.containsKey(pieceRemove)) {
                        favoritePianoPieceMap.remove(pieceRemove);
                        System.out.printf("Successfully removed %s!%n", pieceRemove);
                    } else {

                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", pieceRemove);
                    }
                    break;
                case "ChangeKey":
                    String changeKeyPiece = commands[1];
                    String newKey = commands[2];

                    if (favoritePianoPieceMap.containsKey(changeKeyPiece)) {
                        List<String> values = favoritePianoPieceMap.get(changeKeyPiece);
                        values.set(1, newKey);

                        System.out.printf("Changed the key of %s to %s!%n", changeKeyPiece, newKey);
                    } else {

                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", changeKeyPiece);
                    }
                    break;


            }

            input = scanner.nextLine();
        }

        favoritePianoPieceMap.forEach((key, values) -> {
            String firstValue = values.get(0);
            String secondValue = values.get(1);
            System.out.printf("%s -> Composer: %s, Key: %s%n", key, firstValue, secondValue);
        });
    }
}
