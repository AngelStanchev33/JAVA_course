package _01_BasicJava.PodgotovkaZaIzipit.PodgotovkaZaIzipit6;

import java.util.Scanner;

public class _03_HudGimnastika {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String tool = scanner.nextLine();

        double points = 0;
        double morePoints = 0;

        switch (country){
            case "Russia":
                if (tool.equals("ribbon")){
                    points = 9.100;
                    morePoints = 9.400;
                }
                else if (tool.equals("hoop")){
                    points = 9.300;
                    morePoints = 9.800;
                }
                else if (tool.equals("rope")){
                    points = 9.600;
                    morePoints = 9.000;
                }
                break;
            case "Bulgaria":
                if (tool.equals("ribbon")){
                    points = 9.600;
                    morePoints = 9.400;
                }
                else if (tool.equals("hoop")){
                    points = 9.550;
                    morePoints = 9.750;
                }
                else if (tool.equals("rope")){
                    points = 9.500;
                    morePoints = 9.400;
                }
                break;
            case "Italy":
                if (tool.equals("ribbon")){
                    points = 9.200;
                    morePoints = 9.500;
                }
                else if (tool.equals("hoop")){
                    points = 9.450;
                    morePoints = 9.350;
                }
                else if (tool.equals("rope")){
                    points = 9.500;
                    morePoints = 9.150;
                }
                break;
        }
        double totalSum = points + morePoints;
        double percent = 20 -totalSum;
        double percentPercet = percent / 20 * 100;

        System.out.printf("The team of %s get %.3f on %s.\n",country,totalSum,tool);
        System.out.printf("%.2f%%",percentPercet);
    }
}
