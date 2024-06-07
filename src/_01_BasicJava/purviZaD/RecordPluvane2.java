package _01_BasicJava.purviZaD;

import java.util.Scanner;

public class RecordPluvane2 {
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);

        double rekordvSekundi = Double.parseDouble(scanner.nextLine());
        double raztoqnievMetri = Double.parseDouble(scanner.nextLine());
        double vremeVsekudni = Double.parseDouble(scanner.nextLine());

        double delaysec =Math.floor( raztoqnievMetri / 15) * 12.5;
        double finalTime = (vremeVsekudni * raztoqnievMetri) + delaysec;

        if (finalTime < rekordvSekundi) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", finalTime - rekordvSekundi);
        }
        else  {
            System.out.printf("No, he failed! He was %.2f seconds slower.", rekordvSekundi - finalTime);}

    }
}
