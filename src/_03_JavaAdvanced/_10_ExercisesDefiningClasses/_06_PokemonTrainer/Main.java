package _03_JavaAdvanced._10_ExercisesDefiningClasses._06_PokemonTrainer;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine().trim();

        Map<String, Trainer> trainerMap = new LinkedHashMap<>();

        while (!"Tournament".equals(line)) {
            String[] tokens = line.split("\\s+");

            String trainerName = tokens[0];
            String pokemonName = tokens[1];
            String pokemonElement = tokens[2];
            int pokemonHealth = Integer.parseInt(tokens[3]);

            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);

            trainerMap.putIfAbsent(trainerName, new Trainer());
            trainerMap.get(trainerName).addPokemon(pokemon);

            line = scanner.nextLine().trim();

        }
        line = scanner.nextLine().trim();

        while (!"End".equals(line)) {

            boolean isFound = false;
            if (line.equals("Fire")) {
                for (Map.Entry<String, Trainer> entry : trainerMap.entrySet()) {
                    int matches = 0;
                    List<Pokemon> pokemonList = entry.getValue().getPokemonList();
                    for (Pokemon pokemon : pokemonList) {
                        if (pokemon.getElement().equals("Fire")) {
                            matches++;
                        }
                    }
                    if (matches >= 1) {
                        entry.getValue().setNumberOfBadges(entry.getValue().increaseBadges(entry.getValue().getNumberOfBadges()));
                    } else {
                        for (Pokemon pokemon : entry.getValue().getPokemonList()) {
                            int health = pokemon.getHealth();
                            health -= 10;
                            pokemon.setHealth(health);

                        }
                    }
                }
            } else if (line.equals("Water")) {
                for (Map.Entry<String, Trainer> entry : trainerMap.entrySet()) {
                    int matches = 0;
                    List<Pokemon> pokemonList = entry.getValue().getPokemonList();
                    for (Pokemon pokemon : pokemonList) {
                        if (pokemon.getElement().equals("Water")) {
                            matches++;
                        }
                    }
                    if (matches >= 1) {
                        entry.getValue().setNumberOfBadges(entry.getValue().increaseBadges(entry.getValue().getNumberOfBadges()));
                    } else {
                        for (Pokemon pokemon : entry.getValue().getPokemonList()) {
                            int health = pokemon.getHealth();
                            health -= 10;
                            pokemon.setHealth(health);

                        }
                    }
                }

            } else {
                for (Map.Entry<String, Trainer> entry : trainerMap.entrySet()) {
                    int matches = 0;
                    List<Pokemon> pokemonList = entry.getValue().getPokemonList();
                    for (Pokemon pokemon : pokemonList) {
                        if (pokemon.getElement().equals("Electricity")) {
                            matches++;
                        }
                    }
                    if (matches >= 1) {
                        entry.getValue().setNumberOfBadges(entry.getValue().increaseBadges(entry.getValue().getNumberOfBadges()));
                    } else {
                        for (Pokemon pokemon : entry.getValue().getPokemonList()) {
                            int health = pokemon.getHealth();
                            health -= 10;
                            pokemon.setHealth(health);

                        }
                    }
                }
            }
            line = scanner.nextLine().trim();
        }

        for (Map.Entry<String, Trainer> entry : trainerMap.entrySet()) {
            entry.getValue().getPokemonList().removeIf(pokemon -> pokemon.getHealth() <= 0);
        }
        trainerMap.entrySet()
                .stream()
                .sorted((e1, e2) -> {
                    int result = Integer.compare(e2.getValue().getNumberOfBadges(), e1.getValue().getNumberOfBadges());
                    if (result != 0) { // Проверка дали резултатът е различен от 0
                        return result; // Ако е различен от 0, връщаме резултата
                    }
                    return 0;
                })
                .forEach(e -> {
                    String trainerName = e.getKey();
                    Trainer trainer = e.getValue();
                    System.out.printf("%s %d %d%n", trainerName, trainer.getNumberOfBadges(), trainer.getPokemonList().size());
                });
    }
}
