package _02_JavaFundamentals._09_ObjectAndClassesExhercise._06_VehicleCatalogue;

public class Car {
    String type ;
    String model;
    String color;
    int horsepower;

    public Car(String type, String model, String color, int horsepower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        String firstLetterModel = this.type.substring(0, 1).toUpperCase();
        String restOfModel = this.type.substring(1);
        String formattedType = firstLetterModel + restOfModel;
        return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d%n",
                formattedType, this.model, this.color, this.horsepower);
    }

}
