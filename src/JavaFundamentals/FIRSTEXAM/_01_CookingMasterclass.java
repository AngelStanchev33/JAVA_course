package JavaFundamentals.FIRSTEXAM;

import java.util.Scanner;

public class _01_CookingMasterclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceFlourPerPack = Double.parseDouble(scanner.nextLine());
        double priceEggPerEgg = Double.parseDouble(scanner.nextLine());
        double priceApronPerApron = Double.parseDouble(scanner.nextLine());

        double apronExtra = students * 0.20;
        int roundApronExtra = (int) Math.ceil(apronExtra);
        double totalApronExtra = students + roundApronExtra;

        double totalApron = priceApronPerApron * totalApronExtra;

        int freeBagsOfFlour = 0;
        for (int i = 1; i <= students; i++) {
            if (i % 5 == 0) {
                freeBagsOfFlour++;
            }
        }

        double flourCount = students - freeBagsOfFlour;
        double totalFlour = priceFlourPerPack * flourCount;


        double totalEggs = (students * 10) * priceEggPerEgg;

        double total = totalApron + totalFlour + totalEggs;

        if (total <= budget){
            System.out.printf("Items purchased for %.2f$.%n",total);
        }
        else {
            System.out.printf("%.2f$ more needed.%n",total - budget);
        }


    }
}
