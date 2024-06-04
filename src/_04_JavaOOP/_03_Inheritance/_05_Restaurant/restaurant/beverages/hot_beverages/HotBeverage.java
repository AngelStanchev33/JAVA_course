package _04_JavaOOP._03_Inheritance._05_Restaurant.restaurant.beverages.hot_beverages;

import _04_JavaOOP._03_Inheritance._05_Restaurant.restaurant.beverages.Beverages;

import java.math.BigDecimal;

public class HotBeverage extends Beverages {
    public HotBeverage(String name, BigDecimal price, double milliliters) {
        super(name, price, milliliters);
    }
}
