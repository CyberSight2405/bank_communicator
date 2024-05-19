package com.hakaton.bank_communicator.db.repositories;

import com.hakaton.bank_communicator.db.entity.Bank;
import com.hakaton.bank_communicator.db.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CardRepository extends JpaRepository<Card, Long> {

    Optional<Card> findByNumberAndBank(String cardNumber, Bank bank);

}
