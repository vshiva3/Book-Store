package com.knowledgebookstore.booksstore.exception;

import java.time.LocalDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ErrorMessage {
    
    private List<String> error;
    private LocalDateTime timeStamp;

    public ErrorMessage(List<String> message){
        this.timeStamp = LocalDateTime.now();
        this.error = message;
    }

    public void setTimeStamp(){
        this.timeStamp = LocalDateTime.now();
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm")
    public LocalDateTime getTimeStamp(){
        return this.timeStamp;
    }

    public List<String> getError() {
        return this.error;
    }

    public void setError(List<String> message) {
        this.error = message;
    }

}
