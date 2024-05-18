package com.hakaton.bank_communicator.db.repositories;

import com.hakaton.bank_communicator.db.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
}
