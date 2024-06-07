import java.util.Scanner;

public class _08_Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Четем името на ученика
        String studentName = scanner.nextLine();

        // Променлива за броя на класовете
        int grade = 1;

        // Променлива за общата оценка
        double totalGrade = 0;

        // Променлива за изключванията
        int excludedCount = 0;

        // Булева променлива за изключването на ученика
        boolean isExcluded = false;

        // Итерация през всички 12 класа
        while (grade <= 12) {
            // Четем текущата оценка
            double currentGrade = Double.parseDouble(scanner.nextLine());

            // Проверяваме дали оценката е под 4.00
            if (currentGrade < 4.00) {
                // Увеличаваме броя на изключванията
                excludedCount++;
                // Ако ученикът е бил изключен повече от 1 път, задаваме флага за изключване
                if (excludedCount > 1) {
                    isExcluded = true;
                    // Прекъсваме цикъла, защото ученикът е изключен
                    break;
                }
            } else {
                // Добавяме оценката към общата оценка
                totalGrade += currentGrade;
                // Прехвърляме се в следващия клас
                grade++;
            }
        }

        // Ако ученикът е изключен, изписваме съобщението
        if (isExcluded) {
            System.out.printf("%s has been excluded at %d grade%n", studentName, grade);
        } else {
            // Изчисляваме средната оценка
            double averageGrade = totalGrade / 12;
            // Изписваме съобщение за завършване на ученика
            System.out.printf("%s graduated. Average grade: %.2f%n", studentName, averageGrade);
        }
    }
}