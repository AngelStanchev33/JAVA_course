package _06_Animals.animals.cats;

public class Kitten extends Cat {

    private static final String MAKE_A_SOUND = "Meow";
    private static final String GENDER = "Female";
    public Kitten(String name, int age) {
        super(name, age,GENDER);
    }

    @Override
    public String produceSound() {
        return MAKE_A_SOUND;
    }
}
