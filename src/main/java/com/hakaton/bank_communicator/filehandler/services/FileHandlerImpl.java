package com.hakaton.bank_communicator.filehandler.services;

import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FileHandlerImpl implements FileHandler {

    private final int COLUMNS_NUMBER = 7;

    @SneakyThrows
    @Override
    public List<Path> searchFiles(String path) {
        return Files.list(Path.of(path))
                .filter(p -> p.toString().toLowerCase().endsWith(".csv"))
                .collect(Collectors.toList());
    }

    @SneakyThrows
    @Override
    public String[][] readFile(Path path) {
        List<String> lines = Files.readAllLines(path);
        String[][] res = new String[lines.size()][COLUMNS_NUMBER];
        for (int i = 0; i < lines.size(); i++) {
            res[i] = lines.get(i).split(";", COLUMNS_NUMBER);
        }

        return res;
    }

    @SneakyThrows
    @Override
    public boolean deleteFile(Path path) {
        Files.delete(path);
        return true;
    }
}
