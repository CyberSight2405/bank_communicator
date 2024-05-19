package com.hakaton.bank_communicator.db.repositories;

import com.hakaton.bank_communicator.db.entity.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BankRepository extends JpaRepository<Bank, Long> {
    Optional<Bank> findByExternalId(String externalId);
}
