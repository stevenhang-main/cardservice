package com.cardservice.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.cardservice.card.Card;

@Service
public interface CardService extends CrudRepository<Card, Integer>{

}
