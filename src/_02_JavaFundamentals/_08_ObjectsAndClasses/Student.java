package _02_JavaFundamentals._08_ObjectsAndClasses;

import java.util.List;

public class Student {

    private String fistName;
    private String lastName;
    private int age;
    private String city;

    public Student() {
    }

    public Student(String firstName, String lastName, int age, String city) {
    }

    public String getFistName() {
        return fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCity(String city) {
        this.city = city;
    }
    private static boolean IsStudentExist (List<Student>students,String fistName,String lastName){
        for (Student student : students) {
            if (student.getFistName().equals(fistName)&& student.getLastName().equals(lastName)){
                return true;
            }
        }
        return false;
    }


}