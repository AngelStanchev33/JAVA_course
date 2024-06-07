package _01_BasicJava.PodgotovkaZaIzipit.PodgotovkaZaIzipit4;

import java.util.Scanner;

public class _05_Club {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double profit = Double.parseDouble(scanner.nextLine());

        double total = 0;

        String input = scanner.nextLine().trim();
        while (!("Party!").equals(input)){
            int numOfCocktails = Integer.parseInt(scanner.nextLine());
            int inputLenght = input.length();


            double tab = inputLenght * numOfCocktails;
            if (tab % 2 !=0){
                tab -= tab * 0.25;
            }
            total +=tab;
            if (total >=profit){
                break;
            }

            input = scanner.nextLine();
        }
        if (total < profit){
            System.out.printf("We need %.2f leva more.%n",profit - total);
        }
        else {
            System.out.print("Target acquired.\n");
        }
        System.out.printf("Club income - %.2f leva.",total);



    }
}

