package com.hakaton.bank_communicator.db.repositories;

import com.hakaton.bank_communicator.db.entity.IncomeExpenseItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncomeExpenseItemRepository extends JpaRepository<IncomeExpenseItem, Long> {
}
