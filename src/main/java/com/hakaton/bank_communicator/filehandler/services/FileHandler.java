package com.hakaton.bank_communicator.filehandler.services;

import java.nio.file.Path;
import java.util.List;

public interface FileHandler {

    List<Path> searchFiles(String path);
    String[][] readFile(Path path);
    boolean deleteFile(Path path);
}
