public record Card(Suit suit, Rank rank) {
    @Override
    public String toString() {
        return toShortString();
    }

    public String toShortString() {
        String info = "";
        switch (rank) {
            case Rank.ACE:
                info += 'A';
                break;
            case Rank.KING:
                info += 'K';
                break;
            case Rank.QUEEN:
                info += 'Q';
                break;
            case Rank.JACK:
                info += 'J';
                break;
            default:
                info += rank.getValue();
        }
        switch (suit) {
            case Suit.SPADES:
                info += '♠';
                break;
            case Suit.HEARTS:
                info += '❤';
                break;
            case Suit.CLUBS:
                info += '♣';
                break;
            case Suit.DIAMONDS:
                info += '♦';
                break;
            default:
        }
        return info;
    }
}