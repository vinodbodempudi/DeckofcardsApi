package com.amex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amex.dao.Card;
import com.amex.dao.DeckOfCards;
import com.amex.dao.DeckOfCardsImpl;

@Service
public class CardsServiceImpl implements CardsService{

	@Autowired
	private DeckOfCards deckOfCards;
	
	@Override
	public List<Card> getCards() {
		
		return deckOfCards.getCards();
	}

	
	
	
	
	

}
