package _04_JavaOOP._02_Encapsulation._04_PizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] pizzaParts = scanner.nextLine().split("\\s+");
        String name = pizzaParts[1];
        int numOfTopping = Integer.parseInt(pizzaParts[2]);

        Pizza pizza = new Pizza(name, numOfTopping);

        String[] doughParts = scanner.nextLine().split("\\s+");
        String flourType = doughParts[1];
        String bakingTechnique = doughParts[2];
        double weightInGramsDough = Double.parseDouble(doughParts[3]);

        Dough dough = new Dough(flourType, bakingTechnique, weightInGramsDough);
        pizza.setDough(dough);

        String command = scanner.nextLine();

        while (!"END".equals(command)) {
            String[] toppingPars = command.split("\\s+");
            String toppingType = toppingPars[1];
            double weightInGramsTopping = Double.parseDouble(toppingPars[2]);

            Topping topping = new Topping(toppingType, weightInGramsTopping);
            pizza.addTopping(topping);

            command = scanner.nextLine();
        }
       System.out.printf("%s - %.2f",pizza.getName(),pizza.getOverallCalories());
    }
}
