package com.creditsuisse.drawing;

import java.util.Scanner;

import com.creditsuisse.drawing.control.CommandFactory;
import com.creditsuisse.drawing.model.Canvas;
import com.creditsuisse.drawing.util.Util;

public class DrawingApp {

    public static void main(String... args) {
        Util.clearConsole();
        Canvas canvas = null;

        Scanner in = new Scanner(System.in);
        boolean quit = false;

        while (!quit) {
            try {
                displayInstructions();
                String input = in.nextLine();

                if(CommandFactory.QUIT.equals(input)) {
                    quit = true;
                } else {
                    Util.clearConsole();
                    canvas = CommandFactory.get(input).execute(canvas);
                    canvas.paint();
                }
            } catch (Exception e) {
                if(canvas != null) {
                    Util.clearConsole();
                    canvas.paint();
                }
                System.out.println("\n\nError message : " + e.getLocalizedMessage() + "\n");
            }
        }

        Util.clearConsole();
        System.out.println("\n\nProgram terminated...");

        in.close();
        System.exit(0);
    }

    private static void displayInstructions() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n=========================================================================================================");
        sb.append("\n| COMMANDS");
        sb.append("\n---------------------------------------------------------------------------------------------------------");
        sb.append("\n| 1) C w h         : Create new canvas with width w and height h");
        sb.append("\n| 2) L x1 y1 x2 y2 : Create new line from (x1,y1) to (x2,y2)");
        sb.append("\n| 3) R x1 y1 x2 y2 : Create new rectangle, whose one corner is (x1,y1) and opposite corner is (x2,y2)");
        sb.append("\n| 4) B x y c       : Bucket fill the entire area connected to (x,y) with \"colour\" c");
        sb.append("\n| 5) Q             : Quit the program");
        sb.append("\n=========================================================================================================");
        sb.append("\n\n Enter command: ");
        System.out.print(sb);
    }

}
