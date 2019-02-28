package com.creditsuisse.drawing.model;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.creditsuisse.drawing.util.TestUtil;

public class RectangleTest {

    private static char[][] canvas40x20;

    @BeforeClass
    public static void setupClass() {
        canvas40x20 = TestUtil.init40x20CanvasWithRectangles();
        TestUtil.print(canvas40x20);
    }

    @Test
    public void testDrawRectangles() {
        Canvas canvas = new Canvas(40, 20);
        assertNotEquals(canvas40x20, canvas.getPixels());

        canvas.draw(new Rectangle(0, 0, 8, 4));
        canvas.draw(new Rectangle(31, 0, 39, 4));
        canvas.draw(new Rectangle(12, 6, 18, 13));
        canvas.draw(new Rectangle(22, 8, 38, 12));
        canvas.draw(new Rectangle(0, 15, 8, 19));
        canvas.draw(new Rectangle(31, 15, 39, 19));

        assertArrayEquals(canvas40x20, canvas.getPixels());
    }

    @Test
    public void testDrawRectanglesReverseDirection() {
        Canvas canvas = new Canvas(40, 20);
        assertNotEquals(canvas40x20, canvas.getPixels());

        canvas.draw(new Rectangle(8, 4, 0, 0));
        canvas.draw(new Rectangle(39, 4, 31, 0));
        canvas.draw(new Rectangle(18, 13, 12, 6));
        canvas.draw(new Rectangle(38, 12, 22, 8));
        canvas.draw(new Rectangle(8, 19, 0, 15));
        canvas.draw(new Rectangle(39, 19, 31, 15));

        assertArrayEquals(canvas40x20, canvas.getPixels());
    }

    @Test
    public void testDrawRectanglesOutOfCanvas() {
        Canvas canvas = new Canvas(40, 20);
        assertNotEquals(canvas40x20, canvas.getPixels());

        canvas.draw(new Rectangle(-10, -10, 8, 4));
        canvas.draw(new Rectangle(31, 0, 100, 4));
        canvas.draw(new Rectangle(12, 6, 18, 13));
        canvas.draw(new Rectangle(22, 8, 38, 12));
        canvas.draw(new Rectangle(-50, 15, 8, 200));
        canvas.draw(new Rectangle(31, 15, 150, 300));

        assertArrayEquals(canvas40x20, canvas.getPixels());
    }

    @Test
    public void testDrawRectanglesReverseDirectionOutOfCanvas() {
        Canvas canvas = new Canvas(40, 20);
        assertNotEquals(canvas40x20, canvas.getPixels());

        canvas.draw(new Rectangle(8, 4, -10, -10));
        canvas.draw(new Rectangle(100, 4, 31, 0));
        canvas.draw(new Rectangle(18, 13, 12, 6));
        canvas.draw(new Rectangle(38, 12, 22, 8));
        canvas.draw(new Rectangle(8, 200, -50, 15));
        canvas.draw(new Rectangle(150, 300, 31, 15));

        assertArrayEquals(canvas40x20, canvas.getPixels());
    }

}
