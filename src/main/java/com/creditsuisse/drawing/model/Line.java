package com.creditsuisse.drawing.model;

import static java.util.stream.IntStream.*;

import com.creditsuisse.drawing.exception.NotSupportedException;

public class Line extends DrawingElement {

    private Point point1;
    private Point point2;

    public Line(int x1, int y1, int x2, int y2) {
        point1 = new Point(x1 < 1 ? 1 : x1, y1 < 1 ? 1 : y1);
        point2 = new Point(x2 < 1 ? 1 : x2, y2 < 1 ? 1 : y2);

        if(point1.compareTo(point2) < 0) {
            swap(point1, point2);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        int x1 = Math.min(point1.getX(), canvas.getPixels()[0].length-1);
        int y1 = Math.min(point1.getY(), canvas.getPixels().length-1);
        int x2 = Math.min(point2.getX(), canvas.getPixels()[0].length-1);
        int y2 = Math.min(point2.getY(), canvas.getPixels().length-1);

        if (y1 == y2) {
            /** draw horizontal line */
            int start = Math.min(x1, x2);
            int width = start + Math.abs(x1 - x2);
            rangeClosed(start, width).forEach(i -> canvas.setPoint(i, y1, DISPLAY_CHARACTER));
        } else if (x1 == x2) {
            /** draw vertical line */
            int start = Math.min(y1, y2);
            int length = start + Math.abs(y1 - y2);
            rangeClosed(start, length).forEach(i -> canvas.setPoint(x1, i, DISPLAY_CHARACTER));
        } else {
            throw new NotSupportedException("Diagonal line is not supported");
        }
    }
}
