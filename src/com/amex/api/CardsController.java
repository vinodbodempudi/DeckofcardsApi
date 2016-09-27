package com.amex.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amex.dao.Card;
import com.amex.service.CardsService;

@RestController
@RequestMapping("/deck")
public class CardsController {

	@Autowired
	private CardsService cardsService;

	@RequestMapping(value = "/cards", method = RequestMethod.GET)
	public List<Card> getCards() {

		return cardsService.getCards();
	}

}
