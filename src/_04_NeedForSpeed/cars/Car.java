package _04_NeedForSpeed.cars;

import _04_NeedForSpeed.Vehicle;

public class Car extends Vehicle {

    final double DEFAULT_FUEL_CONSUMPTION = 3.0;
    public Car(double fuel, int horsePower) {
        super(fuel, horsePower);
        super.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}
