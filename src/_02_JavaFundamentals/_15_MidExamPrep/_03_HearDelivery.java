package _02_JavaFundamentals._15_MidExamPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _03_HearDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> houses = new ArrayList<>();
        String[] input = scanner.nextLine().trim().split("@");
        for (String s : input) {
            int house = Integer.parseInt(s);
            houses.add(house);
        }

        int currentPosition = 0;
        int count = 0;

        boolean failed = false;

        while (true) {
            String data = scanner.nextLine();
            if (data.equals("Love!")) {
                break;
            }
            String[] tokens = data.split(" ");
            int jump = Integer.parseInt(tokens[1]);

            for (int i = currentPosition; i < houses.size(); i++) {
                i += jump;
                if (i > houses.size() - 1) {
                    i = 0;
                }

                int currentHouse = houses.get(i);
                if (currentHouse == 0) {
                    System.out.printf("Place %d already had Valentine's day.%n", i);
                } else {
                    currentHouse -= 2;
                    if (currentHouse == 0) {
                        System.out.printf("Place %d has Valentine's day.%n", i);
                    }
                }

                houses.set(i, currentHouse);
                currentPosition = i;
                break;
            }
        }

        for (Integer house : houses) {
            if (house > 0) {
                count++;
                failed = true;
            }
        }


        if (failed) {
            System.out.printf("Cupid's last position was %d.%n" +
                    "Cupid has failed %d places.", currentPosition, count);
        } else {
            System.out.printf("Cupid's last position was %d%n.", currentPosition);
            System.out.print("Mission was successful.");
        }
    }
}

