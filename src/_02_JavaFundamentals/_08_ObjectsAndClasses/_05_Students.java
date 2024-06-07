package _02_JavaFundamentals._08_ObjectsAndClasses;

        import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;

public class _05_Students {
    public static void main(String[] args) {
        Scanner  scanner= new Scanner(System.in);

        String line = scanner.nextLine();
        List<Student> students = new ArrayList<>();


        while (!line.equals("end")){
            String[] parts =line.split(" ");

            String firstName = parts[0];
            String lastName = parts[1];
            int age = Integer.parseInt(parts[2]);
            String city = parts[3];

            Student student = new Student();

            student.setFistName(firstName);
            student.setLastName(lastName);
            student.setAge(age);
            student.setCity(city);

            students.add(student);

            line = scanner.nextLine();

            //презаписва ако се повтаря името
            if (isStudentExist(students,firstName,lastName)){
                Student student1 = getStudend9((List<Student>) student,firstName,lastName);
            }
            else {
                Student student1 =
                        new Student(firstName,lastName,age,city);
                students.add(student1);
            }
        }

        String city = scanner.nextLine();
        for (Student student : students) {
            if (student.getCity().equals(city)){
                System.out.printf("%s %s is %d years old.%n",student.getFistName(),student.getLastName(),student.getAge());
            }
        }
    }

    private static Student getStudend9(List<Student>student, String firstName, String lastName) {
        Student existStudent = null;

        for (Student student1 : student) {
            if (student1.getFistName().equals(firstName) && student1.getLastName().equals(lastName)){
                existStudent = student1;
            }
        }
        return existStudent;
    }

    private  static boolean isStudentExist (List<Student>students,String firstName , String lastName){
        for (Student student : students) {
            if (student.getFistName().equals(firstName)&&student.getLastName().equals(lastName)){
                return  true;
            }
        }
        return false;
    }

}

