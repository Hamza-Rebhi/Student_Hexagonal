package com.hamza.airbnb.user.application;

public class UserException extends RuntimeException{
    public UserException(String message) {
        super(message);
    }
}