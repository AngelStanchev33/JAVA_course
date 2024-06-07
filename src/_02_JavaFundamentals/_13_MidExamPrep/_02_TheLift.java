package _02_JavaFundamentals._13_MidExamPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _02_TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleInline = Integer.parseInt(scanner.nextLine());

        String[] input = scanner.nextLine().trim().split("\\s+");
        List<String> numbers = new ArrayList<>(Arrays.asList(input));

        List<String> filledLift = new ArrayList<>();

        boolean hasEmptySpots = false;

        for (int i = 0; i < numbers.size(); i++) {
            int currentLiftSpace = Integer.parseInt(numbers.get(i));

            while (currentLiftSpace < 4 && peopleInline > 0) {
                currentLiftSpace++;
                peopleInline--;
            }

            String current = String.valueOf(currentLiftSpace);
            filledLift.add(current);
        }

        String joinedList = String.join(" ", filledLift);

        for (String s : filledLift) {
            int currentLift = Integer.parseInt(s);
            if (currentLift < 4) {
                hasEmptySpots = true;
                break;
            }
        }
        if (hasEmptySpots){
            System.out.printf("The lift has empty spots!%n%s", joinedList);
        }
        else {
        System.out.printf("There isn't enough space! %d people in a queue!%n%s", peopleInline, joinedList);
        }
    }
}


