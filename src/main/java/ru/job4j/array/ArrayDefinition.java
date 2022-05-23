package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Nikolay Petorv";
        names[1] = "Boris Smirnov";
        names[2] = "Vladimir Popov";
        names[3] = "Anatoliy Godunov";
        for (int i = 0; i < 4; i++) {
            System.out.println(names[i]);
        }
    }
}
