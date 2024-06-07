package _02_JavaFundamentals._21_FinalExamPreparation;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _02_AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "([#|\\|])([A-za-z]+)(\\1)([0-9]{2,}/[0-9]{2,}/[0-9]{2,})(\\1)([0-9]{1,5}+)(\\1)";

        int totalCalories = 0;

        Map<String, List<String>> foodMap = new LinkedHashMap<>();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            String foodName = matcher.group(2);
            String date = matcher.group(4);
            int calories = Integer.parseInt(matcher.group(6));

            if (!foodMap.containsKey(foodName)) {
                foodMap.put(foodName, new ArrayList<>());
            }
            foodMap.get(foodName).add(date);
            foodMap.get(foodName).add(String.valueOf(calories));

            totalCalories += calories;
        }

        int foodDays = totalCalories / 2000;
        System.out.printf("You have food to last you for: %d days!%n", foodDays);

        for (Map.Entry<String, List<String>> entry : foodMap.entrySet()) {
            List<String> values = entry.getValue();
            String date = values.get(0);
            String calories = values.get(1);

            System.out.printf("Item: %s, Best before: %s, Nutrition: %s%n", entry.getKey(), date, calories);
        }
    }
}

