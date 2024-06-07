package _03_JavaAdvanced._19_ExamPrep.aquarium;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {

    private List<Fish> fishInPool;
    private String name;
    private int capacity;
    private int size;

    public Aquarium(String name, int capacity, int size) {
        this.fishInPool = new ArrayList<>();
        this.name = name;
        this.capacity = capacity;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSize() {
        return size;
    }

    public int getFishInPool() {
        return fishInPool.size();
    }

    public void add(Fish fish) {
        if (getFishInPool() < capacity && findFish(fish.getName()) == null) {
            fishInPool.add(fish);
        }
    }

    public boolean remove(String name) {
        return fishInPool.removeIf(fish -> fish.getName().equals(name));
    }

    public Fish findFish(String name) {
        return fishInPool.stream()
                .filter(fish -> fish.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

    public String report() {
        StringBuilder result = new StringBuilder();
        result.append(String.format("Aquarium: %s ^ Size: %d\n", name, size));
        fishInPool.forEach(fish -> result.append(fish.toString()).append("\n"));
        return result.toString();
    }
}

