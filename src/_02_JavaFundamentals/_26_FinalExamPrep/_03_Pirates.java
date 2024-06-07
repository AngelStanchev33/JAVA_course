package _02_JavaFundamentals._26_FinalExamPrep;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _03_Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> populationMap = new LinkedHashMap<>();
        Map<String, Integer> goldMap = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!"Sail".equals(input)) {
            String[] data = input.split("\\|\\|");
            String city = data[0];
            int population = Integer.parseInt(data[1]);
            int gold = Integer.parseInt(data[2]);

            if (!populationMap.containsKey(city)) {
                populationMap.put(city, population);
            } else {
                populationMap.put(city, populationMap.get(city) + population);
            }
            if (!goldMap.containsKey(city)) {
                goldMap.put(city, gold);
            } else {
                goldMap.put(city, goldMap.get(city) + gold);
            }

            input = scanner.nextLine();
        }

        String text = scanner.nextLine();
        while (!"End".equals(text)) {
            String[] lines = text.split("=>");
            String command = lines[0];
            String town = lines[1];

            switch (command) {
                case "Plunder":
                    int people = Integer.parseInt(lines[2]);
                    int gold = Integer.parseInt(lines[3]);

                    int peopleKilled = populationMap.get(town) - people;
                    populationMap.put(town, peopleKilled);
                    int goldTaken = goldMap.get(town) - gold;
                    goldMap.put(town, goldTaken);
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", town, gold, people);

                    if (peopleKilled <= 0 || goldTaken <= 0) {
                        populationMap.remove(town);
                        goldMap.remove(town);
                        System.out.printf("%s has been wiped off the map!%n", town);
                    }
                    break;
                case "Prosper":
                    int prosperGold = Integer.parseInt(lines[2]);

                    if (prosperGold < 0) {
                        System.out.println("Gold added cannot be a negative number!");
                        break;
                    } else {
                        int increaseGold = goldMap.get(town) + prosperGold;
                        goldMap.put(town, increaseGold);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", prosperGold, town, increaseGold);
                    }
                    break;
            }
            text = scanner.nextLine();
        }

        if (!populationMap.isEmpty() || !goldMap.isEmpty()) {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", populationMap.size());
            for (Map.Entry<String, Integer> entry : populationMap.entrySet()) {
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n", entry.getKey(), entry.getValue(), goldMap.get(entry.getKey()));
            }
        } else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }

    }
}
