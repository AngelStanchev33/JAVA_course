package _03_JavaAdvanced._10_ExercisesDefiningClasses._05_CarSalesman;

public class Engine {

    private String model;
    private String power;
    private int displacement;
    private String efficiency;

    public Engine(String model,String power) {
        this(model,power,0,"n/a");
    }

    public Engine(String model, String power, int displacement) {
        this(model,power,displacement,"n/a");
    }

    public Engine(String model, String power, String efficiency) {
        this(model,power,0,"n/a");
    }

    public Engine(String model, String power, int displacement, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public String getPower() {
        return power;
    }

    public int getDisplacement() {
        return displacement;
    }

    public String getEfficiency() {
        return efficiency;
    }
}
