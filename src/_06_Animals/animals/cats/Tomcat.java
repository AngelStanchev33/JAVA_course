package _06_Animals.animals.cats;

public class Tomcat extends Cat {

    private static final String MAKE_A_SOUND = "MEOW";
    private static final String GENDER = "Male";
    public Tomcat(String name, int age) {
        super(name, age, GENDER);
    }

    @Override
    public String produceSound() {
        return MAKE_A_SOUND;
    }
}
