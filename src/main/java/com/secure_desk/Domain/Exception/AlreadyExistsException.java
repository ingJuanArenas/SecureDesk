package com.secure_desk.Domain.Exception;

public class AlreadyExistsException  extends RuntimeException {
    public AlreadyExistsException(String message) {
        super(message);
    }
    
}
