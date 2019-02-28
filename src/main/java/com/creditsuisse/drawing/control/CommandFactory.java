package com.creditsuisse.drawing.control;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.creditsuisse.drawing.exception.InvalidCommandException;
import com.creditsuisse.drawing.util.Util;

public class CommandFactory {

    public static final String QUIT = "Q";

    private static Map<Character, Command> commands = new ConcurrentHashMap<>();

    private CommandFactory() {}

    public static Command get(String input) {
        if (Util.isBlankOrNull(input)) {
            throw new InvalidCommandException();
        }

        char command = input.charAt(0);

        if (commands.get(command) == null) {
            switch (command) {
                case 'C':
                    commands.put(command, new CreateCanvasCommand());
                    break;
                case 'L':
                    commands.put(command, new DrawLineCommand());
                    break;
                case 'R':
                    commands.put(command, new DrawRectangleCommand());
                    break;
                case 'B':
                    commands.put(command, new BucketFillCommand());
                    break;
                default:
                    throw new InvalidCommandException();
            }
        }

        return commands.get(command).setInput(input.substring(2));
    }

}
