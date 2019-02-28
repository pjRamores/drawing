package com.creditsuisse.drawing.model;

import static java.util.stream.IntStream.range;

import lombok.*;

public class Canvas {

    public static final int MAX_WIDTH = 150;
    public static final int MIN_WIDTH = 3;
    public static final int MAX_HEIGHT = 50;
    public static final int MIN_HEIGHT = 3;

    @Getter
    private char [][] pixels;

    public Canvas(int width, int height) {
        pixels = new char[height][width];
        range(0, width).forEach(i -> {
            pixels[0][i] = '-';
            pixels[height-1][i] = '-';
            if(i == 0) {
                range(1, height-1).forEach(j -> pixels[j][0] = '|');
            } else if(i == width-1) {
                range(1, height-1).forEach(j -> pixels[j][width-1] = '|');
            } else {
                range(1, height-1).forEach(j -> pixels[j][i] = ' ');
            }
        });
    }

    public void draw(DrawingElement element) {
        element.draw(this);
    }

    /**
     * Sets the character in the specified point. Does not allow overriding.
     */
    public void setPoint(int x, int y, char ch) {
        if(pixels[y][x] == ' ' || pixels[y][x] == '\u0000') {
            pixels[y][x] = ch;
        }
    }

    public void paint() {
        StringBuilder sb = new StringBuilder();
        range(0, pixels.length).forEach(i -> {
            sb.append("\n").append(new String(pixels[i]));
        });
        System.out.println(sb.toString());
    }

}
