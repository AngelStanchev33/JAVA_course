package JavaFundamentals._26_FinalExamPrep;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _02_AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        Map<String, String> expDateMap = new LinkedHashMap<>();
        Map<String, Integer> caloriesMap = new LinkedHashMap<>();
        List<String> items = new LinkedList<>();

        String regex = "([#|\\|]{1})([A-Za-z\\s]+)\\1([0-9]{2}/[0-9]{2}/[0-9]{2})\\1([0-9]{1,5})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(line);


        int totalCalories = 0;
        while (matcher.find()) {
            String food = matcher.group(2);
            String date = matcher.group(3);
            int calories = Integer.parseInt(matcher.group(4));

            expDateMap.putIfAbsent(food, date);
            caloriesMap.putIfAbsent(food, calories);

            totalCalories += calories;
            items.add(String.format("Item: %s, Best before: %s, Nutrition: %d%n", food, date, calories));
        }

        System.out.printf("You have food to last you for: %d days!%n", totalCalories/2000);

        items.forEach(System.out::print);

    }
}
