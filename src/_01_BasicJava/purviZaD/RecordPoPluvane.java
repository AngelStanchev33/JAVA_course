package _01_BasicJava.purviZaD;

import java.util.Scanner;

public class RecordPoPluvane {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double vremeSekzaEdinMetur = Double.parseDouble(scanner.nextLine());

        double vremeBezRez = distance * vremeSekzaEdinMetur;
        double vremeSusRez = Math.floor(vremeSekzaEdinMetur / 15) * 12.5;
        double ObhstoVreme = vremeBezRez + vremeSusRez;

        if (ObhstoVreme < recordInSeconds){
            System.out.printf("No, he failed! He was %.2f seconds slower.", ObhstoVreme - recordInSeconds);}
        else { System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", recordInSeconds - ObhstoVreme);}


        }


        }


