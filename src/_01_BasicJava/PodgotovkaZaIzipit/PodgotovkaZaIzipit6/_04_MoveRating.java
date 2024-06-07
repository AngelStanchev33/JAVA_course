import java.util.Scanner;

public class _04_MoveRating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int movieCount = Integer.parseInt(scanner.nextLine());

        String movieWithBestRating = "";
        String movieWithTheWorstRating = "";
        double worstRating = Double.MAX_VALUE;
        double bestRating = Double.MIN_VALUE;
        double totalRating = 0;

        for (int i = 0; i < movieCount; i++) {
            String movieName = scanner.nextLine();
            double movieRating = Double.parseDouble(scanner.nextLine());

            if (movieRating > bestRating) {
                bestRating = movieRating;
                movieWithBestRating = movieName;
            }
            if (movieRating < worstRating) {
                worstRating = movieRating;
                movieWithTheWorstRating = movieName;
            }
            totalRating += movieRating;
        }

        double averageRating = totalRating / movieCount;

        System.out.printf("%s is with highest rating: %.2f%n", movieWithBestRating, bestRating);
        System.out.printf("%s is with lowest rating: %.2f%n", movieWithTheWorstRating, worstRating);
        System.out.printf("Average rating: %.1f%n", averageRating);
    }
}
