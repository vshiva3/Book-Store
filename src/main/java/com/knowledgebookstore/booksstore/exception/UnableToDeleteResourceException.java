package com.knowledgebookstore.booksstore.exception;

public class UnableToDeleteResourceException extends RuntimeException {
    public UnableToDeleteResourceException(String book){
        super("Neither resource "+book+" is not available or unable to delete");
    }
}
