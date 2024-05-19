package com.hakaton.bank_communicator.db.mapper;

import com.hakaton.bank_communicator.db.entity.Card;
import com.hakaton.bank_communicator.db.entity.Operation;
import com.hakaton.bank_communicator.db.entity.TypeOperation;
import com.hakaton.bank_communicator.db.services.BankService;
import com.hakaton.bank_communicator.db.services.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DataMapperImpl implements DataMapper {
    private final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MMM-dd");

    private final int DATE = 0;
    private final int TIME = 1;
    private final int BANK_ID = 2;
    private final int CARD_NUMBER = 3;
    private final int OPERATION_TYPE = 4;
    private final int SUM = 5;
    private final int NOTE = 6;

    private final BankService bankService;
    private final CardService cardService;

    @Override
    public List<Operation> map(String[][] data) {
        List<Operation> res = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            String[] operationData = data[i];
            Card card = cardService.getCardByNumberAndBank(
                    operationData[CARD_NUMBER],
                    bankService.getBankByExternalId(operationData[BANK_ID])
            );

            Operation operation = Operation.builder()
                    .dateTime(LocalDateTime.of(
                            LocalDate.parse(operationData[DATE], dtf),
                            LocalTime.parse(operationData[TIME])))
                    .account(card.getAccount())
                    .card(card)
                    .typeOperation("DEPOSIT".equals(operationData[OPERATION_TYPE]) ?
                            TypeOperation.INCOME : TypeOperation.EXPENSE)
                    .sum(new BigDecimal(operationData[SUM]))
                    .note(operationData[NOTE])
                    .build();
            res.add(operation);
        }
        return res;
    }

}
