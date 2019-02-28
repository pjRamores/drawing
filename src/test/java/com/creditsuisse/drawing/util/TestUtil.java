package com.creditsuisse.drawing.util;

import static java.util.stream.IntStream.*;

public class TestUtil {

    public static char[][] init40x20Canvas() {
        return new char[][] {
            "----------------------------------------".toCharArray(),
            "|                                      |".toCharArray(),
            "|                                      |".toCharArray(),
            "|                                      |".toCharArray(),
            "|                                      |".toCharArray(),
            "|                                      |".toCharArray(),
            "|                                      |".toCharArray(),
            "|                                      |".toCharArray(),
            "|                                      |".toCharArray(),
            "|                                      |".toCharArray(),
            "|                                      |".toCharArray(),
            "|                                      |".toCharArray(),
            "|                                      |".toCharArray(),
            "|                                      |".toCharArray(),
            "|                                      |".toCharArray(),
            "|                                      |".toCharArray(),
            "|                                      |".toCharArray(),
            "|                                      |".toCharArray(),
            "|                                      |".toCharArray(),
            "----------------------------------------".toCharArray()
        };
    }

    public static char[][] init40x20CanvasWithLines() {
        return new char[][] {
            "----------------------------------------".toCharArray(),
            "|     X       XXXXXXXXXXX     X        |".toCharArray(),
            "|     X                       X  XXXXXX|".toCharArray(),
            "|XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX|".toCharArray(),
            "|     X                       X        |".toCharArray(),
            "|     X                                |".toCharArray(),
            "|     X     X    XXXXXXXXXXXXXXXXXX    |".toCharArray(),
            "|     X     X                          |".toCharArray(),
            "|     X     X       X                  |".toCharArray(),
            "|     X     X       X                  |".toCharArray(),
            "|     X     X    XXXXXXXXXXXXX         |".toCharArray(),
            "|     X     X       X                  |".toCharArray(),
            "|     X     X       X                  |".toCharArray(),
            "|     X     X       X                  |".toCharArray(),
            "|     X     X       X                  |".toCharArray(),
            "|     X     X                          |".toCharArray(),
            "|     X     X                          |".toCharArray(),
            "|XXXXXXX          X     XXXXXXXXXXXXXXX|".toCharArray(),
            "|     X           X                    |".toCharArray(),
            "----------------------------------------".toCharArray()
        };
    }

    public static char[][] init40x20CanvasWithRectangles() {
        return new char[][] {
            "----------------------------------------".toCharArray(),
            "|       X                      X       |".toCharArray(),
            "|       X                      X       |".toCharArray(),
            "|       X                      X       |".toCharArray(),
            "|XXXXXXXX                      XXXXXXXX|".toCharArray(),
            "|                                      |".toCharArray(),
            "|           XXXXXXX                    |".toCharArray(),
            "|           X     X                    |".toCharArray(),
            "|           X     X   XXXXXXXXXXXXXXXXX|".toCharArray(),
            "|           X     X   X               X|".toCharArray(),
            "|           X     X   X               X|".toCharArray(),
            "|           X     X   X               X|".toCharArray(),
            "|           X     X   XXXXXXXXXXXXXXXXX|".toCharArray(),
            "|           XXXXXXX                    |".toCharArray(),
            "|                                      |".toCharArray(),
            "|XXXXXXXX                      XXXXXXXX|".toCharArray(),
            "|       X                      X       |".toCharArray(),
            "|       X                      X       |".toCharArray(),
            "|       X                      X       |".toCharArray(),
            "----------------------------------------".toCharArray()
        };
    }

    public static char[][] init40x20CanvasWithBoundedColor() {
        return new char[][] {
            "----------------------------------------".toCharArray(),
            "|*******X                      X       |".toCharArray(),
            "|*******X                      X       |".toCharArray(),
            "|*******X                      X       |".toCharArray(),
            "|XXXXXXXX                      XXXXXXXX|".toCharArray(),
            "|                                      |".toCharArray(),
            "|           XXXXXXX                    |".toCharArray(),
            "|           X*****X                    |".toCharArray(),
            "|           X*****X   XXXXXXXXXXXXXXXXX|".toCharArray(),
            "|           X*****X   X               X|".toCharArray(),
            "|           X*****X   X               X|".toCharArray(),
            "|           X*****X   X               X|".toCharArray(),
            "|           X*****X   XXXXXXXXXXXXXXXXX|".toCharArray(),
            "|           XXXXXXX                    |".toCharArray(),
            "|                                      |".toCharArray(),
            "|XXXXXXXX                      XXXXXXXX|".toCharArray(),
            "|       X                      X*******|".toCharArray(),
            "|       X                      X*******|".toCharArray(),
            "|       X                      X*******|".toCharArray(),
            "----------------------------------------".toCharArray()
        };
    }

    public static char[][] init40x20CanvasWithUnboundedColor() {
        return new char[][] {
            "----------------------------------------".toCharArray(),
            "|       X**********************X       |".toCharArray(),
            "|       X**********************X       |".toCharArray(),
            "|       X**********************X       |".toCharArray(),
            "|XXXXXXXX**********************XXXXXXXX|".toCharArray(),
            "|**************************************|".toCharArray(),
            "|***********XXXXXXX********************|".toCharArray(),
            "|***********X     X********************|".toCharArray(),
            "|***********X     X***XXXXXXXXXXXXXXXXX|".toCharArray(),
            "|***********X     X***X               X|".toCharArray(),
            "|***********X     X***X               X|".toCharArray(),
            "|***********X     X***X               X|".toCharArray(),
            "|***********X     X***XXXXXXXXXXXXXXXXX|".toCharArray(),
            "|***********XXXXXXX********************|".toCharArray(),
            "|**************************************|".toCharArray(),
            "|XXXXXXXX**********************XXXXXXXX|".toCharArray(),
            "|       X**********************X       |".toCharArray(),
            "|       X**********************X       |".toCharArray(),
            "|       X**********************X       |".toCharArray(),
            "----------------------------------------".toCharArray()
        };
    }

    public static void print(char[][] canvas) {
        StringBuilder sb = new StringBuilder();
        range(0, canvas.length).forEach(i -> {
            sb.append("\n").append(new String(canvas[i]));
        });
        System.out.println(sb.toString());
    }

}
