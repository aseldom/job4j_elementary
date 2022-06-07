package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when14to25then1dot41() {
        double expected = 1.41;
        int x1 = 1;
        int y1 = 4;
        int x2 = 2;
        int y2 = 5;
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when39to86then5dot83() {
        double expected = 5.83;
        int x1 = 3;
        int y1 = 9;
        int x2 = 8;
        int y2 = 6;
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when32to99then9dot21() {
        double expected = 9.21;
        int x1 = 3;
        int y1 = 2;
        int x2 = 9;
        int y2 = 9;
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}