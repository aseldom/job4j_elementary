package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean pattern = data[0];
        for (int i = 1; i < data.length - 1; i++) {
            if (pattern != data[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}