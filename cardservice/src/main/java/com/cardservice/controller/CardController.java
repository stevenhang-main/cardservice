package com.cardservice.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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
	public Iterable<Card> getCards() {
		Iterable<Card> cards = cs.findAll();
		for(Card c: cards) {
			addLinksToCard(c);
		}
		return cards;
	}

	private void addLinksToCard(Card c) {
		
	}
	
	
	
}