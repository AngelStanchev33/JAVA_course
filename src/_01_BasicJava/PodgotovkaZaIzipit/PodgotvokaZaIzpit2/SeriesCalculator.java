package _01_BasicJava.PodgotovkaZaIzipit.PodgotvokaZaIzpit2;

import java.util.Scanner;

public class SeriesCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nameOfSeries = scanner.nextLine().trim();
        int numOfSeasons = Integer.parseInt(scanner.nextLine());
        int numOfEpisodes = Integer.parseInt(scanner.nextLine());
        double durationOfEpisode = Double.parseDouble(scanner.nextLine());

        double commercialDuration = (durationOfEpisode * 20)/100.0;
        double totalEpisodeTime = durationOfEpisode + commercialDuration;
        double extraTimeOnSpecialEpisode = numOfSeasons * 10;

        double totalTimeNeededToWatchTheShow = totalEpisodeTime * numOfEpisodes * numOfSeasons + extraTimeOnSpecialEpisode;

        System.out.printf("Total time needed to watch the %s series is %.0f minutes.",nameOfSeries,Math.floor(totalTimeNeededToWatchTheShow));




    }
}
