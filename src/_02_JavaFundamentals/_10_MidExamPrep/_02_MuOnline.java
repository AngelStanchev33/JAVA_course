package _02_JavaFundamentals._10_MidExamPrep;

import java.util.Scanner;

public class _02_MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initalHealth = 100;
        int roomCount = 0;
        int bitCoin = 0;

        boolean madeIt = true;

        String[]data  = scanner.nextLine().split("\\|");
        for (String room : data) {
            String[] roomDetails = room.trim().split("\\s+");
            String command = roomDetails[0];
            int number = Integer.parseInt(roomDetails[1]);
            roomCount++;



            if (command.equals("potion")){

                int healingAmount = Math.min(100 - initalHealth,number);
                initalHealth += number;
                if (initalHealth >= 100){
                    initalHealth = 100;
                }
                System.out.printf("You healed for %d hp.%n",healingAmount);
                System.out.printf("Current health: %d hp.%n", initalHealth);

            }
            else if (command.equals("chest")){

                bitCoin+=number;
                System.out.printf("You found %d bitcoins.%n",number);

            }
            else {

                initalHealth -= number;
                if (initalHealth >0){
                    System.out.printf("You slayed %s.%n",command);

                }
                else {
                    madeIt = false;
                    System.out.printf("You died! Killed by %s.%n",command);
                    System.out.printf("Best room: %d%n",roomCount);
                    break;

                }
            }
        }
        if (madeIt){
            System.out.printf("You've made it!%n"+
                    "Bitcoins: %d%n"+
                    "Health: %d%n",bitCoin,initalHealth);
        }


    }
}
