package _01_BasicJava.purviZaD;

import java.util.Scanner;

public class MagazinzaDetskiIgrahcki {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double Ekskurziq = Double.parseDouble(scanner.nextLine());
        int puzel = Integer.parseInt(scanner.nextLine());
        int kukli = Integer.parseInt(scanner.nextLine());
        int mecheta = Integer.parseInt(scanner.nextLine());
        int minion = Integer.parseInt(scanner.nextLine());
        int kamioncheta = Integer.parseInt(scanner.nextLine());

        int numberofToyz = puzel + kukli + mecheta + minion + kamioncheta;
        double obrot = (puzel * 2.60) + (kukli * 3) + (mecheta * 4.10) + (minion * 8.20) + (kamioncheta * 2);

        obrot -= obrot * 10/100;


        if (numberofToyz >= 50){
            obrot -=obrot * 25/100;}

        if (Ekskurziq > obrot){
            System.out.printf("Not enough money! %.2f lv needed.", Ekskurziq - obrot);}
        else { System.out.printf("Yes! %.2f lv left.", obrot -Ekskurziq);






        }


    }
}
