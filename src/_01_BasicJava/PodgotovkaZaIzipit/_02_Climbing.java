package _01_BasicJava.PodgotovkaZaIzipit;

import java.util.Scanner;

public class _02_Climbing {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double recordInSec= Double.parseDouble(scanner.nextLine());
        double distanceInM= Double.parseDouble(scanner.nextLine());
        double timeForOneM= Double.parseDouble(scanner.nextLine());

        double climb = distanceInM *timeForOneM;
        double slow = Math.floor(distanceInM / 50)* 30;
        double totalTime = climb + slow;

        if (totalTime < recordInSec){
            System.out.printf(" Yes! The new record is %.2f seconds.",totalTime);
        }
        else { System.out.printf("No! He was %.2f seconds slower.",Math.abs(recordInSec - totalTime));
    }
}
}
