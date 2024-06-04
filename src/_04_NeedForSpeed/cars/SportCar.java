package _04_NeedForSpeed.cars;

public class SportCar extends Car {

    public SportCar(double fuel, int horsePower) {
        super(fuel, horsePower);
        double DEFAULT_FUEL_CONSUMPTION = 10.0;
        super.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}
