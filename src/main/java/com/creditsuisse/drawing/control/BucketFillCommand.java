package com.creditsuisse.drawing.control;

import com.creditsuisse.drawing.exception.InvalidCommandException;
import com.creditsuisse.drawing.exception.NoCanvasException;
import com.creditsuisse.drawing.model.BucketFill;
import com.creditsuisse.drawing.model.Canvas;
import com.creditsuisse.drawing.util.Util;

public class BucketFillCommand extends Command {

    @Override
    public Canvas execute(Canvas canvas) {
        if(canvas == null) {
            throw new NoCanvasException();
        }

        String[] arr = input.split(" ");
        if (arr.length != 3) {
            throw new InvalidCommandException(
                    "Bucket fill command has 2 integer parameters for point 1 (x, y) coordinate and 1 character for color");
        }

        int x = 0;
        int y = 0;
        char color;

        try {
            x = Integer.parseInt(arr[0]);
        } catch (NumberFormatException e) {
            throw new InvalidCommandException("Invalid x coordinate");
        }

        try {
            y = Integer.parseInt(arr[1]);
        } catch (NumberFormatException e) {
            throw new InvalidCommandException("Invalid y coordinate");
        }

        if(!Util.isNonWhitespaceCharacter(arr[2])) {
            throw new InvalidCommandException("Invalid color, only non-whitespace character is allowed");
        } else {
            color = arr[2].charAt(0);
        }

        canvas.draw(new BucketFill(x, y, color));

        return canvas;
    }

}
