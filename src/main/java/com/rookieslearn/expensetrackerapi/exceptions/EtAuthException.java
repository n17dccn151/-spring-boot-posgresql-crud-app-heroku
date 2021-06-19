package com.rookieslearn.expensetrackerapi.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.annotation.RequestScope;

/**
 * Created by TanVOD on Jun, 2021
 */

@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class EtAuthException extends RuntimeException {


    public EtAuthException(String message){
        super(message);
    }
}
