package com.hakaton.bank_communicator.db.services;

import com.hakaton.bank_communicator.db.entity.Bank;
import com.hakaton.bank_communicator.db.entity.Card;
import com.hakaton.bank_communicator.db.repositories.CardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CardServiceImpl implements CardService {

    private final CardRepository cardRepository;

    @Override
    public Card getCardByNumberAndBank(String cardNumber, Bank bank) {
        return cardRepository.findByNumberAndBank(cardNumber, bank)
                .orElseThrow(() -> new RuntimeException("Card not found " + cardNumber));
    }
}
