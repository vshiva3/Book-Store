package com.knowledgebookstore.booksstore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.knowledgebookstore.booksstore.exception.ErrorMessage;
import com.knowledgebookstore.booksstore.exception.NoBookFoundException;
import com.knowledgebookstore.booksstore.exception.UnableToCreateResourceException;
import com.knowledgebookstore.booksstore.exception.UnableToDeleteResourceException;
import com.knowledgebookstore.booksstore.exception.UnableToUpdateResourceException;

@ControllerAdvice
public class ApplicationExceptionHandler extends ResponseEntityExceptionHandler{

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
            HttpHeaders headers, HttpStatusCode status, WebRequest request) {
        // TODO Auto-generated method stub
        List<String> errors = new ArrayList<>();
        for(ObjectError error:ex.getBindingResult().getAllErrors()){
            errors.add(error.getDefaultMessage());
        }
        return new ResponseEntity<>(new ErrorMessage(errors), HttpStatus.BAD_REQUEST);
    }
    
    @ExceptionHandler(NoBookFoundException.class)
    public ResponseEntity<Object> handleNoBookFoundException(NoBookFoundException ex){
        ErrorMessage message = new ErrorMessage(Arrays.asList(ex.getLocalizedMessage()));
        return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(UnableToCreateResourceException.class)
    public ResponseEntity<Object> handleUnableToCreateResourceException(UnableToCreateResourceException ex){
        ErrorMessage error = new ErrorMessage(Arrays.asList(ex.getLocalizedMessage()));
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }


    @ExceptionHandler(UnableToDeleteResourceException.class)
    public ResponseEntity<Object> handleUnableToDeleteResourceException(UnableToDeleteResourceException ex){
        ErrorMessage error = new ErrorMessage(Arrays.asList(ex.getLocalizedMessage()));
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(UnableToUpdateResourceException.class)
    public ResponseEntity<Object> handleUnableToUpdateResourceException(UnableToUpdateResourceException ex){
        ErrorMessage error = new ErrorMessage(Arrays.asList(ex.getLocalizedMessage()));
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}
