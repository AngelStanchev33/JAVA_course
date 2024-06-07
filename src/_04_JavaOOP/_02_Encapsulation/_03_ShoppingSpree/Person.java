package _04_JavaOOP._02_Encapsulation._03_ShoppingSpree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> productList;

    public Person(String name, double money) {
        this.setName(name);
        this.setMoney(money);
        this.productList = new ArrayList<>();
    }

    private void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    private void setMoney(double money) {
        if (money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    public void buyProduct(Product product) {
        if (product.getCost() <= this.money) {
            this.money -= product.getCost();
            productList.add(product);
            System.out.printf("%s bought %s\n",getName(),product.getName());
        } else {
            System.out.printf("%s can't afford %s\n", getName(), product.getName());
        }
    }

    public String getName() {
        return name;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(getName()).append(" - ");

        if (productList.isEmpty()) {
            stringBuilder.append("Nothing bought");
        } else {
            for (int i = 0; i < productList.size(); i++) {
                stringBuilder.append(productList.get(i).getName());
                if (i != productList.size() - 1) {
                    stringBuilder.append(", ");
                }
            }
        }

        return stringBuilder.toString();
    }
}
