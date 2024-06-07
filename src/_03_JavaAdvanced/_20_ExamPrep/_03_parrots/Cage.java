package _03_JavaAdvanced._20_ExamPrep._03_parrots;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cage {

    private String name;
    private int capacity;
    private List<Parrot> data;

    public Cage(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void getName(){
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(Parrot parrot) {
        if (count() < capacity) {
            data.add(parrot);
        }
    }

    public boolean remove(String name) {
        return data.removeIf(data -> data.getName().equals(name));
    }

    public Parrot sellParrot(String name) {
        return data.stream()
                .filter(parrot -> parrot.getName().equals(name))
                .peek(parrot -> parrot.setAvailable(false))
                .findFirst()
                .orElse(null);
    }

    public List<Parrot> sellParrotBySpecies(String species) {
        return data.stream()
                .filter(parrot -> parrot.getSpecies().equals(species))
                .peek(parrot -> parrot.setAvailable(false))
                .collect(Collectors.toList());
    }

    public int count(){
        return data.size();
    }

    public String report() {
        StringBuilder reportBuilder = new StringBuilder();
        reportBuilder.append(String.format("Parrots available at %s:\n", name));

        String availableParrots = data.stream()
                .filter(Parrot::isAvailable)
                .map(Parrot::toString)
                .collect(Collectors.joining("\n"));

        reportBuilder.append(availableParrots);

        return reportBuilder.toString();
    }
}
