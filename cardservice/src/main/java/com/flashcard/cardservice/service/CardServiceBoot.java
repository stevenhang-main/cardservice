package com.flashcard.cardservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flashcard.cardservice.card.Card;
import com.flashcard.cardservice.data.CardRepository;


@Service
public class CardServiceBoot implements CardService {
	@Autowired
	CardRepository cr;

	@Override
	public Card getCardById(int id) {
		return cr.getOne(id);
	}

	@Override
	public void updateCard(Card b) {
		cr.save(b);

	}

	@Override
	public void deleteCard(Card b) {
		cr.delete(b);

	}

	@Override
	public Card addCard(Card b) {
		Card ca = cr.save(b);
		return ca;
	}

	@Override
	public List<Card> getCards() {
		return cr.findAll();
	}

}
