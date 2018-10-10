package com.flashcard.cardservice.controller;

import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.flashcard.cardservice.card.Card;
import com.flashcard.cardservice.service.CardService;

@RestController
public class CardController {
	@Autowired
	private CardService cs;
	
	@RequestMapping(method=RequestMethod.GET)
	public Iterable<Card> getCards() {
		Iterable<Card> cards = cs.findAll();
		for(Card c: cards) {
			addLinksToCard(c);
		}
		return cards;
	}

	private void addLinksToCard(Card c) {
		
	}
	
	private Optional<Card> drawACard()
	{
		//make random id
		Random rand = new Random();
		int ra = rand.nextInt((int)cs.count());
		Optional<Card> result = cs.findById(ra);
		return result;
	}
	
	
	
}
