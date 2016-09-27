package com.amex.dao;


public class Card implements Comparable<Card> {
	private Rank rank;
	private Suit suit;

	public Card(Rank face, Suit shape) {
		this.rank = face;
		this.suit = shape;
	}

	@Override
	public int compareTo(Card o) {

		int result;
		result = this.suit.compareTo(o.suit);
		if (result == 0) {

			return this.rank.compareTo(o.rank);

		} else {
			return result;
		}

	}

	@Override
	public int hashCode() {

		return rank.hashCode() + suit.hashCode();

	}

	@Override
	public boolean equals(Object o) {
		Card c = (Card) o;
		if (this.suit.equals(c.suit) && this.rank.equals(c.rank)) {
			return true;

		}

		return false;

	}

	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}

	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}

	
	
}
