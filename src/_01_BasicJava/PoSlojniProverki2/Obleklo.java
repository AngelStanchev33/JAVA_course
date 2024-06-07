package _01_BasicJava.PoSlojniProverki2;

import java.util.Scanner;

public class Obleklo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int degrees = Integer.parseInt(scanner.nextLine());
        String dayTime = scanner.nextLine();
        String outfit = "";
        String shoes = "";

        if (dayTime.equals("Morning")) {
            if (degrees >= 10 && degrees <= 18){
                outfit = "Sweatshirt";
                shoes = "Sweatshirt";
            } else if (degrees > 18 &&degrees <= 24) {
                outfit = "Shirt";
                shoes = "Shoes";
            }else if (degrees > 25) {
                outfit = "T-Shirt";
                shoes = "Sandals";
            }


        }
    }
}
