package _03_JavaAdvanced._10_ExercisesDefiningClasses._04_RawData;

public class Tires {
    private double pressure;
    public  int age;

    public Tires(double pressure, int age) {
        this.pressure = pressure;
        this.age = age;
    }

    public double getPressure() {
        return pressure;
    }

    public int getAge() {
        return age;
    }
}
