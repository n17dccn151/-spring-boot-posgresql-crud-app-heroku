package com.rookieslearn.expensetrackerapi.services;

import com.rookieslearn.expensetrackerapi.domain.Transaction;
import com.rookieslearn.expensetrackerapi.exceptions.EtBadRequestException;
import com.rookieslearn.expensetrackerapi.exceptions.EtResourceNotFoundException;

import java.util.List;

/**
 * Created by TanVOD on Jun, 2021
 */
public interface TransactionService {

    List<Transaction> fetchAllTransaction(Integer userId, Integer categoryId);

    Transaction fetchTransactionById(Integer userId, Integer categoryId, Integer transactionId)
            throws EtResourceNotFoundException;

    Transaction addTransaction(Integer userId, Integer categoryId,
                               Double amount, String note, Long transactionDate)
        throws EtBadRequestException;

    void updateTransaction(Integer userId, Integer categoryId, Integer transactionId, Transaction transaction)
        throws EtBadRequestException;

    void removeTransaction(Integer userId, Integer categoryId, Integer transactionId)
        throws EtResourceNotFoundException;
}
