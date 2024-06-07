package _02_JavaFundamentals._09_ObjectAndClassesExhercise._05_Students;

public class Student {
    String fistName;
    String lastName;
    double grade;

    public Student(String fistName, String lastName, double grade) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.grade = grade;
    }

    public String getFistName() {
        return fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return String.format("%s %s: %.2f",
                this.fistName,this.lastName,this.grade);
    }
}
