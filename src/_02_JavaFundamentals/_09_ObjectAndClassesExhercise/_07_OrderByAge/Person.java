package _02_JavaFundamentals._09_ObjectAndClassesExhercise._07_OrderByAge;

public class Person {
    String name;
    String ID;
    int age;

    public Person(String name, String ID, int age) {
        this.name = name;
        this.ID = ID;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s with ID: %s is %d years old.",
                this.name,this.ID,this.age);
    }
}
