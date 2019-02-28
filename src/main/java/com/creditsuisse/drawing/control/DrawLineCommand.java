package com.creditsuisse.drawing.control;

import com.creditsuisse.drawing.exception.InvalidCommandException;
import com.creditsuisse.drawing.exception.NoCanvasException;
import com.creditsuisse.drawing.model.Canvas;
import com.creditsuisse.drawing.model.Line;

public class DrawLineCommand extends Command {

    @Override
    public Canvas execute(Canvas canvas) {
        if(canvas == null) {
            throw new NoCanvasException();
        }

        String[] arr = input.split(" ");
        if (arr.length != 4) {
            throw new InvalidCommandException(
                    "Draw line command has 4 integer parameters for point 1 (x1, y1) and point 2 (x2, y2) coordinates");
        }

        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;

        try {
            x1 = Integer.parseInt(arr[0]);
        } catch (NumberFormatException e) {
            throw new InvalidCommandException("Invalid x1");
        }

        try {
            y1 = Integer.parseInt(arr[1]);
        } catch (NumberFormatException e) {
            throw new InvalidCommandException("Invalid y1");
        }

        try {
            x2 = Integer.parseInt(arr[2]);
        } catch (NumberFormatException e) {
            throw new InvalidCommandException("Invalid x2");
        }

        try {
            y2 = Integer.parseInt(arr[3]);
        } catch (NumberFormatException e) {
            throw new InvalidCommandException("Invalid y2");
        }

        canvas.draw(new Line(x1, y1, x2, y2));

        return canvas;
    }

}
