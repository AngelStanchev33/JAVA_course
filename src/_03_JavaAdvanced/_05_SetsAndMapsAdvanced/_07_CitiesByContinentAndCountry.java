package _03_JavaAdvanced._05_SetsAndMapsAdvanced;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _07_CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine().trim());

        Map<String, LinkedHashMap<String, ArrayList<String>>> dataMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {

            String[] split = scanner.nextLine().trim().split("\\s+");
            String continent = split[0];
            String country = split[1];
            String city = split[2];

            dataMap.putIfAbsent(continent, new LinkedHashMap<>());
            LinkedHashMap<String, ArrayList<String>> countryMap = dataMap.get(continent);
            countryMap.putIfAbsent(country, new ArrayList<>());
            ArrayList<String> citiesList = countryMap.get(country);
            citiesList.add(city);

        }

        dataMap.entrySet()
                .forEach(entry -> {
                    System.out.println(entry.getKey() + ":");

                    entry.getValue().entrySet().stream()
                            .forEach(innerEntry -> {
                                String cities = String.join(", ", innerEntry.getValue());
                                System.out.println("  " + innerEntry.getKey() + " -> " + cities);
                            });
                });
    }
}
