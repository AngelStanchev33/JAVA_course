import java.util.Scanner;

public class _05_AccountBalance {
    public static void main(String[] args) {

        // Създаване на обект Scanner за четене от конзолата
        Scanner scanner = new Scanner(System.in);

        // Инициализиране на променлива за общата сума в сметката
        double totalBalance = 0;

        // Безкраен цикъл, който продължава докато се получи команда "NoMoreMoney"
        while (true) {
            // Четене на вход от конзолата
            String input = scanner.nextLine();

            // Проверка за команда "NoMoreMoney" за прекратяване на цикъла
            if (input.equals("NoMoreMoney")) {
                break;
            }

            // Преобразуване на въведения текст в число
            double amount = Double.parseDouble(input);

            // Проверка за негативна сума
            if (amount < 0) {
                System.out.println("Invalid operation!");
                break;
            }

            // Добавяне на внесената сума към общата сума в сметката
            totalBalance += amount;

            // Извеждане на съобщение за внасянето на сумата
            System.out.printf("Increase: %.2f%n", amount);
        }

        // Извеждане на общата сума в сметката
        System.out.printf("Total: %.2f", totalBalance);
    }
}
