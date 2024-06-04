package _04_JavaOOP._03_Inheritance._05_Restaurant.restaurant.food;

import _04_JavaOOP._03_Inheritance._05_Restaurant.restaurant.Product;

import java.math.BigDecimal;
public class Food extends Product {

    private double grams;

    public Food(String name, BigDecimal price,double grams) {
        super(name, price);
        this.grams = grams;
    }

    public double getGrams() {
        return grams;
    }
}
