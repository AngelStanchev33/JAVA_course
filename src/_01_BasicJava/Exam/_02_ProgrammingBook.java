package _01_BasicJava.Exam;

import java.util.Scanner;

public class _02_ProgrammingBook {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double pricePerPage = Double.parseDouble(scanner.nextLine());
        double pricePerCover = Double.parseDouble(scanner.nextLine());
        int paperDiscount = Integer.parseInt(scanner.nextLine());
        double designerFee = Double.parseDouble(scanner.nextLine());
        int teamPercentage = Integer.parseInt(scanner.nextLine());

        int totalPages = 899;
        int totalCovers = 2;

        double priceForPrint = pricePerPage * totalPages + (pricePerCover *2);
        double priceAfterDiscount = priceForPrint - (priceForPrint * paperDiscount /100);
        double priceAfterDesigner = priceAfterDiscount + designerFee;
        double totalPrice = priceAfterDesigner - (priceAfterDesigner * teamPercentage /100);

        System.out.printf("Avtonom should pay %.2f BGN.",totalPrice);


    }
}
