import java.util.Scanner;

public class _03_TravelAgency {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nameOfCity = scanner.nextLine();
        String typeOfDeal = scanner.nextLine();
        String vipOrNo = scanner.nextLine();
        int daysBooked = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (nameOfCity) {
            case "Bansko":
            case "Borovets":
                switch (typeOfDeal) {
                    case "noEquipment":
                        price = 80.0;
                        if (vipOrNo.equals("yes")) {
                            price -= price * 0.05;
                        }
                        break;
                    case "withEquipment":
                        price = 100.0;
                        if (vipOrNo.equals("yes")) {
                            price -= price * 0.10;
                        }
                        break;
                }
                break;
            case "Varna":
            case "Burgas":
                switch (typeOfDeal) {
                    case "noBreakfast":
                        price = 100.0;
                        if (vipOrNo.equals("yes")) {
                            price -= price * 0.07;
                        }
                        break;
                    case "withBreakfast":
                        price = 130.0;
                        if (vipOrNo.equals("yes")) {
                            price -= price * 0.12;
                        }
                        break;
                }
                break;
            default:
                System.out.println("Invalid input!");
                return;
        }
        if (daysBooked > 7){
            daysBooked = daysBooked -1;

        }

        if (daysBooked < 1) {
            System.out.println("Days must be positive number!");
            return;
        }

        double totalPrice = price * daysBooked;

        System.out.printf("The price is %.2flv! Have a nice time!", totalPrice);
    }
}
