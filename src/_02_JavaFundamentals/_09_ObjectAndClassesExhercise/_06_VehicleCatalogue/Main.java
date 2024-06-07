package _02_JavaFundamentals._09_ObjectAndClassesExhercise._06_VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Car> cars = new ArrayList<>();
        List<Truck> trucks = new ArrayList<>();

        int horsePowerCar = 0;
        int horsePowerTruck = 0;

        String input = scanner.nextLine();
        while (!"End".equals(input)) {
            String[] dataTokens = input.split(" ");
            String type = dataTokens[0];
            String model = dataTokens[1];
            String color = dataTokens[2];
            int horsePower = Integer.parseInt(dataTokens[3]);

            if ("car".equals(type)) {
                Car car = new Car(type, model, color, horsePower);
                cars.add(car);
                horsePowerCar += horsePower;
            } else if ("truck".equals(type)) {
                Truck truck = new Truck(type, model, color, horsePower);
                trucks.add(truck);
                horsePowerTruck += horsePower;
            } else {
                return;
            }

            input = scanner.nextLine();
        }

        String model = scanner.nextLine();
        while (!"Close the Catalogue".equals(model)) {
            for (Car car : cars) {
                if (car.getModel().equals(model)) {
                    System.out.print(car);
                    break;
                }
            }

            for (Truck truck : trucks) {
                if (truck.getModel().equals(model)) {
                    System.out.print(truck);
                    break;
                }
            }
            model = scanner.nextLine();
        }
        if (trucks.size() + cars.size() > 50){
            return;
        }

        double carHorsePowerTotal = 0;
        double truckHorsePowerTotal = 0;

        if (!cars.isEmpty()) {
            carHorsePowerTotal = horsePowerCar * 1.0 / cars.size();
        }
        System.out.printf("Cars have average horsepower of: %.2f.%n",carHorsePowerTotal);

        if (!trucks.isEmpty()){
            truckHorsePowerTotal = horsePowerTruck * 1.0 / trucks.size();
        }
        System.out.printf("Trucks have average horsepower of: %.2f.",truckHorsePowerTotal);
    }
}

