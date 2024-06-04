package _04_NeedForSpeed;

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

    public double getDEFAULT_FUEL_CONSUMPTION() {
        return DEFAULT_FUEL_CONSUMPTION;
    }

    public void setDEFAULT_FUEL_CONSUMPTION(double DEFAULT_FUEL_CONSUMPTION) {
        this.DEFAULT_FUEL_CONSUMPTION = DEFAULT_FUEL_CONSUMPTION;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
