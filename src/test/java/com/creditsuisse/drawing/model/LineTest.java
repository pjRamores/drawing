package com.creditsuisse.drawing.model;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.creditsuisse.drawing.util.TestUtil;

public class LineTest {

    private static char[][] canvas40x20;

    @BeforeClass
    public static void setupClass() {
        canvas40x20 = TestUtil.init40x20CanvasWithLines();
        TestUtil.print(canvas40x20);
    }

    @Test
    public void testDrawLineLeftToRightTopToBottom() {
        Canvas canvas = new Canvas(40, 20);
        assertNotEquals(canvas40x20, canvas.getPixels());

        // draw vertical lines from top to bottom
        canvas.draw(new Line(6, 1, 6, 19));
        canvas.draw(new Line(12, 6, 12, 16));
        canvas.draw(new Line(18, 17, 18, 19));
        canvas.draw(new Line(20, 8, 20, 14));
        canvas.draw(new Line(30, 1, 30, 4));

        // draw horizontal lines from left to right
        canvas.draw(new Line(14, 1, 24, 1));
        canvas.draw(new Line(33, 2, 38, 2));
        canvas.draw(new Line(1, 3, 38, 3));
        canvas.draw(new Line(17, 6, 34, 6));
        canvas.draw(new Line(17, 10, 29, 10));
        canvas.draw(new Line(1, 17, 7, 17));
        canvas.draw(new Line(24, 17, 38, 17));

        assertArrayEquals(canvas40x20, canvas.getPixels());
    }

    @Test
    public void testDrawLineRightToLeftBottomToTop() {
        Canvas canvas = new Canvas(40, 20);
        assertNotEquals(canvas40x20, canvas.getPixels());

        // draw vertical lines from bottom to top
        canvas.draw(new Line(6, 19, 6, 1));
        canvas.draw(new Line(12, 16, 12, 6));
        canvas.draw(new Line(18, 19, 18, 17));
        canvas.draw(new Line(20, 14, 20, 8));
        canvas.draw(new Line(30, 4, 30, 1));

        // draw horizontal lines from right to left
        canvas.draw(new Line(24, 1, 14, 1));
        canvas.draw(new Line(38, 2, 33, 2));
        canvas.draw(new Line(38, 3, 1, 3));
        canvas.draw(new Line(34, 6, 17, 6));
        canvas.draw(new Line(29, 10, 17, 10));
        canvas.draw(new Line(7, 17, 1, 17));
        canvas.draw(new Line(38, 17, 24, 17));

        assertArrayEquals(canvas40x20, canvas.getPixels());
    }

    @Test
    public void testDrawLineOutOfCanvasLeftToRightTopToBottom() {
        Canvas canvas = new Canvas(40, 20);
        assertNotEquals(canvas40x20, canvas.getPixels());

        // draw vertical lines from top to bottom
        canvas.draw(new Line(6, -10, 6, 30));
        canvas.draw(new Line(12, 6, 12, 16));
        canvas.draw(new Line(18, 17, 18, 50));
        canvas.draw(new Line(20, 8, 20, 14));
        canvas.draw(new Line(30, -5, 30, 4));

        // draw horizontal lines from left to right
        canvas.draw(new Line(14, 1, 24, 1));
        canvas.draw(new Line(33, 2, 55, 2));
        canvas.draw(new Line(-15, 3, 100, 3));
        canvas.draw(new Line(17, 6, 34, 6));
        canvas.draw(new Line(17, 10, 29, 10));
        canvas.draw(new Line(0, 17, 7, 17));
        canvas.draw(new Line(24, 17, 45, 17));

        assertArrayEquals(canvas40x20, canvas.getPixels());
    }

    @Test
    public void testDrawLineOutOfCanvasRightToLeftBottomToTop() {
        Canvas canvas = new Canvas(40, 20);
        assertNotEquals(canvas40x20, canvas.getPixels());

        // draw vertical lines from top to bottom
        canvas.draw(new Line(6, 30, 6, -10));
        canvas.draw(new Line(12, 16, 12, 6));
        canvas.draw(new Line(18, 50, 18, 17));
        canvas.draw(new Line(20, 14, 20, 8));
        canvas.draw(new Line(30, 4, 30, -5));

        // draw horizontal lines from left to right
        canvas.draw(new Line(24, 1, 14, 1));
        canvas.draw(new Line(55, 2, 33, 2));
        canvas.draw(new Line(100, 3, -15, 3));
        canvas.draw(new Line(34, 6, 17, 6));
        canvas.draw(new Line(29, 10, 17, 10));
        canvas.draw(new Line(7, 17, 0, 17));
        canvas.draw(new Line(45, 17, 24, 17));

        assertArrayEquals(canvas40x20, canvas.getPixels());
    }

}
