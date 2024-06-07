package _01_BasicJava.PodgotovkaZaIzipit.PodgotovkaZaIzpit3;

import java.util.Scanner;

public class _02_CatWalking {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int minutesOfWalkingPerDay = Integer.parseInt(scanner.nextLine());
        int walkingPerDayCount = Integer.parseInt(scanner.nextLine());
        int caloriesPerDay = Integer.parseInt(scanner.nextLine());

        int totalWalkingTime = minutesOfWalkingPerDay * walkingPerDayCount;
        int burnedCalories = totalWalkingTime * 5;
        int caloriesIntakePerDay = (caloriesPerDay * 50) / 100;

        if (burnedCalories >= caloriesIntakePerDay) {
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", burnedCalories);
        } else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", burnedCalories);
        }
    }
}
