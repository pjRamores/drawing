package com.creditsuisse.drawing.util;

import java.util.Arrays;

public class Util {

    public static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                System.out.print("\033[H\033[2J");  
                System.out.flush();
                Runtime.getRuntime().exec("cmd /c cls");
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int min(int...i) {
        return Arrays.stream(i).min().orElse(0);
    }

    public static boolean isBlankOrNull(String str) {
        return str == null || str.length() == 0;
    }

    public static boolean isNonWhitespaceCharacter(String ch) {
        return ch != null && ch.length() == 1 && !ch.matches("^[\\s]{1}$");
    }
}
