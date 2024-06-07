package _01_BasicJava.PodgotovkaZaIzipit.PodgotovkaZaIzpit5;

import java.util.Scanner;

public class _04_MovieRating {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numOfMovies = Integer.parseInt(scanner.nextLine());
            double bestRating = Double.MIN_VALUE;
        double worstRating = Double.MAX_VALUE;
        String bestMovie = "";
        String worstMovie = "";
        double rating= 0;

        for (int i = 0; i <numOfMovies ; i++) {
            String movieName = scanner.nextLine();
            double ratingOfMovie = Double.parseDouble(scanner.nextLine());
            rating += ratingOfMovie;

            if (ratingOfMovie > bestRating){
                bestMovie = movieName;
                bestRating = ratingOfMovie;
            }
            if (ratingOfMovie < worstRating){
                worstMovie = movieName;
                worstRating = ratingOfMovie;
            }
        }
        double middleRating = rating / numOfMovies;

        if (numOfMovies ==0){
            return;
        }

        System.out.printf("%s is with highest rating: %.1f\n",bestMovie,bestRating);
        System.out.printf("%s is with lowest rating: %.1f\n",worstMovie,worstRating);
        System.out.printf("Average rating: %.1f",middleRating);

    }
}
