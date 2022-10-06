package com.example.demo12.exeptions;

public class BadPersonNumberException extends RuntimeException{
    public BadPersonNumberException(String message) {
        super(message);
    }
}
