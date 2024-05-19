package com.hakaton.bank_communicator.db.services;

import com.hakaton.bank_communicator.db.entity.Bank;
import com.hakaton.bank_communicator.db.repositories.BankRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BankServiceImpl implements BankService {
    private final BankRepository bankRepository;

    @Override
    public Bank getBankByExternalId(String externalId) {
        return bankRepository.findByExternalId(externalId)
                .orElseThrow(() -> new RuntimeException("Not found bank with externalId " + externalId));
    }

}
