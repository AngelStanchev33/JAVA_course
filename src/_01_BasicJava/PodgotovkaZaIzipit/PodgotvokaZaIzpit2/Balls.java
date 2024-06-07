package _01_BasicJava.PodgotovkaZaIzipit.PodgotvokaZaIzpit2;

import java.util.Scanner;

public class Balls {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int ballNumber = Integer.parseInt(scanner.nextLine());

        int redBallNumber= 0;
        int orangeBallNumber= 0;
        int yellowBallNumber= 0;
        int whiteBallNumber= 0;
        int otherBallNumber= 0;
        int blackDividedBallNumber = 0;


        int points = 0;
        for (int i = 0; i <ballNumber ; i++) {
            String ballColour = scanner.nextLine().trim();


            if ("red".equals(ballColour)){
                points += 5;
                redBallNumber++;
            }
            else if ("orange".equals(ballColour)){
                points += 10;
                orangeBallNumber++;
            }
            else  if ("yellow".equals(ballColour)){
                points += 15;
                yellowBallNumber++;
            }
            else if ("white".equals(ballColour)){
                points += 20;
                whiteBallNumber++;
            }
            else if ("black".equals(ballColour)){
                points = points/2;
                blackDividedBallNumber++;
            }
            else {otherBallNumber++;}
        }
    System.out.printf("Total points: %d%n",points);
        System.out.printf("Red balls: %d%n",redBallNumber);
        System.out.printf("Orange balls: %d%n",orangeBallNumber);
        System.out.printf("Yellow balls: %d%n",yellowBallNumber);
        System.out.printf("White balls: %d%n",whiteBallNumber);
        System.out.printf("Other colors picked: %d%n",otherBallNumber);
        System.out.printf("Divides from black balls: %d%n",blackDividedBallNumber);


    }
}
