package _04_JavaOOP._03_Inheritance._06_Animals.animals;

public class Animal {

    private String name;
    private int age;
    private String gender;


    public Animal(String name, int age, String gender) {
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
    }

    private void setName(String name) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.name = name;
    }


    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.age = age;
    }

    public void setGender(String gender) {
        if (gender == null || gender.isBlank() || gender.isEmpty()) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String produceSound() {
        return "";

    }

    @Override
    public String toString() {
        return String.format("""
                        %s
                        %s %d %s
                        %s""",
                this.getClass().getSimpleName(),
                this.name,
                this.age,
                this.gender,
                produceSound());
    }
}

