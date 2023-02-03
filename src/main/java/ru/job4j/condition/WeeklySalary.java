package ru.job4j.condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int salary = 0;
        for (int i = 0; i < 8; i++) {
            int day = switch (i) {
                case 0, 1, 2, 3, 4 -> hours[i] > 8 ? 80 + (hours[i] - 8) * 15 : hours[i] * 10;
                default -> hours[i] > 8 ? 160 + (hours[i] - 8) * 30 : hours[i] * 20;
            };
            salary += day;
        }
        return salary;
    }
}
