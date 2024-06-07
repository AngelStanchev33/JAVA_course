package _01_BasicJava.PoSlojniProverki;

import java.util.Scanner;

public class BiletKIno {
    public static void main(String[] args) {

        //Да се напише програма която чете ден от седмицата (текст) – въведен от потребителя и принтира на конзолата
        // цената на билет за кино според деня от седмицата:

        Scanner scanner = new Scanner(System.in);
        String dayofWeek = scanner.nextLine();

        switch (dayofWeek){
            case "Monday":
                System.out.println(12);}
        switch (dayofWeek){
            case "Tuesday":
                System.out.println(12);}
        switch (dayofWeek){
            case "Wednesday":
                System.out.println(14);}
        switch (dayofWeek){
            case "Thursday":
                System.out.println(14);}
        switch (dayofWeek){
            case "Friday":
                System.out.println(12);}
        switch (dayofWeek){
            case "Saturday":
                System.out.println(16);}
        switch (dayofWeek){
            case "Sunday":
                System.out.println(16);}


        }
    }

