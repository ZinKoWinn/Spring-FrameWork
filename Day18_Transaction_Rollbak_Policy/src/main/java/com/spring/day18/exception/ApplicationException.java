package com.spring.day18.exception;

import org.springframework.context.ApplicationContext;

public class ApplicationException extends  Exception{
    public ApplicationException(String message){
        super(message);
    }
}
