package _01_BasicJava.PodgotovkaZaIzipit.PodgotovkaZaIzpit5;

import java.util.Scanner;

public class _03_RhythmicGymnastics {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String appliance = scanner.nextLine();
        double points = 0;

        switch (country) {
            case "Bulgaria":
                if ("ribbon".equals(appliance)){
                    points = 9.600 + 9.400;
                }
                else if ("hoop".equals(appliance)){
                    points = 9.550 + 9.750;
                }
                else if ("rope".equals(appliance)){
                    points = 9.500 + 9.400;
                }
                break;
            case "Russia":
                if ("ribbon".equals(appliance)){
                    points = 9.100 + 9.400;
                }
                else if ("hoop".equals(appliance)){
                    points = 9.300 + 9.800;
                }
                else if ("rope".equals(appliance)){
                    points = 9.600 + 9.000;
                }
                break;
            case "Italy":
                if ("ribbon".equals(appliance)){
                    points = 9.200 + 9.500;
                }
                else if ("hoop".equals(appliance)){
                    points = 9.450 + 9.350;
                }
                else if ("rope".equals(appliance)){
                    points = 9.700 + 9.150;
                }
                break;
        }
        double breakRecord = 20 - points;

        System.out.printf("The team of %s get %.3f on %s.\n",country,points,appliance);
        System.out.printf("%.2f%%",breakRecord/20 *100);




    }
}
