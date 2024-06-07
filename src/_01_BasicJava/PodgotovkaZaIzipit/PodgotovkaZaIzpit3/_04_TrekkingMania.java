package _01_BasicJava.PodgotovkaZaIzipit.PodgotovkaZaIzpit3;

import java.util.Scanner;

public class _04_TrekkingMania {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numOfGroups = Integer.parseInt(scanner.nextLine().trim());

        double musalaCount = 0;
        double monbalCount = 0;
        double kilimanjaroCount = 0;
        double k2Count = 0;
        double everestCount = 0;
        double allPPl = 0;


        for (int i = 0; i <numOfGroups ; i++) {
            int numOfPppInGroup = Integer.parseInt(scanner.nextLine());
            allPPl += numOfPppInGroup;

            if (numOfPppInGroup <= 5 ){
                musalaCount += numOfPppInGroup;
            }
            else  if(numOfPppInGroup <= 12){
                monbalCount += numOfPppInGroup;
            }
            else if (numOfPppInGroup <=25){
                kilimanjaroCount += numOfPppInGroup;
            }
            else if (numOfPppInGroup <=40){
                k2Count += numOfPppInGroup;
            }
            else {
                everestCount += numOfPppInGroup;
            }
        }
        double musalaPercent = musalaCount / allPPl * 100;
        double monblanPercent = monbalCount / allPPl * 100;
        double kilimanjaroPercent = kilimanjaroCount / allPPl * 100;
        double k2Percent = k2Count / allPPl * 100;
        double everestPercent = everestCount / allPPl * 100;

        System.out.printf("%.2f%%%n",musalaPercent);
        System.out.printf("%.2f%%%n",monblanPercent);
        System.out.printf("%.2f%%%n",kilimanjaroPercent);
        System.out.printf("%.2f%%%n",k2Percent);
        System.out.printf("%.2f%%%n",everestPercent);


    }
}
