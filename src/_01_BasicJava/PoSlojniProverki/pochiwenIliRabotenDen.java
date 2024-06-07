package _01_BasicJava.PoSlojniProverki;

import java.util.Scanner;

public class pochiwenIliRabotenDen {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String day  = scanner.nextLine();

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wendsay":
            case "Thursday":
            case "Friday":
                System.out.println("Working day");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Dayoff");
                break;
            default:
                System.out.println("Error");
                break;



        }
    }
}
