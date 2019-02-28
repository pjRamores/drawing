package com.creditsuisse.drawing.model;

import com.creditsuisse.drawing.exception.OutOfCanvasException;

public class BucketFill extends DrawingElement {

    private Point point;
    private char color;

    public BucketFill(int x, int y, char color) {
        point = new Point(x, y);
        this.color = color;
    }

    @Override
    public void draw(Canvas canvas) {
        if (isPointOutsideCanvas(canvas, point.getX(), point.getY())) {
            throw new OutOfCanvasException("Invalid bucket fill coordinates");
        }

        fillColor(canvas, point.getX(), point.getY());
    }

    private void fillColor(Canvas canvas, int x, int y) {
        /** fill only blank space within canvas - exit condition of recursive method */
        if(isPointOutsideCanvas(canvas, x, y)
                || (canvas.getPixels()[y][x] != ' ' && canvas.getPixels()[y][x] != '\u0000')) {
            return;
        }

        canvas.setPoint(x, y, color);
        fillColor(canvas, x+1, y);
        fillColor(canvas, x, y+1);
        fillColor(canvas, x-1, y);
        fillColor(canvas, x, y-1);
    }

    private boolean isPointOutsideCanvas(Canvas canvas, int x, int y) {
        return x < 0
                || x >= canvas.getPixels()[0].length
                || y < 0
                || y >= canvas.getPixels().length;
    }

}
