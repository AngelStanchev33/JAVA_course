package _03_JavaAdvanced._10_ExercisesDefiningClasses._04_RawData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine().trim());

        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] carInfo = scanner.nextLine().trim().split("\\s+");
            String model = carInfo[0];
            int engineSpeed = Integer.parseInt(carInfo[1]);
            int enginePower = Integer.parseInt(carInfo[2]);
            int cargoWeight = Integer.parseInt(carInfo[3]);
            String cargoType = carInfo[4];

            Engine engine = new Engine(engineSpeed, enginePower);
            Cargo cargo = new Cargo(cargoWeight, cargoType);
            List<Tires> tires = new ArrayList<>();
            for (int j = 5; j < carInfo.length; j += 2) {             // zapocvha ot 5 zashoto gumite zapochvat ot 5 poziciq v masiva
                double tirePressure = Double.parseDouble(carInfo[j]); // ako e chetno znachi e tirePressure
                int tireAge = Integer.parseInt(carInfo[j + 1]);       // ako e ne-chetno znachi e godina
                Tires tire = new Tires(tirePressure, tireAge);
                tires.add(tire);
            }
            Car car = new Car(model, engine, cargo, tires);
            cars.add(car);
        }
        System.out.println();

        String command  = scanner.nextLine().trim();

        if (command.equals("fragile")){
            cars.stream()
                    .filter(car -> car.getCargo().getType().equals("fragile"))
                    .filter(car -> car.getTires().stream().anyMatch(tires -> tires.getPressure() <1))
                    .forEach(car -> System.out.println(car.getModel()));
        } else if (command.equals("flamable")) {
            cars.stream()
                    .filter(car -> car.getCargo().getType().equals("flamable"))
                    .filter(car -> car.getEngine().getPower() > 250)
                    .forEach(car -> System.out.println(car.getModel()));
        }


    }
}
