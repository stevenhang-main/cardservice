package com.cardservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cardservice.card.Card;
import com.cardservice.data.CardRepository;

@Service
public class CardServiceImpl implements CardService{
	@Autowired
	private CardRepository cr;

	@Override
	public List<Card> getCards() {
		return cr.findAll();
	}

	@Override
	public Card drawACard() {
		return cr.drawACard();
	}

	@Override
	public void createCard(Card card) {
		cr.save(card);
	}

	@Override
	public void deleteCard(Card card) {
		cr.delete(card);
	}
	
	
}
