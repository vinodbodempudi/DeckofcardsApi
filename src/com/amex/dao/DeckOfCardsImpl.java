package com.amex.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

/**
 * 
 * 
 * Assume this is DAO Impl and data coming from DB
 *
 */
@Repository
public class DeckOfCardsImpl implements DeckOfCards{

	@Override
	public List<Card> getCards() {

		List<Card> cards = new ArrayList<Card>();
		Card card;
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				card = new Card(rank, suit);
				cards.add(card);
			}
		}

		return cards;
	}

}
