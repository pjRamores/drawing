package com.creditsuisse.drawing.model;

import lombok.Getter;

@Getter
public class Point extends DrawingElement implements Comparable<Point> {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.setPoint(x, y, DISPLAY_CHARACTER);
    }

    /**
     * Point ordering logic:
     * 1) with higher y-coordinate, if equal then
     * 2) with higher x-coordinate
     */
    @Override
    public int compareTo(Point o) {
        if(o == null) {
            return -1;
        }
        return o.getY() == y  ? o.getX() - x : o.getY() - y;
    }

}
