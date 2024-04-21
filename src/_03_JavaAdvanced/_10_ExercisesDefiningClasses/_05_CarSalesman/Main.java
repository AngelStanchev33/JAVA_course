package _03_JavaAdvanced._10_ExercisesDefiningClasses._05_CarSalesman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine().trim());

        List<Engine> engineList = new ArrayList<>();
        Engine engine;

        for (int i = 0; i < n; i++) {
            String[] engineInfo = scanner.nextLine().trim().split("\\s+");

            String model = engineInfo[0];
            String power = engineInfo[1];

            switch (engineInfo.length) {
                case 3:
                    if (!engineInfo[2].matches("[A-Ba-b]+")) {
                        int displacementsCase = Integer.parseInt(engineInfo[2]);
                        engine = new Engine(model, power, displacementsCase);
                        engineList.add(engine);
                    } else {
                        String efficiencyCase = engineInfo[2];
                        engine = new Engine(model, power, efficiencyCase);
                        engineList.add(engine);
                    }
                    break;
                case 4:
                    int displacements = Integer.parseInt(engineInfo[2]);
                    String efficiency = engineInfo[3];
                    engine = new Engine(model, power, displacements, efficiency);
                    engineList.add(engine);
                    break;
                default:
                    engine = new Engine(model, power);
                    engineList.add(engine);
            }
        }

        int m = Integer.parseInt(scanner.nextLine().trim());

        List<Car> carList = new ArrayList<>();
        Car car;


        for (int i = 0; i < m; i++) {
            String[] carInfo = scanner.nextLine().trim().split("\\s+");

            String model = carInfo[0];
            String carEngine = carInfo[1];
            engine = null;
            for (Engine e : engineList) {
                if (e.getModel().equals(carEngine)) {
                    engine = e;
                    break;
                }
            }


            switch (carInfo.length) {
                case 3:
                    if (carInfo[2].matches("[0-9]+")) {
                        int weightCase = Integer.parseInt(carInfo[2]);
                        car = new Car(model,engine,weightCase);
                        carList.add(car);
                    } else {
                        String colorCase = carInfo[2];
                        car = new Car(model,engine,colorCase);
                        carList.add(car);
                    }
                    break;
                case 4:
                    int weight = Integer.parseInt(carInfo[2]);
                    String color = carInfo[3];
                    car = new Car(model,engine,weight,color);
                    carList.add(car);
                    break;
                default:
                    car = new Car(model, engine);
                    carList.add(car);
            }
        }
        carList.forEach(System.out::println);
    }
}
