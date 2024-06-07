package _03_JavaAdvanced._09_DefiningClasses._1_CarInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine().trim());

        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] split = scanner.nextLine().trim().split("\\s+");
            String brand = split[0];

            Car car;
            if (split.length == 1) {
                car = new Car(brand);
            } else {
                String model = split[1];
                int hp = Integer.parseInt(split[2]);
                car = new Car(brand, model, hp);
            }

            cars.add(car);

        }
        cars.forEach(System.out::println);
    }
}