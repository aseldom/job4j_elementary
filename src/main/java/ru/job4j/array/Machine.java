package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int change = money - price;
        int coins10 = change / coins[0];
        int coins5 = (change % coins[0]) / coins[1];
        int coins2 = (change % coins[0] % coins[1]) / coins[2];
        int coins1 = change % coins[0] % coins[1] % coins[2];
        int size = coins10 + coins5 + coins2 + coins1;
        int[] rsl = new int[size];
        for (int i = 0; i < size; i++) {
            if (i < coins10) {
                rsl[i] = coins[0];
            } else if (i < coins10 + coins5) {
                rsl[i] = coins[1];
            } else if (i < coins10 + coins5 + coins2) {
                rsl[i] = coins[2];
            } else {
                rsl[i] = coins[3];
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}