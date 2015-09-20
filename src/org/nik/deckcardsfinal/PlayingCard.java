package org.nik.deckcardsfinal;

public class PlayingCard implements Card {

	private Card.Rank rank;
	private Card.Suit suit;

	// Constructor. Make sure to initialize a card with Suit and Rank
	public PlayingCard(Card.Rank rank, Card.Suit suit) {
		this.rank = rank;
		this.suit = suit;
	}

	@Override
	public int compareTo(Card o) {
		return this.hashCode() - o.hashCode();
	}

	@Override
	public Rank getRank() {

		return this.rank;
	}

	@Override
	public Suit getSuit() {

		return this.suit;
	}

	@Override
	public int hashCode() {
		return ((this.suit.value() - 1) * 13 + rank.value());
	}

	@Override
	public String toString() {
		return this.rank.text() + " of " + this.suit.text();
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Card) {
			if (this.getRank() == ((Card) obj).getRank()
					&& this.getSuit() == ((Card) obj).getSuit()) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

}
