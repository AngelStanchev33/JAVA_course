package JavaFundamentals._23_FinalExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _02_DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> destinations = new ArrayList<>();

        String input = scanner.nextLine();
        String regex = "([=|/])[A-Z][a-zA-Z]{2,}\\1";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(input);
        int travelPoints = 0;
        while (matcher.find()) {
            String destination = matcher.group();
            destination = destination.substring(1, destination.length() - 1);
            travelPoints += destination.length();
            destinations.add(destination);
        }

        System.out.print("Destinations: ");
        for (int i = 0; i < destinations.size(); i++) {
            System.out.print(destinations.get(i));
            if (i < destinations.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.printf("Travel Points: %d",travelPoints);


    }
}
