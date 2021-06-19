package com.rookieslearn.expensetrackerapi.repositories;

import com.rookieslearn.expensetrackerapi.domain.Transaction;
import com.rookieslearn.expensetrackerapi.exceptions.EtBadRequestException;
import com.rookieslearn.expensetrackerapi.exceptions.EtResourceNotFoundException;

import java.util.List;

/**
 * Created by TanVOD on Jun, 2021
 */
public interface TransactionRepository {

    List<Transaction> findAll(Integer userId, Integer categoryId);

    Transaction findById(Integer userId, Integer categoryId, Integer transactionId)
            throws EtResourceNotFoundException;

    Integer create(Integer userId, Integer categoryId, Double amount, String note, Long transactionDate)
            throws EtBadRequestException;

    void update(Integer userId, Integer categoryId, Integer transactionId, Transaction transaction)
        throws EtBadRequestException;

    void removeById(Integer userId, Integer categoryId, Integer transactionId)
        throws EtResourceNotFoundException;


}
