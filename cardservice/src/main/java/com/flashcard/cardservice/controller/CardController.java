package com.flashcard.cardservice.controller;

import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
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
	public List<Card> getCards() {
		List<Card> cards = cs.getCards();
		for(Card c: cards) {
			addLinksToCard(c);
		}
		return cards;
	}
	
	@RequestMapping(value="{id}",method=RequestMethod.GET)
	public Card getCard(@PathVariable("id") int id) {
		Card ca = cs.getCardById(id);
		addLinksToCard(ca);
		return ca;
	}

	private void addLinksToCard(Card c) {
		
	}
	@RequestMapping(value="/draw",method=RequestMethod.GET)
	private Card drawACard()
	{
		Random rand = new Random();
		int ra = rand.nextInt(cs.getCards().size());
		Card result = cs.getCardById(ra);
		return result;
	}
	
	
	
}
