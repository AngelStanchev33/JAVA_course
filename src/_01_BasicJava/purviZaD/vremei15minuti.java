package _01_BasicJava.purviZaD;

import java.util.Scanner;

public class vremei15minuti {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int min = minutes + 15;

        if (hours < 10) {
            System.out.printf("%d:0%d");}
        else if (hours > 10){
            System.out.printf("%d:%d");}
        if (minutes < 10) {
            System.out.printf("%d:0%d");}
        else if (minutes > 10){
            System.out.printf("%d:%d");}
        System.out.print(min);}

        }


