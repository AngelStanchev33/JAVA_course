package _01_BasicJava.PoSlojniProverki2;

import java.util.Scanner;

public class hotelRoom {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double stuidoPrice= 0;
        double apartmentPrice = 0;


        switch (month){
            case "May":
            case  "October":
                stuidoPrice = 50.0;
                apartmentPrice = 65.0;
                if (nights > 14){
            stuidoPrice -= stuidoPrice * 30 /100;
                }
        else if (nights > 7){
            stuidoPrice -= stuidoPrice * 5/100;
                }
                if (nights > 14) {
                    apartmentPrice -= apartmentPrice * 10/100;
                }
               break;
            case "June":
            case "September":
                stuidoPrice = 75.20;
                apartmentPrice = 68.70;
                if (nights > 14){
                    stuidoPrice -= stuidoPrice * 20 / 100;
                }
                if (nights > 14){
                    apartmentPrice -= apartmentPrice * 10/100;
                }
                break;

            case "July":
            case "August":
                stuidoPrice = 76.0;
                apartmentPrice = 77.0;
                if (nights > 14){
                    apartmentPrice -= apartmentPrice * 10/100;
                }
                break;
        }
        double finalPriceAp = apartmentPrice * nights;
        System.out.printf("Apartment %.2f lv.%s",finalPriceAp,System.lineSeparator());

        double finalPriceS = stuidoPrice * nights;
        System.out.printf("Studio %.2flv.%s",finalPriceS,System.lineSeparator());









        }






        }


