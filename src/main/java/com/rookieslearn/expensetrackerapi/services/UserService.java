package com.rookieslearn.expensetrackerapi.services;

import com.rookieslearn.expensetrackerapi.domain.User;
import com.rookieslearn.expensetrackerapi.exceptions.EtAuthException;

/**
 * Created by TanVOD on Jun, 2021
 */
public interface UserService {
    User validateUser(String email, String password) throws EtAuthException;

    User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException;
}
