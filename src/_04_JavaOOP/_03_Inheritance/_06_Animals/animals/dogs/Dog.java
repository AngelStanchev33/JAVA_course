package _04_JavaOOP._03_Inheritance._06_Animals.animals.dogs;

import _04_JavaOOP._03_Inheritance._06_Animals.animals.Animal;

public class Dog extends Animal {

    private static final String MAKE_A_SOUND = "Woof";
    public Dog(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public String produceSound() {
        return MAKE_A_SOUND;
    }
}
