package _03_JavaAdvanced._10_ExercisesDefiningClasses._05_CarSalesman;

public class Car {

    private String model;
    private Engine engine;
    private int weight;
    private String color;

    public Car(String model, Engine engine) {
        this(model, engine, 0, "n/a");
    }

    public Car(String model, Engine engine, int weight) {
        this(model,engine,weight,"n/a");
    }

    public Car(String model, Engine engine, String color) {
        this(model,engine,0,color);
    }

    public Car(String model, Engine engine, int weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        String displacement = (getEngine().getDisplacement() == 0) ? "n/a" : String.valueOf(getEngine().getDisplacement()); //условие ? израз1 : израз2
        //Когато условието е истина, тернарният оператор връща стойността на израз1, а когато условието е лъжа, връща стойността на израз2.

        String weight = (getWeight() == 0) ? "n/a" : String.valueOf(getWeight());
        return String.format("%s%n" +
                             "%s%n" +
                             "Power: %s%n" +
                             "Displacement: %s%n" +
                             "Efficiency: %s%n" +
                             "Weight: %s%n" +
                             "Color: %s",getModel(),getEngine().getModel(),getEngine().getPower(),
                                           displacement,getEngine().getEfficiency(),
                                           weight,getColor());

    }
}