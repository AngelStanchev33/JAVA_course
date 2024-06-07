import java.util.Scanner;

public class _01_SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstEmployeeEfficiency = Integer.parseInt(scanner.nextLine());
        int secondEmployeeEfficiency = Integer.parseInt(scanner.nextLine());
        int thirdEmployeeEfficiency = Integer.parseInt(scanner.nextLine());
        int studentCount = Integer.parseInt(scanner.nextLine());

        int totalEfficiency = firstEmployeeEfficiency + secondEmployeeEfficiency + thirdEmployeeEfficiency;
        int hourCount = 0;

        while (studentCount > 0) {
            studentCount -= totalEfficiency;
            hourCount++;
            if (hourCount % 4 == 0) {
                hourCount++;
            }
        }

        System.out.printf("Time needed: %dh.", hourCount);
    }
}
