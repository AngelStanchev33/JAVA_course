package _04_JavaOOP._03_Inheritance._05_Restaurant.restaurant.food.starter;

import _04_JavaOOP._03_Inheritance._05_Restaurant.restaurant.food.Food;

import java.math.BigDecimal;

public class Starter extends Food {
    public Starter(String name, BigDecimal price, double grams) {
        super(name, price, grams);
    }
}
