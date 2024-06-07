package _01_BasicJava.PoSlojniProverki;

import java.util.Scanner;

public class ObrushteniePolVuzrast {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        String gender = scanner.nextLine();

        if (gender.equals("m")) {
        if (age >= 16){
        System.out.println("Mr");
        }
        else System.out.println("Master");}

        else if (gender.equals("f")){
            if (age >=16){
                System.out.println("Ms.");}
            else {System.out.println("Miss");


            }
        }



    }
}
