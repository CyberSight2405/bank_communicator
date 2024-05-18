package com.hakaton.bank_communicator.services;

import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class CommunicatorScheduler {

    private final CommunicatorService communicatorService;

    @Scheduled(initialDelay = 1000L, fixedDelay = 3000L)
    void run() {
        communicatorService.getOperations();
    }

}
