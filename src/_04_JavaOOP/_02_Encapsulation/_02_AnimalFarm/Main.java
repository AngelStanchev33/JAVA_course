package _04_JavaOOP._02_Encapsulation._02_AnimalFarm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Chicken chicken  = new Chicken(scanner.nextLine(),
                                       Integer.parseInt(scanner.nextLine()));


        System.out.println(chicken.toString());

    }
}
