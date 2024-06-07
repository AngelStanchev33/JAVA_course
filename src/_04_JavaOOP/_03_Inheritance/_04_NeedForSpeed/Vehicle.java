package _04_JavaOOP._03_Inheritance._04_NeedForSpeed;

public class Vehicle {
    private double DEFAULT_FUEL_CONSUMPTION = 1.25;
    private double fuelConsumption;
    private double fuel;
    private int horsePower;

    public Vehicle(double fuel, int horsePower) {
        this.fuelConsumption = DEFAULT_FUEL_CONSUMPTION;
        this.fuel = fuel;
        this.horsePower = horsePower;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void drive(double kilometers) {
        double fuelNeeded = kilometers * fuelConsumption;

        if (fuelNeeded <= this.fuel) {
            this.fuel -= fuelNeeded;
        }
    }
}
