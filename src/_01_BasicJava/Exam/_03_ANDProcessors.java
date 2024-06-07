package _01_BasicJava.Exam;

import java.util.Scanner;

public class _03_ANDProcessors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int processorCount = Integer.parseInt(scanner.nextLine());
        int workersCount = Integer.parseInt(scanner.nextLine());
        int workingDays = Integer.parseInt(scanner.nextLine());

        int loss = 0;
        int win= 0;

        int hours = workersCount * workingDays * 8;
        int production = (int) Math.floor(hours /3);

        if (production < processorCount){
            loss = processorCount - production;
            System.out.printf("Losses: -> %.2f BGN",loss * 110.10);
        }
        else{
            win = production - processorCount;
            System.out.printf("Profit: -> %.2f BGN",win *110.10);
            win = production - processorCount;
        }


    }
}
