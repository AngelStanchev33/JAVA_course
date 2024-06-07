package _02_JavaFundamentals.MidExamExtra;

import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double studentCount = Double.parseDouble(scanner.nextLine());
        double lectureCount = Double.parseDouble(scanner.nextLine());
        double initialBonus = Double.parseDouble(scanner.nextLine());

        double maxBonus = Double.MIN_VALUE;
        double lectureAttendance = Double.MIN_VALUE;

        double totalBonus = 0;
        for (int i = 0; i < studentCount; i++) {
            double attendanceStudent = Double.parseDouble(scanner.nextLine());
            totalBonus = Math.ceil(totalBonus);

            totalBonus = (attendanceStudent / lectureCount) * (5 + initialBonus);
            if (totalBonus > maxBonus) {
                maxBonus = totalBonus;
                lectureAttendance = attendanceStudent;
            }
        }

        System.out.printf("Max Bonus: %.0f.%n",Math.ceil(maxBonus));
        System.out.printf("The student has attended %.0f lectures.%n",lectureAttendance);
    }
}
