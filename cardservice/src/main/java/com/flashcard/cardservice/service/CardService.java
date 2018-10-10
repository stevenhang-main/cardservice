package com.flashcard.cardservice.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.flashcard.cardservice.card.Card;

@Service
public interface CardService extends CrudRepository<Card, Integer>{
}
