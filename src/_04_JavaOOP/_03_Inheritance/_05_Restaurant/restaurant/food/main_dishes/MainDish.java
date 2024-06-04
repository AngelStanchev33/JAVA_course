package _04_JavaOOP._03_Inheritance._05_Restaurant.restaurant.food.main_dishes;

import _04_JavaOOP._03_Inheritance._05_Restaurant.restaurant.food.Food;

import java.math.BigDecimal;

public class MainDish extends Food {
    public MainDish(String name, BigDecimal price, double grams) {
        super(name, price, grams);
    }

}
