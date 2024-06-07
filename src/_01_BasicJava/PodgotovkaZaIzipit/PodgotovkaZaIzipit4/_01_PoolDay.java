import java.util.Scanner;

public class _01_PoolDay {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numOfPeople = Integer.parseInt(scanner.nextLine());
        double entryFee = Double.parseDouble(scanner.nextLine());
        double sunLoungerPrice = Double.parseDouble(scanner.nextLine());
        double sunUmbrellaPrice = Double.parseDouble(scanner.nextLine());

        double entryFeeTotal = numOfPeople * entryFee;
        int sunLoungersTaken = (int) Math.ceil(numOfPeople * 0.75);
        int sunUmbrellasTaken = (int) Math.ceil(numOfPeople * 0.5);
        double sunLoungerPriceTotal = sunLoungersTaken * sunLoungerPrice;
        double sunUmbrellaPriceTotal =  sunUmbrellasTaken * sunUmbrellaPrice;

        double totalCost = entryFeeTotal + sunLoungerPriceTotal + sunUmbrellaPriceTotal;

        System.out.printf("%.2f lv.", totalCost);
    }
}
