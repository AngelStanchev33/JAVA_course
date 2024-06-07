import java.util.Scanner;

public class _04_TrainTheTrainers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int jury = Integer.parseInt(scanner.nextLine());
        double totalGrades = 0;
        int presentationCount = 0;

        String input = scanner.nextLine();
        while (!"finish".equalsIgnoreCase(input)){

            double gradeSum = 0;

            for (int grade = 1; grade <= jury ; grade++) {
                double currentGrade = Double.parseDouble(scanner.nextLine());
                gradeSum += currentGrade;
                totalGrades += currentGrade;
                presentationCount++;
            }

            System.out.println();
            System.out.printf("%s - %.2f.", input, gradeSum / jury);



            input = scanner.nextLine();
        }
        System.out.println();

        if (input.equalsIgnoreCase("finish")){
            System.out.printf("Student's final assessment is %.2f.", totalGrades / presentationCount);
        }
    }
}
