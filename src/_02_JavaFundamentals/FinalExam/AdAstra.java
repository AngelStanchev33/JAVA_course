package _02_JavaFundamentals.FinalExam;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        String regex = "([#|]{1})([A-Za-z\\s]+)\\1([0-9]{2}/[0-9]{2}/[0-9]{2})\\1([0-9]{1,5})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(line);

        List<String> items = new LinkedList<>();

        double totalCalories = 0;
        while (matcher.find()){
            String food = matcher.group(2);
            String date = matcher.group(3);
            double calories = Integer.parseInt(matcher.group(4));

            totalCalories +=calories;

            items.add(String.format("Item: %s, Best before: %s, Nutrition: %.0f%n", food, date, calories));
        }
        System.out.printf("You have food to last you for: %.0f days!%n", Math.floor(totalCalories / 2000));

        items.forEach(System.out::print);
    }
}
