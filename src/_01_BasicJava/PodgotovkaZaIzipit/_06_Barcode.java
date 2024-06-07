package _01_BasicJava.PodgotovkaZaIzipit;

import java.util.Scanner;

public class _06_Barcode {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

//когато търсъм между първото число от задедето много числено до първото число на второто зададено многочислено
        int firstStart  = Integer.parseInt(Integer.toString(start).substring(0,1));
        int secondStart  = Integer.parseInt(Integer.toString(start).substring(1,2));
        int thirdNStart  = Integer.parseInt(Integer.toString(start).substring(2,3));
        int forthStart  = Integer.parseInt(Integer.toString(start).substring(3,4));

        int firstEnd  = Integer.parseInt(Integer.toString(end).substring(0,1));
        int secondEnd  = Integer.parseInt(Integer.toString(end).substring(1,2));
        int thirdNEnd  = Integer.parseInt(Integer.toString(end).substring(2,3));
        int forthEnd  = Integer.parseInt(Integer.toString(end).substring(3,4));

        for (int i = firstStart; i <=firstEnd ; i++) {
            for (int j =secondStart; j <= secondEnd ; j++) {
                for (int k =thirdNStart; k <=thirdNEnd ; k++) {
                    for (int l = forthStart; l <=forthEnd ; l++) {

                        if (i % 2 != 0 && j % 2 !=0 && k % 2 !=0 && l % 2 !=0){

                            System.out.print(i);
                            System.out.print(j);
                            System.out.print(k);
                            System.out.print(l);
                            System.out.print(" ");

                        }

                    }

                }

            }
            
        }
    }
}
