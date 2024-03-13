package _03_JavaAdvanced._01_StacksandQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _06_HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] kids = scanner.nextLine().split("\\s+");
        int toss = Integer.parseInt(scanner.nextLine());

        int count = 0;

        ArrayDeque<String> hotPotato = new ArrayDeque<>();
        for (String kid : kids) {
            hotPotato.offer(kid);
        }

        while (true) {
            if (hotPotato.size() <= 1) {
                break;
            }
            count++;

            if (count == toss) {
                System.out.println("Removed" + " " + hotPotato.poll());
                count = 0;
            } else {
                hotPotato.offer(hotPotato.poll());
            }
        }

        System.out.println("Last is" + " " + hotPotato.peek());
    }
}
