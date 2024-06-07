package _02_JavaFundamentals._09_ObjectAndClassesExhercise._07_OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();

        String input = scanner.nextLine();
        while (!"End".equals(input)){
            String[]data = input.split(" ");
            String name = data[0];
            String ID = data[1];
            int age = Integer.parseInt(data[2]);

            Person person = new Person(name,ID,age);
            people.add(person);

            input =scanner.nextLine();
        }
        List<Person>personList = people
                .stream()
                .sorted(Comparator.comparing(Person::getAge))
                .collect(Collectors.toList());

        for (Person person : personList) {
            System.out.println(person);

        }
    }
}
