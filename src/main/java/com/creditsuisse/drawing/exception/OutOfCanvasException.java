package com.creditsuisse.drawing.exception;

public class OutOfCanvasException extends RuntimeException {

    private static final long serialVersionUID = 8082394018600958176L;

    public OutOfCanvasException() {
        super("It is not allowed to draw outside of canvas");
    }

    public OutOfCanvasException(String message) {
        super(message);
    }

}
