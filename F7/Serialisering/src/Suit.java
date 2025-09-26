public enum Suit {
    SPADES(0), HEARTS(1), CLUBS(2), DIAMONDS(3);

    private final int value;
    public int getValue() { return this.value; }
    private Suit(int value) { this.value = value; }
}
