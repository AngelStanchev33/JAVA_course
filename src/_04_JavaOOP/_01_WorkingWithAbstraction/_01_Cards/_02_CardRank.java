package _04_JavaOOP._01_WorkingWithAbstraction._01_Cards;

import java.util.Scanner;

public class _02_CardRank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String powerLine = scanner.nextLine().toUpperCase();
        String suitLine = scanner.nextLine().toUpperCase();

        int cardRank = 0;

        cardsPower cardPower = cardsPower.valueOf(powerLine);
        cardsSuit cardSuit = cardsSuit.valueOf(suitLine);

        cardRank = cardPower.getPower() + cardSuit.getSuite();

        System.out.printf("Card name: %s of %s; Card power: %d\n",cardPower,cardSuit,cardRank);

    }
}
