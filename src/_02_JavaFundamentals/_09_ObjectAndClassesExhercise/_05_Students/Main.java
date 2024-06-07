package _02_JavaFundamentals._09_ObjectAndClassesExhercise._05_Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentCount = Integer.parseInt(scanner.nextLine());
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < studentCount; i++) {

            String[] information = scanner.nextLine().split("\\s+");
            String firstName = information[0];
            String lastName = information[1];
            double grade = Double.parseDouble(information[2]);

            Student student = new Student(firstName,lastName,grade);
            students.add(student);
        }

        List<Student> sortedStudents = students
                .stream()
                .sorted(Comparator.comparing(Student::getGrade).reversed())
                .toList();

        for (Student sortedStudent : sortedStudents) {
            System.out.println(sortedStudent);
            
        }
    }
}

