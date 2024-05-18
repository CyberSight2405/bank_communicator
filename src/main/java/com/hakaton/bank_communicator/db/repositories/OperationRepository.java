package com.hakaton.bank_communicator.db.repositories;

import com.hakaton.bank_communicator.db.entity.Operation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperationRepository extends JpaRepository<Operation, Long> {
}
