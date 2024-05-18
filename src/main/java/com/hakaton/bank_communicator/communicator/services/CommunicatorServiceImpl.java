package com.hakaton.bank_communicator.communicator.services;

import com.hakaton.bank_communicator.db.repositories.OperationRepository;
import com.hakaton.bank_communicator.filehandler.services.FileHandler;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class CommunicatorServiceImpl implements CommunicatorService {

    private final FileHandler fileHandler;
    private final OperationRepository operationRepository;

    @Value("${communicator.files-path}")
    private String filesPath;

    @Override
    public void handleOperations() {
        log.info("The beginning of data processing from the bank.");

        log.info(filesPath);

        log.info("Completion of data processing from the bank.");
    }

}
