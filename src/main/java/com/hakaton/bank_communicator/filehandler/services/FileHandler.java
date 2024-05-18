package com.hakaton.bank_communicator.filehandler.services;

import java.util.List;

public interface FileHandler {

    List<String> searchFiles(String path);
    String[][] readFile(String filename);
    boolean deleteFile(String filename);
}
