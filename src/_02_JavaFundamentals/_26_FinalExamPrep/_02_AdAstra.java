    package _02_JavaFundamentals._26_FinalExamPrep;

    import java.util.*;
    import java.util.regex.Matcher;
    import java.util.regex.Pattern;

    public class _02_AdAstra {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String line = scanner.nextLine();

            List<String> items = new LinkedList<>();

            String regex = "([#|]{1})([A-Za-z\\\\s]+)\\1([0-9]{2}/[0-9]{2}/[0-9]{2})\\1[0-9]{1,5}\\1";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(line);

            double totalCalories = 0;
            while (matcher.find()) {
                String food = matcher.group(2);
                String date = matcher.group(3);
                double calories = Double.parseDouble(matcher.group(4));

                totalCalories += calories;
                items.add(String.format("Item: %s, Best before: %s, Nutrition: %.0f%n", food, date, calories));
            }

            System.out.printf("You have food to last you for: %.0f days!%n", Math.floor(totalCalories / 2000));

            items.forEach(System.out::print);

        }
    }
