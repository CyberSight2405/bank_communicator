package com.hakaton.bank_communicator.filehandler.services;

import com.hakaton.bank_communicator.db.entity.Operation;

import java.util.List;

public interface DataMapper {

    List<Operation> map(String[][] data);

}
