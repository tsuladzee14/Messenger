package org.example;

public class InvalidCommandException extends RuntimeException {
    public InvalidCommandException(String message) {
        super("unknown command:" + message);
    }
}
