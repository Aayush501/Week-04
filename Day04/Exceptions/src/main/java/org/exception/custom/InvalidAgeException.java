package org.exception.custom;

public class InvalidAgeException extends RuntimeException {
    public InvalidAgeException() {
        super("Age must be 18 or above");
    }
}
