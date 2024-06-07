package _02_JavaFundamentals._22_FinalExamPreparation;

import java.util.*;

public class _03_PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Integer>> plantsMap = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] information = scanner.nextLine().split("<->");
            String plantName = information[0];
            int rarity = Integer.parseInt(information[1]);

            if (!plantsMap.containsKey(plantName)) {
                plantsMap.put(plantName, new ArrayList<>());
                plantsMap.get(plantName).add(rarity);
            } else {
                plantsMap.get(plantName).remove(0);
                plantsMap.get(plantName).add(rarity);
            }
        }

        String input = scanner.nextLine();
        while (!"Exhibition".equals(input)) {
            String[] tokens = input.split("[: -]+");
            String command = tokens[0];
            String plantName = tokens [1];

            switch (command) {
                case "Rate":
                    int rating = Integer.parseInt(tokens[2]);
                    plantsMap.get(plantName).add(rating);
                    break;
                case "Update":
                    int newRarity = Integer.parseInt(input.split(" - ")[1]);
                    plantsMap.get(plantName).set(0,newRarity);
                    break;
                case "Reset":
                    List<Integer> ratings = plantsMap.get(plantName);
                    ratings.subList(1,ratings.size()).clear();
                    break;
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<Integer>> entry : plantsMap.entrySet()) {
            List<Integer> ratings = entry.getValue();
            int sum = ratings.stream().skip(1).mapToInt(Integer::intValue).sum();
            String string = String.valueOf(sum);
            String length = String.valueOf(string.length());

            double averageSum = sum / Double.parseDouble(length);
            
        }


    }



}
