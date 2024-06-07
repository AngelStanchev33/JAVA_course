package _01_BasicJava.PodgotovkaZaIzipit.PodgotovkaZaIzpit3;

import java.util.Scanner;

public class _05_MovieStars {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());

        String command = scanner.nextLine();
        while (!"ACTION".equals(command)){

            if (command.length() <= 15){
                double actorSalary = Double.parseDouble(scanner.nextLine());
                budget = budget - actorSalary;
            }
            else {budget -= budget * 20 /100;

            }
            if (budget <0){
                break;
            }
            command = scanner.nextLine();
        }
        if (budget < 0){
            System.out.printf("We need %.2f leva for our actors.",Math.abs(budget));
        }
        else {
            System.out.printf("We are left with %.2f leva.",budget);
        }














        }
        }


