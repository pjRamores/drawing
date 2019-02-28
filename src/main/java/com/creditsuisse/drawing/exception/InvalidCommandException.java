package com.creditsuisse.drawing.exception;

public class InvalidCommandException extends RuntimeException {

    private static final long serialVersionUID = 169663310604781693L;

    public InvalidCommandException() {
        super("Invalid command");
    }

    public InvalidCommandException(String message) {
        super(message);
    }

}
