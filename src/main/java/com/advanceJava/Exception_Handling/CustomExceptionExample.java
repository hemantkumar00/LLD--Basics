package com.advanceJava.Exception_Handling;

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            throw new CustomException("Custom exception message");
        } catch (CustomException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }
}

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}