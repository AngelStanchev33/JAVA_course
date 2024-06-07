package _01_BasicJava.PodgotovkaZaIzipit.PodgotvokaZaIzpit2;

import java.util.Scanner;

public class PaintingEggs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String eggSize = scanner.nextLine();
        String eggColor = scanner.nextLine();
        int numOFBatch = Integer.parseInt(scanner.nextLine());

        double priceForEggs = 0;

        switch (eggSize){
            case "Large":
                if ("Red".equals(eggColor)){
                    priceForEggs = 16.0;
                }
                else if ("Green".equals(eggColor)){
                    priceForEggs = 12.0;
                }
                else if ("Yellow".equals(eggColor)){
                    priceForEggs = 9.0;
                }
                break;

            case "Medium":
                if ("Red".equals(eggColor)){
                    priceForEggs = 13.0;
                }
                else if ("Green".equals(eggColor)){
                    priceForEggs = 9.0;
                }
                else if ("Yellow".equals(eggColor)){
                    priceForEggs = 7.0;
                }
                break;

            case "Small":
                if ("Red".equals(eggColor)){
                    priceForEggs = 9.0;
                }
                else if ("Green".equals(eggColor)){
                    priceForEggs = 8.0;
                }
                else if ("Yellow".equals(eggColor)){
                    priceForEggs = 5.0;
                }
                break;
        }
        double endPrice = numOFBatch * priceForEggs;
        double expenses = (endPrice * 35) /100;

        double result = endPrice - expenses;

        System.out.printf("%.2f leva.",result);
    }
}
