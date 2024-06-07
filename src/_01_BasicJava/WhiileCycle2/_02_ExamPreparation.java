import java.util.Scanner;

public class _02_ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Четене на броя на незадоволителните оценки
        int unsatisfactoryGradesLimit = Integer.parseInt(scanner.nextLine());

        // Прочитане на първата задача и оценката за нея
        String taskName = scanner.nextLine();
        int grade = Integer.parseInt(scanner.nextLine());

        // Променливи за проследяване на статистиката
        int unsatisfactoryGradesCount = 0; // Брой незадоволителни оценки
        double totalScore = 0; // Общ брой точки
        int problemsSolved = 0; // Брой решени задачи
        String lastProblem = ""; // Име на последната задача

        // Цикъл за четене на задачи и оценки
        while (!taskName.equals("Enough")) {
            problemsSolved++; // Увеличаване на броя на решените задачи
            totalScore += grade; // Добавяне на оценката към общия брой точки
            lastProblem = taskName; // Запазване на името на последната задача

            // Проверка за незадоволителна оценка
            if (grade <= 4) {
                unsatisfactoryGradesCount++; // Увеличаване на броя на незадоволителните оценки
                // Проверка дали са достигнати незадоволителните оценки
                if (unsatisfactoryGradesCount == unsatisfactoryGradesLimit) {
                    // Изход и прекратяване на програмата
                    System.out.printf("You need a break, %d poor grades.%n", unsatisfactoryGradesCount);
                    return;
                }
            }

            // Прочитане на следващата задача и оценка за нея
            taskName = scanner.nextLine();
            if (!taskName.equals("Enough")) {
                grade = Integer.parseInt(scanner.nextLine());
            }
        }

        // Изчисляване на средната оценка
        double averageScore = totalScore / problemsSolved;

        // Извеждане на резултатите
        System.out.printf("Average score: %.2f%n", averageScore);
        System.out.printf("Number of problems: %d%n", problemsSolved);
        System.out.printf("Last problem: %s%n", lastProblem);
    }
}
