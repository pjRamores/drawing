package com.creditsuisse.drawing.control;

import com.creditsuisse.drawing.exception.InvalidCommandException;
import com.creditsuisse.drawing.model.Canvas;

public class CreateCanvasCommand extends Command {

    @Override
    public Canvas execute(Canvas canvas) {
        String [] arr = input.split(" ");
        if(arr.length != 2) {
            throw new InvalidCommandException("Create canvas command has 2 integer parameters for width and height");
        }

        int width = 0;
        int height = 0;

        try {
            width = Integer.parseInt(arr[0]);
        } catch (NumberFormatException e) {
            throw new InvalidCommandException("Invalid width");
        }

        if(width < Canvas.MIN_WIDTH) {
            throw new InvalidCommandException("Less than minimum width of 3");
        } else if(width > Canvas.MAX_WIDTH) {
            throw new InvalidCommandException("Exceeded maximum width of 150");
        }

        try {
            height = Integer.parseInt(arr[1]);
        } catch (NumberFormatException e) {
            throw new InvalidCommandException("Invalid height");
        }

        if(height < Canvas.MIN_HEIGHT) {
            throw new InvalidCommandException("Less than minimum height of 3");
        } else if(height > Canvas.MAX_HEIGHT) {
            throw new InvalidCommandException("Exceeded maximum height of 50");
        }

        return new Canvas(width, height);
    }

}
