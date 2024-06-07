package _01_BasicJava.PoSlojniProverki;

import java.util.Scanner;

public class RabotnoVreme {
    public static void main(String[] args) {

        //Да се напише програма, която чете час от денонощието(цяло число) и ден от седмицата(текст) - въведени от
        // потребителя и проверява дали офисът на фирма е отворен, като работното време на офисът е от 10-18 часа, от
        // понеделник до събота включителн
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        String dayofWeek = scanner.nextLine();


        if (hour > 10 && hour < 18 && dayofWeek.equals("Monday")){
            System.out.println("open");}
        else if (hour > 10 && hour < 18 && dayofWeek.equals("Thuesday")){
            System.out.println("open");
        }
        else if (hour > 10 && hour < 18 && dayofWeek.equals("Wendsay")){
            System.out.println("open");
        }
        else if (hour > 10 && hour < 18 && dayofWeek.equals("Thursday")){
            System.out.println("open");
        }
        else if (hour > 10 && hour < 18 && dayofWeek.equals("Friday")) {
            System.out.println("open");
        }
        else if (hour > 10 && hour < 18 && dayofWeek.equals("Saturday")) {
            System.out.println("open");

        }
        else {System.out.println("closed");}




        }
    }

