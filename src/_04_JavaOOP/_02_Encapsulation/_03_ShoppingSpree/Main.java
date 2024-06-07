package _04_JavaOOP._02_Encapsulation._03_ShoppingSpree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Person> personList = new ArrayList<>();
        List<Product> productList = new ArrayList<>();

        if (input.contains(";")) {
            String[] splitInputPerson = input.split(";");
            for (String inputPerson : splitInputPerson) {
                personList.add(parsePerson(inputPerson));
            }

            String[] splitProduct = scanner.nextLine().split(";");
            for (String inputProduct : splitProduct) {
                productList.add(parseProduct(inputProduct));
            }
        } else {
            personList.add(parsePerson(input));

            String productInput = scanner.nextLine();
            productList.add(parseProduct(productInput));
        }

        String command = scanner.nextLine();

        while (!"END".equals(command)) {
            String[] tokens = command.split("\\s+");

            String nameOfPerson = tokens[0];
            String nameOfProduct = tokens[1];

            Person buyer = personList.stream()
                    .filter(person -> person.getName().equals(nameOfPerson))
                    .findFirst()
                    .orElse(null);


            Product products = productList.stream()
                    .filter(product -> product.getName().equals(nameOfProduct))
                    .findFirst()
                    .orElse(null);


            assert buyer != null;
            assert products != null;
            buyer.buyProduct(products);

            command = scanner.nextLine();

        }

        for (Person person : personList) {
            System.out.println(person.toString());
        }


    }

    private static Person parsePerson(String input) {
        String[] personInfo = input.split("=");
        String name = personInfo[0];
        int money = Integer.parseInt(personInfo[1]);
        return new Person(name, money);
    }

    private static Product parseProduct(String input) {
        String[] productInfo = input.split("=");
        String name = productInfo[0];
        int cost = Integer.parseInt(productInfo[1]);
        return new Product(name, cost);
    }
}

