package _04_JavaOOP._03_Inheritance._05_Restaurant.restaurant.beverages.cold_beverages;

import _04_JavaOOP._03_Inheritance._05_Restaurant.restaurant.beverages.Beverages;

import java.math.BigDecimal;

public class ColdBeverage extends Beverages {
    public ColdBeverage(String name, BigDecimal price, double milliliters) {
        super(name, price, milliliters);
    }
}
