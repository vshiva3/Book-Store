package com.knowledgebookstore.booksstore.exception;

public class UnableToCreateResourceException extends RuntimeException{
    public UnableToCreateResourceException(){
        super("Unable to create resource");
    }
}
