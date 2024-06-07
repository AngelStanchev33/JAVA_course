package _01_BasicJava.PodgotovkaZaIzipit.PodgotvokaZaIzpit2;

import java.util.Scanner;

public class Skeleton {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double minutesOfControl = Double.parseDouble(scanner.nextLine());
        double secondsOfControl = Double.parseDouble(scanner.nextLine());
        double lenghtInMetersOfChute = Double.parseDouble(scanner.nextLine());
        double secondsOfPassingHundredM = Double.parseDouble(scanner.nextLine());

        double totalTimeOFControlInSeconds = minutesOfControl * 60 + secondsOfControl;
        double timeSlow = lenghtInMetersOfChute / 120;
        double totalTimeSlow = timeSlow * 2.5;
        double MartinsTime = (lenghtInMetersOfChute /100) * secondsOfPassingHundredM - totalTimeSlow;

        if (MartinsTime <= totalTimeOFControlInSeconds){
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.",MartinsTime);
        }
        else {System.out.printf("No, Marin failed! He was %.3f second slower.",
                Math.abs(totalTimeOFControlInSeconds - MartinsTime));

        }
    }
}
