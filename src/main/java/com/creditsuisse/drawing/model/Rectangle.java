package com.creditsuisse.drawing.model;

import static java.util.stream.IntStream.*;

public class Rectangle extends DrawingElement {

    private Point point1;
    private Point point2;

    public Rectangle(int x1, int y1, int x2, int y2) {
        point1 = new Point(x1 < 0 ? 0 : x1, y1 < 0 ? 0 : y1);
        point2 = new Point(x2 < 0 ? 0 : x2, y2 < 0 ? 0 : y2);

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

        int start = Math.min(x1, x2);
        int width = start + Math.abs(x1 - x2);
        drawHorizontalLines(canvas, y1, y2, start, width);

        start = Math.min(y1, y2);
        int length = start + Math.abs(y1 - y2);
        drawVerticalLines(canvas, x1, x2, start, length);
    }

    private void drawHorizontalLines(Canvas canvas, final int y1, final int y2, final int startPoint, final int width) {
        range(startPoint, width).forEach(i -> {
            canvas.setPoint(i, y1, DISPLAY_CHARACTER);
            canvas.setPoint(i, y2, DISPLAY_CHARACTER);
        });
    }

    private void drawVerticalLines(Canvas canvas, final int x1, final int x2, final int startPoint, final int lenght) {
        rangeClosed(startPoint, lenght).forEach(i -> {
            canvas.setPoint(x1, i, DISPLAY_CHARACTER);
            canvas.setPoint(x2, i, DISPLAY_CHARACTER);
        });
    }
}
