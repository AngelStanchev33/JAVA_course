package _01_BasicJava.PoSlojniProverki;

import java.util.Scanner;

public class PlodiliZelenchuk {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String productName = scanner.nextLine();

        switch (productName){
            case "banana":
            case "apple":
            case "kiwi":
            case "cherry":
            case "lemon":
            case "grape":
                System.out.println("fruit");
                break;
            case "tomato":
            case "cucumber":
            case "pepper":
            case "carrot":
                System.out.println("vegetable");
                break;
            default:
                System.out.println("uknown");}








            }

        }





