import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countEasternBread = Integer.parseInt(scanner.nextLine());
        String bestBakerName = "";
        int bestBakerPoints = Integer.MIN_VALUE;

        for (int i = 0; i < countEasternBread; i++) {
            String bakerName = scanner.nextLine();
            int points = 0;
            String command = scanner.nextLine();

            while (!"Stop".equals(command)) {
                points += Integer.parseInt(command);
                command = scanner.nextLine();
            }

            System.out.printf("%s has %d points.%n", bakerName, points);

            if (points > bestBakerPoints) {
                bestBakerName = bakerName;
                bestBakerPoints = points;
                System.out.printf("%s is the new number 1!%n", bestBakerName);
            }
        }

        System.out.printf("%s won the competition with %d points!\n", bestBakerName, bestBakerPoints);
    }
}
