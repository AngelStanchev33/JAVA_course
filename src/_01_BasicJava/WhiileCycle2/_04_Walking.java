import java.util.Scanner;

public class _04_Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int goal = 10000; // Целта за брой стъпки

        int totalSteps = 0; // Общият брой стъпки до момента

        // Вход за брой стъпки за ден
        while (totalSteps < goal) {
            String input = scanner.nextLine();

            if (input.equals("Going home")) {
                int stepsToHome = Integer.parseInt(scanner.nextLine());
                totalSteps += stepsToHome; // Добавяме стъпките до вкъщи
                break; // Излизаме от цикъла, защото завършваме деня
            }

            int stepsToday = Integer.parseInt(input);
            totalSteps += stepsToday; // Добавяме стъпките за деня
        }

        // Изход
        if (totalSteps >= goal) {
            int stepsOverGoal = totalSteps - goal;
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!%n", stepsOverGoal);
        } else {
            int stepsNeeded = goal - totalSteps;
            System.out.printf("%d more steps to reach goal.%n", stepsNeeded);
        }
    }
}
