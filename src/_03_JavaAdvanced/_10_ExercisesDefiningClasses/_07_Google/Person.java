package _03_JavaAdvanced._10_ExercisesDefiningClasses._07_Google;

import java.util.List;

public class Person {

    private final String personName;
    private final List<Pokemon> pokemons;
    private final List<Parents> parents;
    private final List<Children> children;
    private Company company;
    private  Car car;


    public Person(String personName, List<Pokemon> pokemons, List<Parents> parents, List<Children> children) {
        this.personName = personName;
        this.pokemons = pokemons;
        this.parents = parents;
        this.children = children;
    }
    public List<Pokemon> getPokemonList() {
        return pokemons;
    }

    public List<Parents> getParentList() {
        return parents;
    }

    public List<Children> getChildrenList() {
        return children;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void printFormat(){
        System.out.println(personName);
        System.out.println("Company:");
        if(company!=null) {
            System.out.println(company.toString());
        }
        System.out.println("Car:");
        if(car!=null) {
            System.out.println(car.toString());
        }
        System.out.println("Pokemon:");
        if(!getPokemonList().isEmpty()) {
            getPokemonList().forEach(pokemon -> System.out.printf("%s%n", pokemon.toString()));
        }
        System.out.println("Parents:");
        if(!getParentList().isEmpty()) {
            getParentList().forEach(parent -> System.out.printf("%s%n", parent.toString()));
        }
        System.out.println("Children:");
        if(!getChildrenList().isEmpty()) {
            getChildrenList().forEach(children -> System.out.printf("%s%n", children.toString()));
        }
    }
}

