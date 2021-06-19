package com.rookieslearn.expensetrackerapi.repositories;

import com.rookieslearn.expensetrackerapi.domain.User;
import com.rookieslearn.expensetrackerapi.exceptions.EtAuthException;
import org.springframework.stereotype.Repository;

/**
 * Created by TanVOD on Jun, 2021
 */




public interface UserRepository {
    Integer create(String firstName, String lastName, String email, String password) throws EtAuthException;


    User findByEmailAndPassword(String email, String password) throws EtAuthException;

    Integer getCountByEmail(String email);

    User findById(Integer userId);


}
