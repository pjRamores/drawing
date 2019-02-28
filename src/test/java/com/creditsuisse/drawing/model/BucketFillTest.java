package com.creditsuisse.drawing.model;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import com.creditsuisse.drawing.util.TestUtil;

public class BucketFillTest {

    private static char[][] canvas40x20;

    @Test
    public void testBoundedColor() {
        canvas40x20 = TestUtil.init40x20CanvasWithBoundedColor();
        TestUtil.print(canvas40x20);

        Canvas canvas = initCanvas();
        assertNotEquals(canvas40x20, canvas.getPixels());

        canvas.draw(new BucketFill(1, 1, '*'));
        canvas.draw(new BucketFill(13, 9, '*'));
        canvas.draw(new BucketFill(35, 18, '*'));
        assertArrayEquals(canvas40x20, canvas.getPixels());
    }

    @Test
    public void testUnboundedColor() {
        canvas40x20 = TestUtil.init40x20CanvasWithUnboundedColor();
        TestUtil.print(canvas40x20);

        Canvas canvas = initCanvas();
        assertNotEquals(canvas40x20, canvas.getPixels());

        canvas.draw(new BucketFill(20, 5, '*'));
        assertArrayEquals(canvas40x20, canvas.getPixels());
    }

    @Test
    public void testBucketFillInBorder() {
        canvas40x20 = TestUtil.init40x20CanvasWithRectangles();
        TestUtil.print(canvas40x20);

        Canvas canvas = initCanvas();
        assertArrayEquals(canvas40x20, canvas.getPixels());

        canvas.draw(new BucketFill(0, 0, '*'));
        assertArrayEquals(canvas40x20, canvas.getPixels());

        canvas.draw(new BucketFill(15, 6, '*'));
        assertArrayEquals(canvas40x20, canvas.getPixels());
    }

    private Canvas initCanvas() {
        Canvas canvas = new Canvas(40, 20);
        canvas.draw(new Rectangle(0, 0, 8, 4));
        canvas.draw(new Rectangle(31, 0, 39, 4));
        canvas.draw(new Rectangle(12, 6, 18, 13));
        canvas.draw(new Rectangle(22, 8, 38, 12));
        canvas.draw(new Rectangle(0, 15, 8, 19));
        canvas.draw(new Rectangle(31, 15, 39, 19));
        return canvas;
    }

}
