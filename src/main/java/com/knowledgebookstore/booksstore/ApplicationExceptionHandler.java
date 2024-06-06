package com.knowledgebookstore.booksstore;

import java.util.Arrays;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.knowledgebookstore.booksstore.exception.ErrorMessage;
import com.knowledgebookstore.booksstore.exception.NoBookFoundException;

@ControllerAdvice
public class ApplicationExceptionHandler extends ResponseEntityExceptionHandler{
    
    @ExceptionHandler(NoBookFoundException.class)
    public ResponseEntity<Object> handleNoBookFoundException(NoBookFoundException ex){
        ErrorMessage message = new ErrorMessage(Arrays.asList(ex.getLocalizedMessage()));
        return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
    }
}
