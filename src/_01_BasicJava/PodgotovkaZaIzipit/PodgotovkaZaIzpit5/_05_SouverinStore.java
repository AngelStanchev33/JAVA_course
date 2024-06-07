package _01_BasicJava.PodgotovkaZaIzipit.PodgotovkaZaIzpit5;

import java.util.Scanner;

public class _05_SouverinStore {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());

        double productTotal =0;
        int productCount =0;
        boolean budgetExceeded = false;

        String command = scanner.nextLine();
        while (!"Stop".equals(command)){
            double productPrice = Double.parseDouble(scanner.nextLine());
            productCount++;
            if (productCount % 3 ==0){
                productPrice = productPrice/2;
            }
            productTotal +=productPrice;
            if (budget < productTotal){
                budgetExceeded = true;
                break;
            }

            command = scanner.nextLine();
        }
        if (budgetExceeded){
            System.out.println("You don't have enough money!");
            System.out.printf("You need %.2f leva!",Math.abs(budget-productTotal));
        }
        else {
            System.out.printf("You bought %d products for %.2f leva.",productCount,productTotal);
        }


    }


}


