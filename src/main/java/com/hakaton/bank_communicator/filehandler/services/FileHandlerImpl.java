package com.hakaton.bank_communicator.filehandler.services;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileHandlerImpl implements FileHandler {
    @Override
    public List<String> searchFiles(String path) {
        return List.of();
    }

    @Override
    public String[][] readFile(String filename) {
        return new String[0][];
    }

    @Override
    public boolean deleteFile(String filename) {
        return true;
    }
}
