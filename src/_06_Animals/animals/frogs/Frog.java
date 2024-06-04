package _06_Animals.animals.frogs;

import _06_Animals.animals.Animal;

public class Frog extends Animal {

    private static final String MAKE_A_SOUND = "Ribbit";

    public Frog(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public String produceSound() {
        return MAKE_A_SOUND;
    }
}
