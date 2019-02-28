package com.creditsuisse.drawing.model;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.creditsuisse.drawing.util.TestUtil;

public class CanvasTest {

    private static char[][] canvas40x20;

    @BeforeClass
    public static void setupClass() {
        canvas40x20 = TestUtil.init40x20Canvas();
        TestUtil.print(canvas40x20);
    }

    @Test
    public void testCanvasWithSameSize() {
        Canvas canvas = new Canvas(40, 20);
        assertArrayEquals(canvas40x20, canvas.getPixels());
    }

    @Test
    public void testCanvasWithDifferentSize() {
        assertNotEquals(canvas40x20, new Canvas(10, 10).getPixels());
    }

}
