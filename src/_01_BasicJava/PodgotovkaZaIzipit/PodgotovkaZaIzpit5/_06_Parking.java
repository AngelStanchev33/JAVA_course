package _01_BasicJava.PodgotovkaZaIzipit.PodgotovkaZaIzpit5;

import java.util.Scanner;

public class _06_Parking {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double tax = 0;
        double taxTotal = 0;
        double taxTotalHours =0;
        double taxTotalDays = 0;


        for (int i = 1; i <= days ; i++) {
            taxTotalHours = 0;

            for (int j = 1; j <= hours; j++) {

                if (i % 2 ==0 && j % 2 !=0){
                    tax = 2.50;
                }
                else if (j % 2 ==0 && i % 2 !=0){
                    tax = 1.25;
                }
                else {
                    tax = 1;
                }
                taxTotalHours += tax;
                taxTotal += tax;
            }
            taxTotalDays += taxTotalHours;
        System.out.printf("Day: %d – %.2f leva\n",i,taxTotalDays);
            taxTotalDays =0;
        }
    System.out.printf("Total: %.2f leva",taxTotal);

    }
}
