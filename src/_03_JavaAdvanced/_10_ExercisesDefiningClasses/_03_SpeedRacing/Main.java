package _03_JavaAdvanced._10_ExercisesDefiningClasses._03_SpeedRacing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Car> carList = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine().trim());

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().trim().split("\\s+");

            String model = input[0];
            int fuelAmount = Integer.parseInt(input[1]);
            double fuelCostPerMile = Double.parseDouble(input[2]);

            Car car = new Car(model, fuelAmount, fuelCostPerMile, 0);
            carList.add(car);
        }

        String line = scanner.nextLine().trim();

        while (!"End".equals(line)) {
            String[] tokens = line.split("\\s+");

            String model = tokens[1];
            int amountOfKm = Integer.parseInt(tokens[2]);

            for (Car car : carList) {
                if (car.getModel().equals(model)) {
                    if (car.canTravel(amountOfKm)) {
                        car.setDistanceTraveled(amountOfKm);
                        car.decreaseFuel(amountOfKm);
                    } else {
                        System.out.println("Insufficient fuel for the drive");
                    }
                }
            }
            line = scanner.nextLine().trim();
        }

        for (Car car : carList) {
            System.out.printf("%s %.2f %d%n", car.getModel(), car.getFuelAmount(), car.getDistanceTraveled());
        }
    }
}
