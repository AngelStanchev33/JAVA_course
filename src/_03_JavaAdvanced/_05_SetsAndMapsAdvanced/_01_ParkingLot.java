package _03_JavaAdvanced._05_SetsAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class _01_ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> parkingLot = new LinkedHashSet<>();

        String input = scanner.nextLine();

        while (!"END".equals(input)) {
            String[] split = input.split(". ");
            String direction = split[0];
            String registration = split[1];

            if (direction.equals("IN")) {
                parkingLot.add(registration);

            } else {
                parkingLot.remove(registration);

            }
            input = scanner.nextLine();
        }

        if (parkingLot.isEmpty()){
            System.out.println("Parking lot is empty");
        }else {
            for (String reg : parkingLot) {
                System.out.println(reg);

            }
        }
    }
}
