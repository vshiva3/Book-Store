package com.knowledgebookstore.booksstore.exception;

public class UnableToUpdateResourceException extends RuntimeException {
    public UnableToUpdateResourceException(){
        super("Unable to update resource");
    }
}
