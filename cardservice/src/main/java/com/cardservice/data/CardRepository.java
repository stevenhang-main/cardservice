package com.cardservice.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cardservice.card.Card;

@Repository
public interface CardRepository extends JpaRepository<Card, Integer> {
	Card drawACard();
}
