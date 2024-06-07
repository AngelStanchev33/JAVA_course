package _02_JavaFundamentals._10_MidExamPrep;

import java.util.Scanner;

public class _01_ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceWithoutTaxTotal = 0;
        double totalTaxes = 0;
        double total = 0;

        String command = scanner.nextLine();
        while (!"special".equals(command)&&!"regular".equals(command)){
            double priceConvertToDouble = Double.parseDouble(command);

            if (priceConvertToDouble < 0){
                System.out.println("Invalid price!");
                command = scanner.nextLine();
                continue;
            }
            priceWithoutTaxTotal+= priceConvertToDouble;

            command = scanner.nextLine();
        }
        totalTaxes = priceWithoutTaxTotal * 0.20;
        total = priceWithoutTaxTotal + totalTaxes;

        if (command.equals("special")){
            total -= total * 0.10;
        }
        if (total <= 0){
            System.out.print("Invalid order!");
        }
        else{
            System.out.printf(
                    "Congratulations you've just bought a new computer!%n" +
                            "Price without taxes: %.2f$%n" +
                            "Taxes: %.2f$%n" +
                            "-----------%n" +
                            "Total price: %.2f$",priceWithoutTaxTotal,totalTaxes,total);
        }
    }
}
