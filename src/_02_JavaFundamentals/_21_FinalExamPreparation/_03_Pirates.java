package _02_JavaFundamentals._21_FinalExamPreparation;

import java.util.*;

public class _03_Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Integer>> pirateMap = new LinkedHashMap<>();

        while (true) {
            String input = scanner.nextLine();

            if ("Sail".equals(input)) {
                break;
            }
            String[] parts = input.split("\\|\\|");
            String city = parts[0];
            int population = Integer.parseInt(parts[1]);
            int gold = Integer.parseInt(parts[2]);

            if (pirateMap.containsKey(city)) {
                List<Integer> values = pirateMap.get(city);
                int populationAdded = values.get(0) + population;
                int goldAdded = values.get(1) + gold;

                pirateMap.get(city).set(0,populationAdded);
                pirateMap.get(city).set(1,goldAdded);
            } else {
                pirateMap.put(city, new ArrayList<>());
                pirateMap.get(city).add(population);
                pirateMap.get(city).add(gold);
            }
        }

        while (true) {
            String input = scanner.nextLine();

            if ("End".equals(input)) {
                break;
            }
            String[] commands = input.split("=>");
            String command = commands[0];
            String town = commands[1];

            switch (command) {

                case "Plunder":
                    int population = Integer.parseInt(commands[2]);
                    int gold = Integer.parseInt(commands[3]);

                    if (pirateMap.containsKey(town)) {
                        List<Integer> values = pirateMap.get(town);
                        int populationLeft = values.get(0) - population;
                        int goldLeft = values.get(1) - gold;

                        pirateMap.get(town).set(0, populationLeft);
                        pirateMap.get(town).set(1, goldLeft);

                        System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n"
                                , town, gold, population);

                        if (populationLeft <= 0 || goldLeft <= 0) {
                            pirateMap.remove(town);
                            System.out.printf("%s has been wiped off the map!%n", town);
                        }

                    }
                    break;
                case "Prosper":
                    int prosperGold = Integer.parseInt(commands[2]);

                    if (prosperGold < 0) {
                        System.out.println("Gold added cannot be a negative number!");

                    } else {
                        List<Integer> values = pirateMap.get(town);
                        int goldAdded = prosperGold + values.get(1);

                        pirateMap.get(town).set(1, goldAdded);

                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n"
                                , prosperGold, town, goldAdded);
                    }
                    break;
            }
        }

        System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n",pirateMap.size());

        for (Map.Entry<String, List<Integer>> entry : pirateMap.entrySet()) {

            List<Integer> values = entry.getValue();
            int population = values.get(0);
            int gold = values.get(1);

            System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n",entry.getKey(),population,gold);
        }
    }
}
