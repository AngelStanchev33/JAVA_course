import java.util.Scanner;

public class _06_BasketballTournament {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int totalMatches = 0;
        double winCount = 0;
        double lostCount = 0;

        while (!"End of tournaments".equals(command)){
            int numOfMatches = Integer.parseInt(scanner.nextLine());

            for (int i = 1; i <= numOfMatches; i++) {
                int desyPoints = 0;
                int enemyPoints = 0;
                totalMatches++;

                for (int j = 0; j < numOfMatches / 2; j++) {
                    int pointOfDessy = Integer.parseInt(scanner.nextLine());
                    int pointsOfEnemy = Integer.parseInt(scanner.nextLine());
                    desyPoints += pointOfDessy;
                    enemyPoints += pointsOfEnemy;
                }

                if (desyPoints > enemyPoints){
                    winCount++;
                    System.out.printf("Game %d of tournament %s: win with %d points.%n", i, command, desyPoints - enemyPoints);
                }
                else {
                    lostCount++;
                    System.out.printf("Game %d of tournament %s: lost with %d points.%n", i, command, enemyPoints - desyPoints);
                }
            }
            command = scanner.nextLine();
        }

        System.out.printf("%.2f%% matches win%n", (winCount / totalMatches) * 100);
        System.out.printf("%.2f%% matches lost%n", (lostCount / totalMatches) * 100);
    }
}
