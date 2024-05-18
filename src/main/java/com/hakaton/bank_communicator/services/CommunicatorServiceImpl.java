package com.hakaton.bank_communicator.services;

import com.hakaton.bank_communicator.services.CommunicatorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CommunicatorServiceImpl implements CommunicatorService {

    @Override
    public void getOperations() {
        log.info("cjmmunication ...");
    }

}
