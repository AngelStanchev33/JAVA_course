package _01_BasicJava.WhiileCycle2;

import java.util.Scanner;

public class _03_Vacation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double exursionPrice = Double.parseDouble(scanner.nextLine());
        double availableAmount = Double.parseDouble(scanner.nextLine());
        boolean spendAlot =false;
        int dayz = 0;

        int spendcount = 0;

        while (availableAmount < exursionPrice){
            dayz++;
            String command = scanner.nextLine();
            double amount = Double.parseDouble(scanner.nextLine());

            switch (command) {
                case  "spend":
                    availableAmount -= amount;
                    ++spendcount;
                    if (spendcount ==5){
                        spendAlot = true;

                    }
                    if (availableAmount <0){
                        availableAmount = 0;
                    }
                    break;

                case  "save":
                    availableAmount += amount;
                    spendcount = 0;
                    break;
            }
            if (spendAlot){
                break;
            }

        }
        if (spendAlot){
            System.out.println("You can't save the money. 5");
            System.out.println(dayz);
        }
        else {System.out.printf("You saved the money for %d day",dayz);
        }

    }
}
