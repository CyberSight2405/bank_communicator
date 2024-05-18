package com.hakaton.bank_communicator.db.repositories;

import com.hakaton.bank_communicator.db.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Long> {
}
