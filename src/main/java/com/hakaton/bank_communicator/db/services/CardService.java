package com.hakaton.bank_communicator.db.services;

import com.hakaton.bank_communicator.db.entity.Bank;
import com.hakaton.bank_communicator.db.entity.Card;

public interface CardService {

    Card getCardByNumberAndBank(String cardNumber, Bank bank);

}
