package org.example.sandbox.cards.standard;

public class Card {

    private Suit suit;
    private FaceValue rank;

    public Card (Suit suit, FaceValue rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }
    public void setSuit(Suit suit) {
        this.suit = suit;
    }
    public FaceValue getRank() {
        return rank;
    }
    public void setRank(FaceValue rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Card{");
        sb.append("suit=").append(suit);
        sb.append(", rank=").append(rank);
        sb.append('}');
        return sb.toString();
    }
}
