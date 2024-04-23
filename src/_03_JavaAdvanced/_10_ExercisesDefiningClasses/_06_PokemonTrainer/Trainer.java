package _03_JavaAdvanced._10_ExercisesDefiningClasses._06_PokemonTrainer;

import java.util.ArrayList;
import java.util.List;

public class Trainer {

    private String name;
    private int numberOfBadges = 0;

    private List<Pokemon> pokemonList = new ArrayList<>();

    public void addPokemon(Pokemon pokemon) {
        this.pokemonList.add(pokemon);
    }

    public List<Pokemon> getPokemonList() {
        return pokemonList;
    }
    public void deletePokemon(Pokemon pokemon){
        this.pokemonList.remove(pokemon);
    }

    public int increaseBadges(int numberOfBadges) {
        return numberOfBadges + 1;
    }

    public int getNumberOfBadges() {
        return numberOfBadges;
    }

    public void setNumberOfBadges(int numberOfBadges) {
        this.numberOfBadges = numberOfBadges;
    }

    public String getNameTrainerName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
