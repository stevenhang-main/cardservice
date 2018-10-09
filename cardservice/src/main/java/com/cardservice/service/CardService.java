package com.cardservice.service;

import java.util.List;

import com.cardservice.card.Card;

public interface CardService {
	public List<Card> getCards();
	public Card drawACard();
	public void createCard(Card card);
	public void deleteCard(Card card);
}
