package _01_BasicJava.PodgotovkaZaIzipit.PodgotovkaZaIzipit4;

import java.util.Scanner;

public class _04_FitnessCenter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfClients = Integer.parseInt(scanner.nextLine());

        int backCount = 0;
        int chestCount = 0;
        int legsCount = 0;
        int absCount = 0;
        int proteinShakeCount = 0;
        int proteinBarCount = 0;

        int workOut = 0;
        int protein = 0;


        for (int i = 0; i < numberOfClients; i++) {
            String input = scanner.nextLine().trim();
            if (input.equals("Back")){
                backCount++;
                workOut++;

            } else if (input.equals("Chest")) {
                chestCount++;
                workOut++;

            }
            else if (input.equals("Legs")) {
                legsCount++;
                workOut++;

            }
            else if (input.equals("Abs")) {
                absCount++;
                workOut++;

            }
            else if (input.equals("Protein shake")) {
                proteinShakeCount++;
                protein++;

            }
            else if (input.equals("Protein bar")) {
                proteinBarCount++;
                protein++;

            }

        }
    System.out.printf("%d - back%n",backCount);
        System.out.printf("%d - chest%n",chestCount);
        System.out.printf("%d - legs%n",legsCount);
        System.out.printf("%d - abs%n",absCount);
        System.out.printf("%d - protein shake%n",proteinShakeCount);
        System.out.printf("%d - protein bar%n",proteinBarCount);
        System.out.printf("%.2f%% - work out%n",(double)workOut / numberOfClients * 100);
        System.out.printf("%.2f%% - protein%n",(double)protein / numberOfClients * 100);
    }
}
