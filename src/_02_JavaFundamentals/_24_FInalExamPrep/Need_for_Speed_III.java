package _02_JavaFundamentals._24_FInalExamPrep;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Need_for_Speed_III {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> mapMileage = new LinkedHashMap<>();
        Map<String, Integer> mapFuel = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] parts = scanner.nextLine().trim().split("\\|");
            String car = parts[0];
            int mileage = Integer.parseInt(parts[1]);
            int fuel = Integer.parseInt(parts[2]);

            mapMileage.put(car, mileage);
            mapFuel.put(car, fuel);
        }

        String input = scanner.nextLine();
        while (!"Stop".equals(input)) {
            String[] parts = input.trim().split(" : ");
            String command = parts[0];
            String car = parts[1];
            int fuel = mapFuel.get(car);
            int mileage = mapMileage.get(car);

            switch (command) {
                case "Drive":
                    int distance = Integer.parseInt(parts[2]);
                    int fuelForTheDistance = Integer.parseInt(parts[3]);

                    if (fuelForTheDistance > fuel) {
                        System.out.println("Not enough fuel to make that ride");
                    } else {
                        mileage += distance;
                        mapMileage.put(car, mileage);
                        fuel -= fuelForTheDistance;
                        mapFuel.put(car, fuel);
                        System.out.printf("%s driven for %d kilometers. %s liters of fuel consumed.%n", car, distance, fuelForTheDistance);

                        if (mileage > 100000) {
                            mapMileage.remove(car);
                            mapFuel.remove(car);
                            System.out.printf("Time to sell the %s!%n", car);
                        }

                    }
                    break;
                case "Refuel":
                    int refuel = Integer.parseInt(parts[2]);
                    int currentFuel = fuel;
                    fuel += refuel;

                    if (fuel > 75) {
                        int fuelToFill = 75 - currentFuel;
                        System.out.printf("%s refueled with %d liters%n", car, fuelToFill);
                        mapFuel.put(car, 75);
                    } else {
                        System.out.printf("%s refueled with %d liters%n", car, refuel);
                        mapFuel.put(car, fuel);
                    }
                    break;
                case "Revert":
                    int givenKilometers = Integer.parseInt(parts[2]);
                    mileage -= givenKilometers;

                    if (mileage < 10000) {
                        mapMileage.put(car, 10000);
                    } else {
                        mapMileage.put(car, mileage);
                        System.out.printf("%s mileage decreased by %d kilometers%n", car, givenKilometers);
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : mapMileage.entrySet()) {
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", entry.getKey(), entry.getValue(), mapFuel.get(entry.getKey()));
        }
    }
}
