package com.creditsuisse.drawing.control;

import com.creditsuisse.drawing.model.Canvas;

public abstract class Command {

    protected String input;

    public Command setInput(String input) {
        this.input = input;
        return this;
    }

    public abstract Canvas execute(Canvas canvas);

}
