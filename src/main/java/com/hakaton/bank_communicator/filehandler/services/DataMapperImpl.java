package com.hakaton.bank_communicator.filehandler.services;

import com.hakaton.bank_communicator.db.entity.Operation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataMapperImpl implements DataMapper {
    @Override
    public List<Operation> map(String[][] data) {
        return List.of();
    }
}
