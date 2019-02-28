package com.creditsuisse.drawing.model;

public abstract class DrawingElement {

    public static final char DISPLAY_CHARACTER = 'X';

    public abstract void draw(Canvas canvas);

    protected void swap(Point point1, Point point2) {
        Point temp = point1;
        point1 = point2;
        point2 = temp;
    }

}
