package org.example;

public class UsernameTakenException extends RuntimeException {
    public UsernameTakenException(String username) {
        super("username " +username + " is taken");
    }
}
