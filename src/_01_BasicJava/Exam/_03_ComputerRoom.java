package _01_BasicJava.Exam;

import java.util.Scanner;

public class _03_ComputerRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int hoursCount = Integer.parseInt(scanner.nextLine());
        int peopleCount = Integer.parseInt(scanner.nextLine());
        String timeOFDay = scanner.nextLine();

        double price = 0;
        double pricePerPearson = 0;

        if (month.equals("march") || month.equals("april") || month.equals("may")) {
            if (timeOFDay.equals("day")) {
                price = 10.50;
            } else if (timeOFDay.equals("night")) {
                price = 8.40;
            }
        } else if (month.equals("june") || month.equals("july") || month.equals("august")) {
            if (timeOFDay.equals("day")) {
                price = 12.60;
            } else if (timeOFDay.equals("night")) {
                price = 10.20;
            }
        }

        if (peopleCount >= 4) {
            price -= price * 0.10;
        }
        if (hoursCount >= 5) {
            price -= price * 0.50;
        }
        double totalPrice = price * peopleCount * hoursCount;

        System.out.printf(
                "Price per person for one hour: %.2f%n", price);
        System.out.printf(
                "Total cost of the visit: %.2f", totalPrice);
    }
}
