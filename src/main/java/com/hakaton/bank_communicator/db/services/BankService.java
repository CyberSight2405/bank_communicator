package com.hakaton.bank_communicator.db.services;

import com.hakaton.bank_communicator.db.entity.Bank;

public interface BankService {
    Bank getBankByExternalId(String externalId);
}
