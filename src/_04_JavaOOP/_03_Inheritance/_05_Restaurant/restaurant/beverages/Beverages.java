package _04_JavaOOP._03_Inheritance._05_Restaurant.restaurant.beverages;

import _04_JavaOOP._03_Inheritance._05_Restaurant.restaurant.Product;

import java.math.BigDecimal;

public class Beverages extends Product {

    private double milliliters;

    public Beverages(String name, BigDecimal price,double milliliters) {
        super(name, price);
        this.milliliters = milliliters;
    }

    public double getMilliliters() {
        return milliliters;
    }
}
