import java.util.Scanner;

public class _04_Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double startingPoints = Double.parseDouble(scanner.nextLine());
        int judges = Integer.parseInt(scanner.nextLine());

        double totalScore = startingPoints;

        for (int i = 0; i < judges; i++) {
            String judgeName = scanner.nextLine();
            double judgePoints = Double.parseDouble(scanner.nextLine());

            //когато трябва да умножаваме по дължината на стринг
            double points = judgeName.length() * judgePoints / 2;
            totalScore += points;

            if (totalScore > 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, totalScore);
                return; //
            }
        }

        double neededPoints = 1250.5 - totalScore;
        System.out.printf("Sorry, %s you need %.1f more!", actorName, neededPoints);
    }
}
