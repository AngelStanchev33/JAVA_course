package _04_JavaOOP._03_Inheritance._06_Animals.animals.cats;

import _04_JavaOOP._03_Inheritance._06_Animals.animals.Animal;
public class Cat extends Animal {

    private static final String MAKE_A_SOUND = "Meow meow";
    public Cat(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public String produceSound() {
        return MAKE_A_SOUND;
    }
}
