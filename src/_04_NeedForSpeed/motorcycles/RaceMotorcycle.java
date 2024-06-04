package _04_NeedForSpeed.motorcycles;

public class RaceMotorcycle extends Motorcycle {

    public RaceMotorcycle(double fuel, int horsePower) {
        super(fuel, horsePower);
        double DEFAULT_FUEL_CONSUMPTION = 8.0;
        super.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}
