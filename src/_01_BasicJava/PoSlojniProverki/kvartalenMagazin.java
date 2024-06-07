package _01_BasicJava.PoSlojniProverki;

import java.util.Scanner;

public class kvartalenMagazin {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Напишете програма, която чете продукт (низ), град (низ) и количество (десетично число
        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quanity = Double.parseDouble(scanner.nextLine());
        double price = 0;

        switch (city) {
            case "Sofia":
            if (product.equals("cofee")){
                price = 0.50;}
            else if (product.equals("water")){
                price = 0.80;}
            else if(product.equals("beer")){
                price = 1.20;}
            else if (product.equals("sweets")) {
                price = 1.45;}
            else if (product.equals("peanuts")){
                price =1.60;}
            break;
        }
        switch (city) {
            case "Plovdiv":
                if (product.equals("cofee")){
                    price = 0.40;}
                else if (product.equals("water")){
                    price = 0.70;}
                else if(product.equals("beer")){
                    price = 1.15;}
                else if (product.equals("sweets")) {
                    price = 1.30;}
                else if (product.equals("peanuts")){
                    price =1.50;}
                break;
        }
        switch (city) {
            case "Varna":
                if (product.equals("cofee")){
                    price = 0.45;}
                else if (product.equals("water")){
                    price = 0.70;}
                else if(product.equals("beer")){
                    price = 1.10;}
                else if (product.equals("sweets")) {
                    price = 1.35;}
                else if (product.equals("peanuts")){
                    price =1.55;}
                break;}

        double totalPrice = quanity * price;
        System.out.println(totalPrice);








    }
}
