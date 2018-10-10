package com.flashcard.cardservice.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flashcard.cardservice.card.Card;

@Repository
public interface CardRepository extends JpaRepository<Card, Integer> {
}
