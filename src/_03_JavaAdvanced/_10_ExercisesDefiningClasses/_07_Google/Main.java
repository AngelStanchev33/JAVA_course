package _03_JavaAdvanced._10_ExercisesDefiningClasses._07_Google;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine().trim();

        Map<String, Person> personMap = new LinkedHashMap<>();

        while (!"End".equals(line)) {
            String[] info = line.split("\\s+");

            String personName = info[0];
            String typeOFInfo = info[1];

            personMap.putIfAbsent(personName,
                    new Person(personName, new ArrayList<>(), new ArrayList<>(), new ArrayList<>()));

            switch (typeOFInfo) {
                case "company":
                    String companyName = info[2];
                    String department = info[3];
                    double salary = Double.parseDouble(info[4]);
                    Company company = new Company(companyName, department, salary);
                    personMap.get(personName).setCompany(company);
                    break;
                case "pokemon":
                    String pokemonName = info[2];
                    String pokemonType = info[3];
                    Pokemon pokemon = new Pokemon(pokemonName,pokemonType);
                    personMap.get(personName).getPokemonList().add(pokemon);
                    break;
                case "parents":
                    String parentName = info[2];
                    String parentBirthday = info[3];
                    Parents parents = new Parents(parentName,parentBirthday);
                    personMap.get(personName).getParentList().add(parents);
                    break;
                case "children":
                    String childName = info[2];
                    String childBirthday = info[3];
                    Children children = new Children(childName,childBirthday);
                    personMap.get(personName).getChildrenList().add(children);
                    break;
                case "car":
                    String carName = info[2];
                    String carSpeed = info[3];
                    Car car = new Car(carName,carSpeed);
                    personMap.get(personName).setCar(car);
                    break;
            }
            line = scanner.nextLine().trim();

        }
        personMap.get(scanner.nextLine()).printFormat();
    }
}
