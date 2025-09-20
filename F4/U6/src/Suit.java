public enum Suit {
    HEARTS(0), SPADES(1), DIAMONDS(2), CLUBS(3);

    private final int value;
    public int getValue() { return this.value; }
    private Suit(int value) { this.value = value; }
}
