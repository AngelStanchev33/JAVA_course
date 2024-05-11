package _03_JavaAdvanced._16_ExamPrep.easterBasket;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private List<Egg> eggList;
    private String material;
    private int capacity;

    public Basket(String material, int capacity) {
        this.material = material;
        this.capacity = capacity;
        this.eggList = new ArrayList<>();
    }

    public String getMaterial() {
        return material;
    }

    public void addEgg(Egg egg) {
        if (eggList.size() < capacity) {
            eggList.add(egg);
        }
    }

    public boolean removeEgg(String color) {
        if (!isBasketEmpty(eggList)) {
            for (Egg egg : eggList) {
                if (color.equals(egg.getColor())) {
                    eggList.remove(egg);
                    return true;
                }
            }
        }
        return false;
    }

    public Egg getStrongestEgg() {
        Egg egg = null;

        if (!isBasketEmpty(eggList)) {
            for (Egg egg1 : eggList) {
                if (egg == null || egg1.getStrength() > egg.getStrength()) {
                    egg = egg1;
                }
            }
        }
        return egg;
    }

    public Egg getEgg(String color) {
        Egg egg = null;

        if (!isBasketEmpty(eggList)) {
            for (Egg egg1 : eggList) {
                if (egg1.getColor().matches(color)) {
                    egg = egg1;
                }
            }
        }
        return egg;
    }

    public int getCount(List<Egg> eggList) {

        return eggList.size();
    }

    public String report() {
        StringBuilder reportBuilder = new StringBuilder();
        reportBuilder.append(String.format("%s basket contains:%n", getMaterial()));
        for (Egg egg : eggList) {
            reportBuilder.append(egg.toString()).append("\n");
        }
        return reportBuilder.toString();
    }

    public boolean isBasketEmpty(List<Egg> eggList) {
        return eggList.isEmpty();
    }

}
