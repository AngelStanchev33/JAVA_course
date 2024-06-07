package _01_BasicJava.VlojeniCikli2;

import java.util.Scanner;

public class _06_CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int studentTotal = 0;
        int standardTotal = 0;
        int kidTotal = 0;
        int ticketsTotal = 0;

        while (!input.equals("Finish")) {
            String movieName = input;
            int seats = Integer.parseInt(scanner.nextLine());
            int student = 0;
            int standard = 0;
            int kid = 0;

            for (int i = 1; i <= seats ; i++) {
                input = scanner.nextLine();
                if (input.equals("End")) {
                    break;
                }
                if (input.equals("student")) {
                    student++;
                } else if (input.equals("standard")) {
                    standard++;
                } else {
                    kid++;
                }
            }
            double tickets = student + standard + kid;
            studentTotal += student;
            standardTotal += standard;
            kidTotal += kid;
            ticketsTotal += tickets;

            System.out.printf("%s - %.2f%% full.%n", movieName, tickets * 100 / seats);
            input = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n", ticketsTotal);
        System.out.printf("%.2f%% student tickets.%n", studentTotal * 100 / (double) ticketsTotal);
        System.out.printf("%.2f%% standard tickets.%n", standardTotal * 100 / (double) ticketsTotal);
        System.out.printf("%.2f%% kids tickets.", kidTotal * 100 / (double) ticketsTotal);
    }
}