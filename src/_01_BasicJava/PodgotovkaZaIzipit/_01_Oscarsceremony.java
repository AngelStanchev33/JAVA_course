package _01_BasicJava.PodgotovkaZaIzipit;

import java.util.Scanner;

public class _01_Oscarsceremony {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int rent = Integer.parseInt(scanner.nextLine());

        double awards = rent - (rent * 0.30);
        double catering = awards - (awards * 0.15);
        double sound = catering / 2;

        double expenses = rent + awards + catering + sound;

        System.out.printf("%.2f", expenses);

    }
}
