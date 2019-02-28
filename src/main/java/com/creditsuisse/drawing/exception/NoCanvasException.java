package com.creditsuisse.drawing.exception;

public class NoCanvasException extends RuntimeException {

    private static final long serialVersionUID = 137845920593217031L;

    public NoCanvasException() {
        super("No initialized canvas");
    }

}
