package _03_JavaAdvanced._06_ExercisesSetsAndMapsAdvanced;

import java.util.*;

public class _07_HandsOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Set<String>> playersMap = new LinkedHashMap<>();
        Map<String, Integer> types = Map.of("S", 4,
                                            "H", 3,
                                            "D", 2,
                                            "C", 1);
        Map<String, Integer> powers = new HashMap<>(Map.of("2", 2,
                                                           "3", 3,
                                                           "4", 4,
                                                           "5", 5,
                                                           "6", 6,
                                                           "7", 7,
                                                           "8", 8,
                                                           "9", 9,
                                                          "10", 10,
                                                          "J", 11));
                                                         powers.put("Q", 12);
                                                         powers.put("K", 13);
                                                         powers.put("A", 14);

        String input = scanner.nextLine().trim();
        while (!"JOKER".equals(input)) {
            String[] tokens = input.split(": ");
            String playersName = tokens[0];

            playersMap.putIfAbsent(playersName, new LinkedHashSet<>());

            String[] cards = tokens[1].split(", ");
            for (String card : cards) {
                playersMap.get(playersName).add(card);
            }

            input = scanner.nextLine().trim();
        }

        for (Map.Entry<String, Set<String>> entrySet : playersMap.entrySet()) {
            String playerName = entrySet.getKey();
            int points = calculatePoints(entrySet.getValue(), types, powers);

            System.out.printf("%s: %d%n", playerName, points);

        }

    }

    private static int calculatePoints(Set<String> cards, Map<String, Integer> types, Map<String, Integer> powers) {
        int points = 0;

        for (String card : cards) {
            String power = card.substring(0, card.length() - 1);
            String type = String.valueOf(card.charAt(card.length() - 1));

            points += powers.get(power) * types.get(type);

        }


        return points;
    }
}
