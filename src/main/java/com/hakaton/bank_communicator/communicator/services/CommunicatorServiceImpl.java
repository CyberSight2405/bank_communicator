package com.hakaton.bank_communicator.communicator.services;

import com.hakaton.bank_communicator.db.entity.Operation;
import com.hakaton.bank_communicator.db.repositories.OperationRepository;
import com.hakaton.bank_communicator.db.mapper.DataMapper;
import com.hakaton.bank_communicator.filehandler.services.FileHandler;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.nio.file.Path;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class CommunicatorServiceImpl implements CommunicatorService {

    private final FileHandler fileHandler;
    private final DataMapper dataMapper;
    private final OperationRepository operationRepository;

    @Value("${communicator.files-path}")
    private String filesPath;

    @Override
    public void handleOperations() {
        log.info("The beginning of data processing from the bank.");

        List<Path> files = fileHandler.searchFiles(filesPath);

        for (Path path : files) {
            String[][] data = fileHandler.readFile(path);
            List<Operation> operations = dataMapper.map(data);
            if (!operations.isEmpty()) {
                operationRepository.saveAll(operations);
            }
            fileHandler.deleteFile(path);
        }

        log.info("Completion of data processing from the bank.");
    }

}
