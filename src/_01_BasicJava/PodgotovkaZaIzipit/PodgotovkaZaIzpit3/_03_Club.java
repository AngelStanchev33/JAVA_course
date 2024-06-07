import java.util.Scanner;

public class _03_Club {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String typeOfCoffee = scanner.nextLine().trim();
        String checkForSugar = scanner.nextLine().trim();
        int numOFDrinks = Integer.parseInt(scanner.nextLine().trim());

        double price = 0;

        switch (typeOfCoffee) {
            case "Espresso":
                if ("Without".equals(checkForSugar)) {
                    price = 0.90;
                    price -= price * 35 / 100;
                } else if ("Normal".equals(checkForSugar)) {
                    price = 1.0;
                } else if ("Extra".equals(checkForSugar)) {
                    price = 1.20;
                }

                price *= numOFDrinks; // Умножаваме цената по броя на напитките

                if (numOFDrinks >= 5) {
                    price -= price * 25 / 100; // Отстъпка за поне 5 броя Espresso
                }
                break;
            case "Cappuccino":
                if ("Without".equals(checkForSugar)) {
                    price = 1.00;
                    price -= price * 35 / 100;
                } else if ("Normal".equals(checkForSugar)) {
                    price = 1.20;
                } else if ("Extra".equals(checkForSugar)) {
                    price = 1.60;
                }
                price *= numOFDrinks;

                break;
            case "Tea":
                if ("Without".equals(checkForSugar)) {
                    price = 0.50;
                    price -= price * 35 / 100;
                } else if ("Normal".equals(checkForSugar)) {
                    price = 0.60;
                } else if ("Extra".equals(checkForSugar)) {
                    price = 0.70;
                }
                price *= numOFDrinks;
                break;
        }

        if (price >= 15) {
            price -= price * 20 / 100; // Отстъпка при сума над 15 лв.
        }

        System.out.printf("You bought %d cups of %s for %.2f lv.", numOFDrinks, typeOfCoffee, price);
    }
}
