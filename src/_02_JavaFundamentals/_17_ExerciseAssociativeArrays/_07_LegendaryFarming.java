package _02_JavaFundamentals._17_ExerciseAssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _07_LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> materialsMap = new LinkedHashMap<>();
        materialsMap.put("shards", 0);
        materialsMap.put("fragments", 0);
        materialsMap.put("motes", 0);


        Map<String, Integer> junkMap = new LinkedHashMap<>();

        boolean isWin = false;
        while (!isWin) {
            String input = scanner.nextLine();
            String[] materials = input.split("\\s+");

            for (int i = 0; i < materials.length - 1; i += 2) {
                int quantity = Integer.parseInt(materials[i]);
                String matt = materials[i + 1].toLowerCase();

                if (matt.equalsIgnoreCase("Shards") || matt.equalsIgnoreCase("Fragments") || matt.equalsIgnoreCase("Motes")) {
                    materialsMap.put(matt, 0);
                    materialsMap.put(matt, materialsMap.get(matt) + quantity);
                } else {
                    junkMap.put(matt, 0);
                    junkMap.put(matt, junkMap.get(matt) + quantity);
                }
                if (materialsMap.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    materialsMap.put("shards", materialsMap.get("shards") - 250);
                    isWin = true;
                    break;
                } else if (materialsMap.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    materialsMap.put("fragments", materialsMap.get("fragments") - 250);
                    isWin = true;
                    break;
                } else if (materialsMap.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    materialsMap.put("motes", materialsMap.get("motes") - 250);
                    isWin = true;
                    break;
                }
            }
        }
        materialsMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
        junkMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

    }
}

