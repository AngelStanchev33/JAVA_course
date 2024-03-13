package _03_JavaAdvanced._01_StacksandQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _05_PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine().trim();

        ArrayDeque<String> printerQueue = new ArrayDeque<>();

        while (!"print".equals(command)) {

            if ("cancel".equals(command)) {
                String fileName = printerQueue.poll();
                if (fileName != null) {
                    System.out.println("Canceled" + fileName);
                } else {
                    System.out.println("Printer is on standby");
                }
            } else {
                printerQueue.offer(command);
            }
            command = scanner.nextLine();
        }

        while (!printerQueue.isEmpty()) {
            System.out.println(printerQueue.poll());
        }
    }
}
