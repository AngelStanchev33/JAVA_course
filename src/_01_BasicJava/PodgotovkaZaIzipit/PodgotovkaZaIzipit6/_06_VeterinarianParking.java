import java.util.Scanner;

public class _06_VeterinarianParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysCount = Integer.parseInt(scanner.nextLine());
        int hoursCount = Integer.parseInt(scanner.nextLine());

        double totalSum = 0;

        for (int i = 1; i <= daysCount; i++) {
            double totalDay = 0;

            for (int j = 1; j <= hoursCount; j++) {
                double parkingTicketPrice = 0;

                if (i % 2 == 0 && j % 2 != 0) {
                    parkingTicketPrice = 2.50;
                } else if (i % 2 != 0 && j % 2 == 0) {
                    parkingTicketPrice = 1.25;
                } else {
                    parkingTicketPrice = 1.0;
                }

                totalDay += parkingTicketPrice;
            }

            totalSum += totalDay;
            System.out.printf("Day: %d - %.2f leva%n", i, totalDay);
        }

        System.out.printf("Total: %.2f", totalSum);
    }
}
