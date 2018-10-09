package com.cardservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cardservice.card.Card;
import com.cardservice.service.CardService;

@RestController
public class CardController {
	@Autowired
	private CardService cs;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Card> getCards() {
		List<Card> cards = cs.getCards();
		for(Card c: cards) {
			addLinksToCard(c);
		}
		return cards;
	}

	private void addLinksToCard(Card c) {
		
	}
	
	
	
}
