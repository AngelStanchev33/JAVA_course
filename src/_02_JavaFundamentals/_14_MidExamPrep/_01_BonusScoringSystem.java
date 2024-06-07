package _02_JavaFundamentals._14_MidExamPrep;

import java.util.Scanner;

public class _01_BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentsCount = Integer.parseInt(scanner.nextLine());
        int lecturesCount = Integer.parseInt(scanner.nextLine());
        int initialBonus = Integer.parseInt(scanner.nextLine());

        double maxBonus = Integer.MIN_VALUE;
        int currentAttendance = 0;

        for (int i = 0  ; i < studentsCount; i++) {
            int attendance = Integer.parseInt(scanner.nextLine());

            double bonus =  (attendance * 1.0 / lecturesCount) * (5 + (initialBonus));
            if (bonus > maxBonus){
                maxBonus= bonus;
                currentAttendance = attendance;
            }
        }

        int roundNumber  = (int) Math.ceil(maxBonus);
        System.out.printf("Max Bonus: %d.%n",roundNumber);
        System.out.printf("The student has attended %d lectures.",currentAttendance);
    }
}