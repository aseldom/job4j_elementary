package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP1K7Square0dot027() {
        double expected = 0.027;
        int p = 1;
        double k = 7;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP9K21Square0dot87() {
        double expected = 0.87;
        int p = 9;
        double k = 21;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

}