package com.flashcard.cardservice.service;

import java.util.List;
import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.flashcard.cardservice.card.Card;

@Service
public interface CardService {
	public Card getCardById(int i);
	public void updateCard(Card b);
	public void deleteCard(Card b);
	public Card addCard(Card b);
	public List<Card> getCards();
}
