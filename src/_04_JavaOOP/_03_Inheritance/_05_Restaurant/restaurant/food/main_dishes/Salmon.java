package _04_JavaOOP._03_Inheritance._05_Restaurant.restaurant.food.main_dishes;

import java.math.BigDecimal;

public class Salmon extends MainDish {

    private static final double SALMON_GRAMS = 22.0;
    public Salmon(String name, BigDecimal price) {
        super(name, price, SALMON_GRAMS);
    }
}
