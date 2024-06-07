package _02_JavaFundamentals._27_FinalExamPrep;

import java.util.*;

public class _03_PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> rarityMap = new HashMap<>();
        Map<String, ArrayList<Double>> ratingMap = new HashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine().trim();
            String[] plants = line.split("<->");
            String plant = plants[0];
            int rarity = Integer.parseInt(plants[1]);

            rarityMap.putIfAbsent(plant, rarity);
            ratingMap.putIfAbsent(plant, new ArrayList<>());

        }
        String input = scanner.nextLine();
        while (!input.equals("Exhibition")) {
            String[] partsOne = input.trim().split("[:]");
            String[] partsTwo = input.trim().split("\\s+");
            String[] partsThree = input.trim().split("- ");
            String command = partsOne[0];
            String plant = partsTwo[1];

            if (command.equals("Rate") || command.equals("Update") || command.equals("Reset")) {
                switch (command) {
                    case "Rate":
                        double ratingGiven = Double.parseDouble(partsThree[1]);

                        ratingMap.get(plant).add(ratingGiven);
                        break;
                    case "Update":
                        int newRarity = Integer.parseInt(partsThree[1]);
                        rarityMap.put(plant, newRarity);
                        break;
                    case "Reset":
                        List<Double> values = ratingMap.get(plant);
                        values.clear();
                        break;
                }
            } else {
                System.out.println("error");
            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, ArrayList<Double>> entry : ratingMap.entrySet()) {
            List<Double> values = entry.getValue();
            double total = 0;
            for (Double value : values) {
                total += value;
            }
            if (values.isEmpty()){
                total = 0.00;
            }
            total /= values.size();
        }

    }
}
