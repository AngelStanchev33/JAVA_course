package _04_JavaOOP._01_WorkingWithAbstraction._01_Cards;

public class _01_CardSuit {
    public static void main(String[] args) {

        System.out.println("Card Ranks");
        for (cardsPower card : cardsPower.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s\n",
                    card.ordinal(), card.name());

        }
    }

}
