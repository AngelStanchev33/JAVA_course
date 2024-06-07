package _01_BasicJava.PoSlojniProverki;

import java.util.Scanner;

public class TyrgovskiKomisionni {
    public static void main(String[] args) {

        Scanner  scanner = new Scanner(System.in);
        String cityName = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        double commison = 0;

        switch (cityName) {
            case "Sofia":
                if (sales >= 0 && sales <= 500){
                    commison = sales * 5 /100;
                } else if (sales >500 && sales <=1000){
                    commison = sales * 7/100;
                }
                else if (sales >1000 && sales <=10000){
                    commison = sales * 8/100;
                }
                else if (sales > 10000){
                    commison = sales * 12/100;
                }
                break;

            case "Varna":
                if (sales >= 0 && sales <= 500){
                    commison = sales * 4.5 /100;
                } else if (sales >500 && sales <=1000){
                    commison = sales * 7.5/100;
                }
                else if (sales >1000 && sales <=10000){
                    commison = sales * 10/100;
                }
                else if (sales > 10000){
                    commison = sales * 13/100;
                }
                break;
            case "Plovdiv":
                if (sales >= 0 && sales <= 500){
                    commison = sales * 5.5 /100;
                } else if (sales >500 && sales <=1000){
                    commison = sales * 8/100;
                }
                else if (sales >1000 && sales <=10000){
                    commison = sales * 12/100;
                }
                else if (sales > 10000){
                    commison = sales * 12/100;
                }
                break;

            default:
                System.out.println("error");
                break;}
        System.out.printf("%.2f",commison);

        }
    }

