package _03_JavaAdvanced._10_ExercisesDefiningClasses._07_Google;

public class Children {

    private String childName;
    private String childBirthday;


    public Children(String childName, String childBirthday) {
        this.childName = childName;
        this.childBirthday = childBirthday;
    }

    @Override
    public String toString() {
        return String.format("%s %s",childName,childBirthday);
    }
}
