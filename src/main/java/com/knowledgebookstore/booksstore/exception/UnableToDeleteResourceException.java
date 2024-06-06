package com.knowledgebookstore.booksstore.exception;

public class UnableToDeleteResourceException extends RuntimeException {
    public UnableToDeleteResourceException(){
        super("Unable to delete resource");
    }
}
