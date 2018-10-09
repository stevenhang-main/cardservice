package com.cardservice.controller;

<<<<<<< HEAD
import java.util.List;
=======
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
>>>>>>> 960e17cace73f9191fbb27446b5dcb8dc8ba7f83

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
<<<<<<< HEAD
	public List<Card> getCards() {
		List<Card> cards = cs.getCards();
=======
	public Iterable<Card> getCards() {
		Iterable<Card> cards = cs.findAll();
>>>>>>> 960e17cace73f9191fbb27446b5dcb8dc8ba7f83
		for(Card c: cards) {
			addLinksToCard(c);
		}
		return cards;
	}

	private void addLinksToCard(Card c) {
		
	}
	
	
	
}
