package _03_JavaAdvanced._10_ExercisesDefiningClasses._03_SpeedRacing;

public class Car {
    private String Model;
    private double fuelAmount;
    private double costPerMile;
    private int distanceTraveled = 0;

    public Car(String model, int fuelAmount, double costPerMile, int distanceTraveled) {
        Model = model;
        this.fuelAmount = fuelAmount;
        this.costPerMile = costPerMile;
        this.distanceTraveled = distanceTraveled;
    }

    public boolean canTravel(int distance) {
        double fuelNeeded = getFuelNeeded(distance);
        return fuelNeeded <= this.fuelAmount;
    }

    public double decreaseFuel(int distance) {
        double fuelNeeded = getFuelNeeded(distance);
        fuelAmount -= fuelNeeded;
        return this.fuelAmount;
    }

    private double getFuelNeeded(int distance) {
        double fuelNeeded = this.costPerMile * distance;
        return fuelNeeded;
    }


    public String getModel() {
        return Model;
    }

    public void setDistanceTraveled(int distanceTraveled) {
        this.distanceTraveled += distanceTraveled;
    }
    public double getFuelAmount() {
        return fuelAmount;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }
}
