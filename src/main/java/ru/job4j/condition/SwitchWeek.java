package ru.job4j.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String name;
        name = switch (day) {
            case 1 -> "понедельник";
            case 2 -> "вторник";
            case 3 -> "среда";
            case 4 -> "четверг";
            case 5 -> "пятница";
            case 6 -> "суббота";
            case 7 -> "воскресенье";
            default -> "Ошибка";
        };
        return name;
    }
}
