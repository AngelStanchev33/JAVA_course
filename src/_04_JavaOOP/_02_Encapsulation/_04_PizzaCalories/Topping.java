package _04_JavaOOP._02_Encapsulation._04_PizzaCalories;

import java.util.Map;

public class Topping {
    private String toppingType;
    private double weight;

    private Map<String, Double> toppingsModifiers = Map.of("Meat", 1.2,
            "Veggies", 0.8,
            "Cheese", 1.1,
            "Sauce", 0.9);

    public Topping(String toppingType, double weight) {
        this.setToppingType(toppingType);
        this.setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        if (!toppingsModifiers.containsKey(toppingType)) {
            throw new IllegalArgumentException(String.format("Cannot place %s on top of your pizza.", toppingType));
        }
        this.toppingType = toppingType;
    }

    private void setWeight(double weight) {
        if (weight > 50 || weight < 0) {
            throw new IllegalArgumentException("Dough weight should be in the range [1..50].");
        }
        this.weight = weight;
    }

    public double calculateCalories() {
        return 2 * (weight) * toppingsModifiers.get(this.toppingType);
    }
}
