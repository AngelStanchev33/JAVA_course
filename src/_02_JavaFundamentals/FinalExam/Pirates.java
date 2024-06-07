import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> populationMap = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> goldMap = new LinkedHashMap<>();

        String input = scanner.nextLine().trim();
        while (!"Sail".equals(input)) {
            String[] split = input.split("\\|\\|");
            String city = split[0];
            int population = Integer.parseInt(split[1]);
            int gold = Integer.parseInt(split[2]);

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

            input = scanner.nextLine().trim();
        }

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            if ("End".equals(line)) {
                break;
            }
            String[] split = line.split("=>");
            String command = split[0];
            String city = split[1];

            switch (command) {
                case "Plunder":
                    int peopleKilled = Integer.parseInt(split[2]);
                    int goldTaken = Integer.parseInt(split[3]);

                    if (populationMap.containsKey(city)) {
                        populationMap.put(city, populationMap.get(city) - peopleKilled);
                        goldMap.put(city, goldMap.get(city) - goldTaken);
                        System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", city, goldTaken, peopleKilled);
                    }
                    if (populationMap.get(city) <= 0 || goldMap.get(city) <=0) {
                        populationMap.remove(city);
                        goldMap.remove(city);
                        System.out.printf("%s has been wiped off the map!%n", city);
                    }


                    break;
                case "Prosper":
                    int amountOfGoldGrowth = Integer.parseInt(split[2]);
                    if (amountOfGoldGrowth <= 0) {
                        System.out.println("Gold added cannot be a negative number!");
                        continue;
                    } else {
                        goldMap.put(city, goldMap.get(city) + amountOfGoldGrowth);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", amountOfGoldGrowth, city, goldMap.get(city));
                    }
                    break;
            }
        }

        if (populationMap.isEmpty()) {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        } else {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", populationMap.size());
            for (Map.Entry<String, Integer> entry : populationMap.entrySet()) {
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n", entry.getKey(), entry.getValue(), goldMap.get(entry.getKey()));
            }

        }
    }
}
