package _04_JavaOOP._01_WorkingWithAbstraction._01_Cards;

public enum cardsSuit {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private final int suite;

    public int getSuite() {
        return suite;
    }

    cardsSuit(int suite) {
        this.suite = suite;
    }
}
